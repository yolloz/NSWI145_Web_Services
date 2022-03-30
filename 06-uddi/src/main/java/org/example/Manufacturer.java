package org.example;

@javax.jws.WebService
public interface Manufacturer {
    @javax.jws.WebMethod
    CocResponse getCoc(String VIN) throws BadRequest;
    @javax.jws.WebMethod
    TechnicalDataResponse getTechnicalData(String VIN) throws BadRequest;
}

