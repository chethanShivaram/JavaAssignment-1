package com.oops;

class Test{
	public static void disp(int a,char c) {
		System.out.println(a +"" +c);
	}
	public static void disp(char c, int a) {
		System.out.println(c+""+a);
	}
}
public class MethodOverLoading {
	public static void main(String[] args) {
		Test obj = new Test();
		obj.disp('a',1);
	}

}
