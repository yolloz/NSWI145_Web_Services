package org.example;

import javax.jws.WebService;
import org.apache.juddi.v3.annotations.UDDIService;
import org.apache.juddi.v3.annotations.UDDIServiceBinding;

@UDDIService(businessKey = "uddi:${keyDomain}:${department}", serviceKey = "uddi:${keyDomain}:manufacturerservice", description = "Manufacturer service")
@UDDIServiceBinding(bindingKey = "uddi:${keyDomain}:manufacturerservice-wsdl", description = "WSDL endpoint for the manufacturer${department} Service. This service is used for "
		+ "testing the jUDDI annotation functionality", accessPointType = "wsdlDeployment", accessPoint = "http://${serverName}:${serverPort}/uddi-annotations/services/service?wsdl")
@WebService(endpointInterface = "org.example.Manufacturer", serviceName = "manufacturer")
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
