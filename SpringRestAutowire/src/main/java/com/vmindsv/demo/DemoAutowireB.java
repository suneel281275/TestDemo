package com.vmindsv.demo;

import org.springframework.stereotype.Component;

@Component("b")
public class DemoAutowireB {
	
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return name;
	}
	
}
