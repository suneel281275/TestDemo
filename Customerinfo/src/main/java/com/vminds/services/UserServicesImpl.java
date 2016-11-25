package com.vminds.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vminds.dao.CustomerInfoDao;
import com.vminds.model.CustomerInfo;

@Service
public class UserServicesImpl implements UserServices {
	
	@Autowired
    CustomerInfoDao dao;
    
	/*@Override
	public CustomerInfo findById(int id) {
		return dao.findById(id);
	}

	@Override
	public CustomerInfo findByname(String name) {
		return dao.findByname(name);
	}
*/
	@Override
	@Transactional
	public void saveCustomerInfo(CustomerInfo customerInfo) {
		 dao.saveCustomerInfo(customerInfo);	
	}

	/*@Override
	public void updateCustomerInfo(CustomerInfo customerInfo) {
		dao.updateCustomerInfo(customerInfo);	
	}

	@Override
	public void deleteCustomerById(int id) {
		
		dao.deleteCustomerById(id);
	}

	@Override
	public List<CustomerInfo> findAllCustomersInfo() {
		
		return dao.findAllCustomersInfo();
	}

	@Override
	public boolean isCustomerExist(CustomerInfo customerInfo) {
		
		return dao.isCustomerExist(customerInfo);
	}*/

}
