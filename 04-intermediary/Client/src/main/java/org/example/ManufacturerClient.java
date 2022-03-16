package org.example;

import javax.xml.namespace.QName;
import javax.xml.soap.*;

public class ManufacturerClient
{
    private static final String NS = "http://example.org/";
    private static final String endpoint = "http://127.0.0.1:8000/manufacturer";

    public Coc getCoc(String VIN) {
        try {
            SOAPConnectionFactory soapcf = SOAPConnectionFactory.newInstance();
            SOAPConnection soapc = soapcf.createConnection();

            MessageFactory mf = MessageFactory.newInstance();
            SOAPMessage soapm = mf.createMessage();

            SOAPPart soapp = soapm.getSOAPPart();
            SOAPEnvelope soape = soapp.getEnvelope();
            SOAPBody soapb = soape.getBody();

            soape.getHeader().detachNode();
            SOAPElement getCoc = soapb.addBodyElement(new QName(NS, "getCoc"));
            SOAPElement arg0 = getCoc.addChildElement(new QName(null, "arg0"));
            arg0.addTextNode(VIN);
            SOAPMessage response = soapc.call(soapm, endpoint);
            soapc.close();

            SOAPBody responseBody = response.getSOAPBody();
            if (responseBody.hasFault()) {
                System.err.println(responseBody.getFault().getFaultString());
            } else {
                SOAPBodyElement cocResponse = (SOAPBodyElement)
                        responseBody.getChildElements(new QName(NS, "getCocResponse")).next();
                SOAPBodyElement returnEl = (SOAPBodyElement)
                        cocResponse.getChildElements(new QName(null, "return")).next();
                String returnedVIN = ((SOAPElement) returnEl.getChildElements(new QName(null, "VIN")).next()).getValue();
                String returnedColor = ((SOAPElement) returnEl.getChildElements(new QName(null, "color")).next()).getValue();

                Coc coc = new Coc();
                coc.VIN = returnedVIN;
                coc.color = returnedColor;
                return coc;
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public TechnicalData getTechnicalData(String VIN) {
        try {
            SOAPConnectionFactory soapcf = SOAPConnectionFactory.newInstance();
            SOAPConnection soapc = soapcf.createConnection();

            MessageFactory mf = MessageFactory.newInstance();
            SOAPMessage soapm = mf.createMessage();

            SOAPPart soapp = soapm.getSOAPPart();
            SOAPEnvelope soape = soapp.getEnvelope();
            SOAPBody soapb = soape.getBody();

            soape.getHeader().detachNode();
            SOAPElement getCoc = soapb.addBodyElement(new QName(NS, "getTechnicalData"));
            SOAPElement arg0 = getCoc.addChildElement(new QName(null, "arg0"));
            arg0.addTextNode(VIN);
            SOAPMessage response = soapc.call(soapm, endpoint);
            soapc.close();

            SOAPBody responseBody = response.getSOAPBody();
            if (responseBody.hasFault()) {
                System.err.println(responseBody.getFault().getFaultString());
            } else {
                SOAPBodyElement cocResponse = (SOAPBodyElement)
                        responseBody.getChildElements(new QName(NS, "getTechnicalDataResponse")).next();
                SOAPBodyElement returnEl = (SOAPBodyElement)
                        cocResponse.getChildElements(new QName(null, "return")).next();
                String returnedVIN = ((SOAPElement) returnEl.getChildElements(new QName(null, "VIN")).next()).getValue();
                String returnedDisplacement = ((SOAPElement) returnEl.getChildElements(new QName(null, "engineDisplacement")).next()).getValue();
                String returnedFuel = ((SOAPElement) returnEl.getChildElements(new QName(null, "fuelCode")).next()).getValue();

                TechnicalData td = new TechnicalData();
                td.VIN = returnedVIN;
                td.engineDisplacement = Integer.parseInt(returnedDisplacement);
                td.fuelCode = Integer.parseInt(returnedFuel);
                return td;
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}
