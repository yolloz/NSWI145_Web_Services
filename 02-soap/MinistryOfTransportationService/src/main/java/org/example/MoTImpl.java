package org.example;

import javax.jws.WebService;

@WebService(endpointInterface = "org.example.MoT")
public class MoTImpl implements MoT {
    @Override
    public boolean registerVehicle(RegistrationRequest request) throws BadRequest {
        if (request.getVIN() == null || request.getVIN().isEmpty() || request.getColor() == null
                || request.getColor().isEmpty() || request.getEngineDisplacement() < 0
                || request.getFuelCode() < 0 || request.getFuelCode() > 20) {
            throw new BadRequest();
        }
        return true;
    }
}

