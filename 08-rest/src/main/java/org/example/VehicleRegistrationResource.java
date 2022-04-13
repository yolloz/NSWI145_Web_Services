package org.example;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;

@Path("/register")
public class VehicleRegistrationResource {
	@Context
    UriInfo uriInfo;

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("{vin}")
    public Response getVehicleRegistration(@PathParam("vin") String vin) {
    	// This would return the current registration information for the vehicle
        return Response.created(uriInfo.getAbsolutePath())
                .status(Response.Status.OK)
                .entity(getVehicleJSON(vin, "blue", 1996, 4))
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON})
    public Response addVehicleRegistration(String request) {
    	// This would add the new vehicle registration and return the values that were accepted
        return Response.created(uriInfo.getAbsolutePath())
                .status(Response.Status.CREATED)
                .entity(request)
                .build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON})
    @Path("{vin}")
    public Response updateVehicleRegistration(@PathParam("vin") String vin, String request) {
        // This would change the existing registration, effectively performing an update
    	return Response.created(uriInfo.getAbsolutePath())
                .status(Response.Status.OK)
                .entity(request)
                .build();
    }

    @DELETE
    @Produces({MediaType.APPLICATION_JSON})
    @Path("{vin}")
    public Response removeVehicleRegistration(@PathParam("vin") String vin) {
    	// This would delete the registration and return JSON with result
    	return Response.created(uriInfo.getAbsolutePath())
                .status(Response.Status.OK)
                .entity("{\"result\":\"OK\"}")
                .build();
    }
    
    private String getVehicleJSON(String vin, String color, int engineDisplacement, int fuelCode) {    	
    	return String.format("{\"vin\":\"%s\",\"color\":\"%s\",\"engineDisplacement\":%d,\"fuelCode\":%d}", vin, color, engineDisplacement, fuelCode);
    }
}
