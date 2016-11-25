package com.vminds.configuration;

import java.util.Properties;

//import javax.activation.DataSource;
import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan({"com.vminds.configuration"})
@PropertySource(value={"classpath:application.properties"})
public class HibernateConfig {
	
	@Autowired
	private Environment environment;
	
   @Bean
   public LocalSessionFactoryBean sessionFactory(){
	   LocalSessionFactoryBean sessionFactory =new LocalSessionFactoryBean();
	   sessionFactory.setDataSource(datasource());
	   sessionFactory.setPackagesToScan(new String[]{"com.vminds.model"});
	   sessionFactory.setHibernateProperties(hibernateProperties());
	   return sessionFactory;   
   }
	
	@Bean
	public DataSource datasource(){
		 DriverManagerDataSource dataSourc = new DriverManagerDataSource();
		 Properties hm=environment.getProperties();
		 dataSourc.setDriverClassName(hm.getProperty("jdbc.driverClassName"));
		 dataSourc.setUrl(hm.getProperty("jdbc.url"));
		 dataSourc.setUsername(hm.getProperty("jdbc.username"));
		 dataSourc.setPassword(hm.getProperty("jdbc.password")); 
	    	return dataSourc;		
	}
	
	private Properties hibernateProperties() {
		Properties proper = new Properties();
		Properties hm=environment.getProperties();
		proper.put("hibernate.dialect",hm.getProperty("hibernate.dialect"));
		proper.put("hibernate.show_sql",hm.getProperty("hibernate.show_sql"));
		proper.put("hibernate.hbm2ddl.auto",hm.getProperty("hibernate.hbm2ddl.auto"));
		proper.put("hibernate.generate_statistics",hm.getProperty("hibernate.generate_statistics"));
		proper.put("hibernate.format_sql",hm.getProperty("hibernate.format_sql"));
        return proper;        
    }
	
	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager( ){
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory().getObject());
		return txManager;
	}
	
}
