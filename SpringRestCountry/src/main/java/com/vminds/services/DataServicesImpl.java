package com.vminds.services;

import com.vminds.dao.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vminds.model.Customer;

public class DataServicesImpl implements DataServices {

	@Autowired
	DataDao dataDao;
	
	@Override
	public boolean addEntity(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		return dataDao.addEntity(customer);
	}

	@Override
	public Customer getEntityById(long id) throws Exception {
		// TODO Auto-generated method stub
		return dataDao.getEntityById(id);
	}

	@Override
	public List<Customer> getEntityList() throws Exception {
		// TODO Auto-generated method stub
		return dataDao.getEntityList();
	}

	@Override
	public boolean deleteEntity(long id) throws Exception {
		// TODO Auto-generated method stub
		return dataDao.deleteEntity(id);
	}

	@Override
	public void modifyEntity(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		dataDao.modifyEntity(customer);
	}

}
