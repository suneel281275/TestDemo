package com.vminds.services;

import java.util.List;

import com.vminds.model.CustomerInfo;

public interface UserServices {
	
	/*CustomerInfo findById(int id);
	CustomerInfo findByname(String name);*/
	void saveCustomerInfo(CustomerInfo customerInfo);
	/*void updateCustomerInfo(CustomerInfo customerInfo);
	void deleteCustomerById(int id);
	List<CustomerInfo> findAllCustomersInfo();
	public boolean isCustomerExist(CustomerInfo customerInfo);
*/
}
