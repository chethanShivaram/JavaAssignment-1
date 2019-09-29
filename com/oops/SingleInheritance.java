package com.oops;

class Employee{
	
	int salary=10000;
}
public class SingleInheritance extends Employee{
	
	public static void main(String[] args) {
		SingleInheritance obj= new SingleInheritance();
		
		System.out.println("salary is:"+obj.salary);		
	}
}