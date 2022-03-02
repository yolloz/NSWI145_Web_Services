package org.example;

@javax.jws.WebService
public interface MoT {
    @javax.jws.WebMethod
    boolean registerVehicle(RegistrationRequest request) throws BadRequest;
}

