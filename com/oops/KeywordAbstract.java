package com.oops;


abstract class MyClass
{    		public void disp()
            {
		      System.out.println("Concrete method of parent class");
		    }
		    abstract public void disp2();
 }
class KeywordAbstract extends MyClass
{
		   public void disp2()
		   {
		       System.out.println("overriding abstract method");
		   }
		   public static void main(String args[])
		   {
			   KeywordAbstract obj = new KeywordAbstract();
		       obj.disp2();
		   }
}