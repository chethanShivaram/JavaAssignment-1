package com.oops;

class Final{
	static  int speedlimit;
	static {
		speedlimit=200;
	}
	
	 void run()
	 {  
	  speedlimit=100;
	  System.out.println(speedlimit);
	 }  
	void demo()
	   {
		   System.out.println("ABC");
	   }
}
	 class KeywordFinal extends Final
	 {
	 	void demo()
	 	{
	 		System.out.println("Final Method");
	 	}
	 	public static void main(String[] args)
	 	{
	 		KeywordFinal obj = new KeywordFinal();
	 		obj.demo();
	 		obj.run(); 
	 	}

	      
	 }  

