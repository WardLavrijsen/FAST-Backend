package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class GreetingResource {

    @GET
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

}