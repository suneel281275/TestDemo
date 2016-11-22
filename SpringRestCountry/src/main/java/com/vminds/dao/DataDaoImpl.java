package com.vminds.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;


import com.vminds.model.Customer;

public class DataDaoImpl implements DataDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	Session session = null;
	Transaction tx = null;
	
	public boolean addEntity(Customer customer) throws Exception {

		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(customer);
		tx.commit();
		session.close();

		return false;
	}
	
	public Customer getEntityById(long id) throws Exception {
		session = sessionFactory.openSession();
		Customer customer = (Customer) session.load(Customer.class,
				new Long(id));
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return customer;
	}
		@SuppressWarnings("unchecked")
		public List<Customer> getEntityList() throws Exception {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			List<Customer> customerList = session.createCriteria(Customer.class)
					.list();
			tx.commit();
			session.close();
			return customerList;
		}
		
		public boolean deleteEntity(long id)
				throws Exception {
			session = sessionFactory.openSession();
			Object o = session.load(Customer.class, id);
			tx = session.getTransaction();
			session.beginTransaction();
			session.delete(o);
			tx.commit();
			return false;
		}

		public void modifyEntity(Customer customer) throws Exception {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.saveOrUpdate(customer);
			tx.commit();
			session.close();
		}
	}
