package com.vmindsv.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Tution {
	
	@Autowired
	@Qualifier("gopi")
	private Institute ist;
	
	public void show(){
		ist.getInstituteName();
	}

}
