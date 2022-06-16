package com.example.demo.entity;

import org.springframework.stereotype.Component;

@Component
public class Studentr 
{
	private String name;
	private int roll_no;
	
	public Studentr() {
		super();
		System.out.println("capagini");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll_no;
	}
	public void setRoll(int roll) {
		this.roll_no = roll;
	} 
	public void display()
	{
		System.out.println("sarika");
	}
	
}
