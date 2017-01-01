package com.netease.course;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

		Service1 service1 = context.getBean("service1", Service1.class);
		service1.save(2);
		service1.delete("b");
		service1.update("c");
		service1.get("d");
		
		Service2 service2 = context.getBean("service2", Service2.class);
		service2.save("e");
		service2.delete("f");
		service2.update("g");
		service2.get("h");
		
		((ConfigurableApplicationContext) context).close();
	}
}
