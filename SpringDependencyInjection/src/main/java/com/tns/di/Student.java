package com.tns.di;

public class Student 
{
	private String Name;
	//DI using constructor

	public Student(String name) {
		super();
		Name = name;
	}
	
	/*//DI using setter
	public void setName(String name) {
		Name = name;
	}*/

	public void print()
	{
	System.out.println("the student name is:"+Name);
	}
}
