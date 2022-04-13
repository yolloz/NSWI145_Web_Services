package org.example;

import org.glassfish.jersey.server.ResourceConfig;

import jakarta.ws.rs.ApplicationPath;

@ApplicationPath("rest")
public class RestService extends ResourceConfig {
    public RestService() {
        packages("org.example");
    }
}
