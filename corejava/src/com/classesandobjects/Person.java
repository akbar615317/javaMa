package com.classesandobjects;

public class Person {
	
	
	// instance variable
	
	private int idvalue;
	
	private String name;
	
	private int age;
	
	//default constructor
	
	Person()
	{
		
		this.name="Raju";
		
		this.age=22;
		
		System.out.println("default argument construtor");
		
	}
	
	// parametarized constructor
	
	

	Person(String s)
	{
		this.name=s;
		
		System.out.println("single argument construtor");
		
	
		
	}
	

	Person(String s, int i)
	{
		this.name=s;
		
		this.age=i;
		
		System.out.println("two argument construtor");
		
	}
	
	Person(int id,String s, int i)
	{
		
		idvalue=id;
		this.name=s;
		
		this.age=i;
		
		System.out.println("three argument construtor");
		
	}
	
	
	
	// return type   method name whatever u want
	void talk()
	{
		
		//local variable
		int a;
		
		
		System.out.println("Hello id " + idvalue);
		System.out.println("Hello name " + name);
		
		System.out.println("my age is  " + age);
		//return age;
		//return name;
		
	}
	
	
	

}
