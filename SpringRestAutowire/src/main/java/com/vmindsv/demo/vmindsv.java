package com.vmindsv.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("vmindsv")
public class vmindsv implements Institute {
	
	public void getInstituteName() {
		System.out.println("vmindsv technologies");
	}
}
