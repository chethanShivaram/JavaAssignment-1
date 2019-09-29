package com.oops;

class Animal2{
	void sound() {
		System.out.println("Animal is making a sound");
	}
}
class Horse extends Animal2{
	void sound() {
		System.out.println("neigh");
	}
}
class Cat extends Animal2{
	void sound() {
		System.out.println("meow");
	}
}
public class Polymorphism {
	public static void main(String[] args) {
		Cat obj = new Cat();
		obj.sound();
	}

}
