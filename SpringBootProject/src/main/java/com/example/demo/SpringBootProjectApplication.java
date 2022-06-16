package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Studentr;

@SpringBootApplication
public class SpringBootProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext c=SpringApplication.run(SpringBootProjectApplication.class, args);
		Studentr s=c.getBean(Studentr.class);
		//Studentr s=new Studentr();
		s.display();
	}

}
