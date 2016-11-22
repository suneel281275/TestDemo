package com.vminds.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.vminds.model.Customer;
import com.vminds.model.Status;
import com.vminds.services.DataServices;

@Controller
@RequestMapping("/Customer")
public class SpringRestController {
	
	@Autowired
	DataServices dataServices;
	
	static final Logger logger = Logger.getLogger(SpringRestController.class);
	
	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
	Status addCustomer(@RequestBody Customer customer){
		try {
			//ghghgjj
			dataServices.addEntity(customer);
			return new Status(1, "Employee added Successfully !");
		} catch (Exception e) {
			// e.printStackTrace();
			return new Status(0, e.toString());
		}
		
	}
	
	@RequestMapping(value = "/{cust_id}", method = RequestMethod.GET)
	public @ResponseBody
	Customer getCustomer(@PathVariable("cust_id") int id) {
		Customer customer = null;
		try {
			customer = dataServices.getEntityById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return customer;
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody
	List<Customer> getCustomer() {

		List<Customer> customerList = null;
		try {
			customerList = dataServices.getEntityList();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return customerList;
	}
	
	
	@RequestMapping(value = "/modify", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
	Status modifyEntity(@RequestBody Customer customer) {
		try{
		dataServices.modifyEntity(customer);
		return new Status(1, "Employee updated Successfully !");
		}catch(Exception e){
			return new Status(0, e.toString());
		}	
	}
	
	@RequestMapping(value = "delete/{cust_id}", method = RequestMethod.GET)
	public @ResponseBody
	Status deleteCustomer(@PathVariable("cust_id") int id) {
		try {
			dataServices.deleteEntity(id);
			return new Status(1, "Employee deleted Successfully !");
		} catch (Exception e) {
			return new Status(0, e.toString());
		}

	}

}
