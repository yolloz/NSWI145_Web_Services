package com.example.intermediary;

import org.apache.cxf.binding.soap.SoapHeader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.xml.namespace.QName;
import javax.xml.soap.*;

@WebServlet(name = "intermediaryServlet", value = "/intermediary")
public class IntermediaryServlet extends HttpServlet {
    private String message;
    private static final Path LOG_FILE = Paths.get("log.txt");
    private static final String NS = "http://example.org/";

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            MessageFactory mf = MessageFactory.newInstance();
            SOAPMessage soapm = mf.createMessage(null, request.getInputStream());

            QName logQName = new QName(NS, "log");
            SOAPHeader header = soapm.getSOAPHeader();

            String userLogin = null;
            if (header.hasChildNodes()) {
                Iterator<Node> logNodeIterator = header.getChildElements(logQName);
                if (logNodeIterator.hasNext()) {
                    Node logNode = logNodeIterator.next();
                    userLogin = logNode.getAttributes().getNamedItem("userLogin").getNodeValue();
                    header.removeChild(logNode);

                    SOAPBody body = soapm.getSOAPBody();
                    SOAPElement getCoc = (SOAPElement) body.getChildElements(new QName(NS, "getCoc")).next();
                    String VIN = ((SOAPElement) getCoc.getChildElements(new QName(null, "arg0")).next()).getValue();

                    // log user request
                    LocalDateTime now = LocalDateTime.now();
                    String message = now.format(DateTimeFormatter.ISO_DATE_TIME) + " [" + userLogin + "]: VIN " + VIN + System.lineSeparator();
                    Files.write(LOG_FILE, message.getBytes(), Files.exists(LOG_FILE) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
                }
            }
            if (userLogin == null) {
                System.out.println("Forwarding request, no header was provided.");
            }

            SOAPConnectionFactory soapcf = SOAPConnectionFactory.newInstance();
            SOAPConnection soapc = soapcf.createConnection();

            String endpoint = "http://127.0.0.1:8000/manufacturer";

            SOAPMessage soapResponse = soapc.call(soapm, endpoint);
            soapc.close();

            if (userLogin != null) {
                SOAPBody responseBody = soapResponse.getSOAPBody();

                QName logged = new QName(NS, "logged");
                QName level = new QName(NS, "level");
                SOAPPart sp = soapResponse.getSOAPPart();
                SOAPEnvelope se = sp.getEnvelope();
                SOAPHeader newHeader = se.getHeader();
                if (newHeader == null) {
                    newHeader = se.addHeader();
                }
                SOAPElement logHeader = newHeader.addChildElement(logged);
                if (responseBody.hasFault()) {
                    logHeader.addAttribute(level, "ERROR");
                    logHeader.addTextNode(responseBody.getFault().getFaultString());
                } else {
                    logHeader.addAttribute(level, "INFO");
                    logHeader.addTextNode("OK");
                }
            }

            soapResponse.writeTo(response.getOutputStream());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void destroy() {
    }
}