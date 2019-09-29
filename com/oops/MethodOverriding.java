package com.oops;

class Test1{
	public static void disp() {
		System.out.println("parent display");
	}
}
public class MethodOverriding extends Test1{
	
	public static void disp() {
		System.out.println("child display");
	}
	public static void main(String[] args) {
		MethodOverriding obj = new MethodOverriding();
		obj.disp();
	}

}
