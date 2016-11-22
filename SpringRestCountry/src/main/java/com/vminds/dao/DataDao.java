package com.vminds.dao;


import java.util.List;

import com.vminds.model.Customer;

public interface DataDao {
	
	public boolean addEntity(Customer customer) throws Exception;
	public Customer getEntityById(long id) throws Exception;
	public List<Customer> getEntityList() throws Exception;
	public boolean deleteEntity(long id) throws Exception;
	public void modifyEntity(Customer customer) throws Exception;

}
