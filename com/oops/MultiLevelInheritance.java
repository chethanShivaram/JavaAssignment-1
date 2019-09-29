package com.oops;

class Animal{
	void eat() {
		System.out.println("eating");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("barking");
	}
}
class BabyDog extends Dog{
	void weep() {
		System.out.println("weeping");
	}
}
public class MultiLevelInheritance{
	public static void main(String[] args) {
		BabyDog obj = new BabyDog();
		obj.weep();
		obj.bark();
		obj.eat();
	}
}
