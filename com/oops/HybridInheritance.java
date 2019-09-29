package com.oops;

class MethodA{

   public void disp()
   {
	System.out.println("methodA");
   }
}

class MethodB extends MethodA
{
   public void disp()
   {
	System.out.println("MethodB");
   }
}

class MethodC extends MethodA
{
   public void disp()
   {
	System.out.println("MethodC");
   }
	
}

class MethodD extends MethodA
{
   public void disp()
   {
	System.out.println("MethodD");
   }
  
}
public class HybridInheritance {
	 public static void main(String args[]){

			MethodD obj = new MethodD();
			obj.disp();
		   }
	}
