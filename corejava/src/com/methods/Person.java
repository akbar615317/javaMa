package com.methods;
class Person10 {
	
	
	//author akbar
	
	//construtor overloading
	// instance variable
	
	
	static int x=40;
	 int idvalue;
	
	 String name;
	
	 int age;
	 
	 
	 Person10(int idvalue)
	 {
		 this.idvalue=idvalue;
		 
		
	 }

	
	 Person10(int idvalue,String name)
	 {
		 this.idvalue=idvalue;
		 
		 this.name=name;
		 
	 }
	 
	 //constructor chaining
	 
		Person10(int idvalue,String name, int age)
		{
			this(idvalue,name);
			
			this.age=age;
			
		
		}
	

	
	 void talk()
	{
		
		//local variable
		
		
		System.out.println("Hello id " + idvalue);
	
		
		
	}
	 
	 static void talk1()
	{
		
		//local variable
		
		
		System.out.println("hi");
	
		
		
	}
	
	
	
	
}
class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Person10 p3=new Person10(10);
		
		
		p3.talk();
		
		
		Person10 p1=new Person10(145,"raju");
		
		Person10 p2=new Person10(11,"raja",29);
		
	
		
		
		Person10.talk1();
		
		System.out.println(Person10.x);
		
		
				
		
		
	}

}

