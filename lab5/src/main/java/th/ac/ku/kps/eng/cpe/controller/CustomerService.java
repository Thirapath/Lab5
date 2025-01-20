package th.ac.ku.kps.eng.cpe.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import th.ac.ku.kps.eng.cpe.dao.CustomerDAO;
import th.ac.ku.kps.eng.cpe.entity.Customer;

@Path("/services")
public class CustomerService {
	 CustomerDAO cusDao = new CustomerDAO();
	 @GET
	 @Path("/customers")
	 @Produces(MediaType.APPLICATION_JSON)
	 
	 public List<Customer> getUsers() {
		 return cusDao.getAllCustomers();
	 }
	 
	 @GET
	 @Path("/customers/{param}")
	 public Customer getCustomerByname(@PathParam("param") String name){
		 return cusDao.getCustomerByName(name);
	 }

}

