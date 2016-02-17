package br.com.ifce.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {
	@GET
	@Consumes(MediaType.TEXT_HTML)
	@Produces(MediaType.TEXT_HTML+";charset=utf-8")
	public String helloHTML(){
		return "<br> Ola mundo HTML!</br>";
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String helloTextPlain(){
		return "Ola mundo text";
	}
	
	@GET
	@Consumes({MediaType.APPLICATION_XML,MediaType.TEXT_XML})
	@Produces({MediaType.APPLICATION_XML,MediaType.TEXT_XML})
	public String helloXML(){
		return "Ola mundo XML!";
	}
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String helloJSON(){
		return "Ola mundo do JSON!";
	}
}
