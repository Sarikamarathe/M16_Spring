package com.tns.springaw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {
		ApplicationContext c= new ClassPathXmlApplicationContext();
		Human human=c.getBean("Human",Human.class);
		human.display();
	}

}
