
package org.example.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.1
 * 2022-03-23T11:40:33.310+01:00
 * Generated source version: 3.5.1
 */

@WebFault(name = "BadRequest", targetNamespace = "http://example.org/")
public class BadRequest_Exception extends Exception {

    private BadRequest faultInfo;

    public BadRequest_Exception() {
        super();
    }

    public BadRequest_Exception(String message) {
        super(message);
    }

    public BadRequest_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public BadRequest_Exception(String message, BadRequest badRequest) {
        super(message);
        this.faultInfo = badRequest;
    }

    public BadRequest_Exception(String message, BadRequest badRequest, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = badRequest;
    }

    public BadRequest getFaultInfo() {
        return this.faultInfo;
    }
}
