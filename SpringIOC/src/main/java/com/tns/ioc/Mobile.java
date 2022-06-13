package com.tns.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		ApplicationContext c= new ClassPathXmlApplicationContext();
		/*Airtel a=(Airtel)c.getBean("airtel");
		a.calling();
		a.data();*/
		Sim j=c.getBean(Sim.class);
		j.calling();
		j.data();
	
		System.out.println("The program is Executed....!");

	}

}
