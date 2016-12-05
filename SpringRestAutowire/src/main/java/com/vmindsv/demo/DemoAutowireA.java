package com.vmindsv.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("a")
public class DemoAutowireA {
	@Autowired
	public DemoAutowireB db;
	
	public String toString(){
		return "HI"+ db;
	}

}
