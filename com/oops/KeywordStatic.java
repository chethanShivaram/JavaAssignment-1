package com.oops;

class Static {
	static int a=100; 
	int b=200;
		   static void disp()
		   {
			   System.out.println("static method");
		   }
		   static class KeywordStatic{
			   public void disp() {
				   System.out.println(a);
			   }
		   }
		   public static void main(String[] args)
		   {
			  disp();
			  System.out.println(a);
		   }
		   
}