package com.vminds.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vminds.model.CustomerInfo;
import com.vminds.services.UserServices;

@Repository
public class CustomerInfoDaoImpl implements CustomerInfoDao {

	
	
	/*@Override
	public CustomerInfo findById(int id) {

		return null;
	}

	@Override
	public CustomerInfo findByname(String name) {
		// TODO Auto-generated method stub
		return null;
	}*/

	@Override
	public void saveCustomerInfo(CustomerInfo customerInfo) {
		// TODO Auto-generated method stub
		custdao.saveCustomerInfo(customerInfo);
		
	}

	/*@Override
	public void updateCustomerInfo(CustomerInfo customerInfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomerById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CustomerInfo> findAllCustomersInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isCustomerExist(CustomerInfo customerInfo) {
		// TODO Auto-generated method stub
		return false;
	}
*/
}
