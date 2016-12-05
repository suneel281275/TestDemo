package com.vmindsv.demo;

import org.springframework.stereotype.Component;

@Component("gopi")
public class Gopi implements Institute {

	public void getInstituteName() {
		
		System.out.println("Gopi Ana Institute");
		
	}
}
