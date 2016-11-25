package com.vminds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vminds.model.CustomerInfo;
import com.vminds.services.UserServices;



@RestController
@RequestMapping("/CustomerInfo")
public class CustomerInfoContoller {
	
	@Autowired
	UserServices services;
	
	
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public ResponseEntity<List<CustomerInfo>> findAllCustomersInfo(){
		
		List<CustomerInfo> customers=services.findAllCustomersInfo();
		
		if(customers.isEmpty()){
			return new ResponseEntity<List<CustomerInfo>>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<List<CustomerInfo>>(customers,HttpStatus.OK);
		
	}
	
	
	
		

	
	

}
