package br.com.ifce.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloResource {
	@GET
	public String get(){
		return "HTTP GET";
	}
}
