package br.com.ifce.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.ifce.domain.Car;
import br.com.ifce.domain.CarService;
import br.com.ifce.domain.Response;


@Path("/cars")
@Produces(MediaType.APPLICATION_JSON+";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON+";charset=utf-8")
@Component
public class CarsResource {
	@Autowired
	private CarService carService;
	
	@GET
	public List<Car> get(){
		List<Car> cars = carService.getCars();
		return cars;
	}
	
	@GET
	@Path("{id}")
	public Car get(@PathParam("id") long id){
		Car car = carService.getCar(id);
		return car;
	}
	
	@GET
	@Path("/tipo/{type}")
	public List<Car> getByType(@PathParam("tipo") String type){
		List<Car> cars = carService.findByType(type);
		return cars;
	}
	
	@GET
	@Path("/nome/{nome}")
	public List<Car> getByNome(@PathParam("nome") String nome){
		List<Car> cars = carService.findByName(nome);
		return cars;
	}
	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") long id){
		carService.deleteCar(id);
		return Response.Ok("Car deletado sucess");
	}
	
	@POST
	public Response post(Car car){
		carService.save(car);
		return Response.Ok("Car save sucess");
	}
	
	@PUT
	public Response put(Car car){
		carService.save(car);
		return Response.Ok("Car update sucess");
	}
	
}
