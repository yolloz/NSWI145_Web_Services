package org.example;

import javax.jws.WebMethod;
import javax.jws.WebService;

@javax.jws.WebService(targetNamespace = "http://example.org")
public interface MoT {
    @WebMethod(operationName = "registerVehicle", action = "urn:RegisterVehicle")
	boolean registerVehicle(RegistrationRequest request) throws BadRequest;

    @WebMethod(operationName = "updateVehicle", action = "urn:UpdateVehicle")
	boolean updateVehicle(RegistrationRequest request) throws BadRequest;
}

