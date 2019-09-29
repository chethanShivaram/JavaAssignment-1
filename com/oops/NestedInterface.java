package com.oops;

interface Showable
{  
	 interface Message
	  {  
	   void msg();  
	  }  
}  
 class NestedInterface  implements Showable.Message{  
	 public void msg()
	 {
		 System.out.println(" nested interface");
	 }  
	  
	 public static void main(String args[])
	 {  
		  NestedInterface message=new NestedInterface();  
	      message.msg();  
	 }  
}
