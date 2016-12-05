package com.vmindsv;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.vmindsv.config.AppConfig;
import com.vmindsv.demo.DemoAutowireA;
import com.vmindsv.demo.DemoAutowireB;
import com.vmindsv.demo.DemoResourceX;
import com.vmindsv.demo.DemoResourceY;
import com.vmindsv.demo.Tution;

public class AppMain {
	
	public static void main(String[] args) {
		
		// for @Resourse(Byname type)
		
		AbstractApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		DemoResourceY y =(DemoResourceY)context.getBean("y");
		
		y.setName("welcome to vmindsv technologies");
		
		DemoResourceX x=(DemoResourceX)context.getBean("x");
		
		System.out.println(x);
		
		
		//for Autowire(ByType configuration)
		
		DemoAutowireB db =(DemoAutowireB)context.getBean("b");

		db.name="welcome to vmindsv technologies";
		
		System.out.println(db);
		
		DemoAutowireA da =(DemoAutowireA)context.getBean("a");
		
		System.out.println(da);
		
		
		//for qualifier example
		
		Tution t =(Tution)context.getBean("tution");
		t.show();
	}

}
