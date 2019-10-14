package com.kodnito;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hello")
public class HelloWorldEndpoint {
    
    @GET
    public String hello() {
        return "Hello Jakarta EE World";
    }
}