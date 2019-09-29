package com.oops;

public class Constructor {

		   int id;
		   String name;
		   int age;
		   
		   Constructor(int a, String s)
		   {
			   id= a;
			   name=s;
		   }
		  Constructor(int a, String s,int num)
		   {
			   id= a;
			   name=s;
			   age=num;
		   }
		   void display()
		   {
			   System.out.println(id+ " " +name+ " " + age);
		   }
	       
		   public static void main(String[] args)
		   {
			   Constructor obj1 = new Constructor(10,"ABC");
			   Constructor obj2 = new Constructor(10,"ABC", 897);
			   obj2.display();
			   
		   }		   
		
	}