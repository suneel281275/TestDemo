package com.vmindsv;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.vmindsv.config.AppConfig;
import com.vmindsv.demo.DemoAutowireA;
import com.vmindsv.demo.DemoAutowireB;
import com.vmindsv.demo.DemoResourceX;
import com.vmindsv.demo.DemoResourceY;
import com.vmindsv.demo.Tution;

public class AppMain {
	
	static Logger log =Logger.getLogger(AppMain.class.getName());
	
	public static void main(String[] args) {

		// for @Resourse(Byname type)

		log.info("loading the context object");

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		log.info("y bean created");

		DemoResourceY y = (DemoResourceY) context.getBean("y");

		//log.debug(y);

		y.setName("welcome to vmindsv technologies");

		DemoResourceX x = (DemoResourceX) context.getBean("x");

		System.out.println(x);

		// for Autowire(ByType configuration)

		DemoAutowireB db = (DemoAutowireB) context.getBean("b");

		db.name = "welcome to vmindsv technologies";

		System.out.println(db);

		DemoAutowireA da = (DemoAutowireA) context.getBean("a");

		System.out.println(da);

		// for qualifier example

		Tution t = (Tution) context.getBean("tution");
		t.show();

		log.info("done demo autowire example");
	}

}
