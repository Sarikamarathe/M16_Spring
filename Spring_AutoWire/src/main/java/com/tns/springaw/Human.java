package com.tns.springaw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human 
{
	//Dependencies Injection object
	private Heart h;
	
	//DI Using constructor
	public Human(Heart h) {
		super();
		this.h = h;
	}
	@Autowired
	@Qualifier("tigerHeart")
	//DI Using Setters
	public void setH(Heart h) {
		this.h = h;
	}

	public void display() 
	{
		h.print();
		System.out.println("The name of animal is:"+h.getNameofanimal()+
				"and no.of Heart is:"+h.getNoOfheart());
	}
}
