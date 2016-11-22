package com.vminds.services;

import java.util.List;

import com.vminds.model.Customer;

public interface DataServices {
	
	public boolean addEntity(Customer customer) throws Exception;
	public Customer getEntityById(long id) throws Exception;
	public List<Customer> getEntityList() throws Exception;
	public boolean deleteEntity(long id) throws Exception;
	public void modifyEntity(Customer customer) throws Exception;

}
