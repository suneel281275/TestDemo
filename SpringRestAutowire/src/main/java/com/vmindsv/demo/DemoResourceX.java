package com.vmindsv.demo;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("x")
public class DemoResourceX {

@Resource(name="y")
 private DemoResourceY y;
 
public String toString(){
	return "suneel [ " + y + "]";
}
 
}
