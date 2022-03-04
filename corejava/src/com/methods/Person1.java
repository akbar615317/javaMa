package com.methods;

class Person1 {
	//accessor and mutator methods	
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Person1 [name=" + name + ", age=" + age + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	}

class Methods1
{
public static void main(String args[])
{
Person1 p1=new Person1();

p1.setName("Raju");
p1.setAge(20);

System.out.println("name"   + p1.getName());
System.out.println("age"  +p1.getAge());


}
}





















