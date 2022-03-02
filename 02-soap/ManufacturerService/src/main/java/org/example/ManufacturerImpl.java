package org.example;

import javax.jws.WebService;

@WebService(endpointInterface = "org.example.Manufacturer")
public class ManufacturerImpl implements Manufacturer {
    @Override
    public CocResponse getCoc(String VIN) throws BadRequest {
        if (VIN == null || VIN.isEmpty()) {
            throw new BadRequest();
        }

        CocResponse response = new CocResponse();
        response.VIN = VIN;
        response.color = "BLUE";
        return response;
    }

    @Override
    public TechnicalDataResponse getTechnicalData(String VIN) throws BadRequest {
        if (VIN == null || VIN.isEmpty()) {
            throw new BadRequest();
        }

        TechnicalDataResponse response = new TechnicalDataResponse();
        response.VIN = VIN;
        response.engineDisplacement = 1996;
        response.fuelCode = 4;
        return response;
    }
}

