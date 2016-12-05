package com.vmindsv.demo;


import org.springframework.stereotype.Component;

@Component("y")
public class DemoResourceY {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return "[ " + name + "]";
	}
	
}
