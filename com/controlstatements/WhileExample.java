package com.controlstatements;

public class WhileExample {
	public static void main(String[] args) {
  int i=1;
  
  while(i<=10)
  {
	  if(i==4)
	  {
		  i++;
		  continue;
	  }
	  System.out.println("Number:"+i);
	  i++;
  }
  }
}
