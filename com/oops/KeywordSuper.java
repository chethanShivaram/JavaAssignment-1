package com.oops;

class X
{
  int a=10;
  void msg() {
	  System.out.println("parent method");
  }
}
public class KeywordSuper extends X{
  int a=8;
  void display()
  {
	System.out.println(super.a);
  }
  void msg() {
	  System.out.println("child");
  }
  void data() {
	  super.msg();
  }
 public static void main(String args[])
 {
	 KeywordSuper obj=new KeywordSuper();
     obj.display();
     obj.data();
 }
}
