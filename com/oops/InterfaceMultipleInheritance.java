package com.oops;

	interface a
	{
		 public void show();
	}
	interface b
	{
	     int x= 200;
	    
	}
	interface c
	{
		public void show();
		int x=20;
	}
	class InterfaceMultipleInheritance implements a,b,c
	{
		public void show()
		{
			System.out.println("Hi");
		}
		public static void main(String[] args)
		{
			InterfaceMultipleInheritance obj = new InterfaceMultipleInheritance();
			obj.show();
			System.out.println(b.x);
		
		}
	}

