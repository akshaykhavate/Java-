package org.akshay.app.staticdemo;

public class Sample extends Simple {
	public Sample() {
		System.out.println("I am a constructor of sample");
	}
	static{
		System.out.println("I am a static block of sample");
	}
	void m1(){
		System.out.println("I am a non static m1()");
	}
	static void m2(){
		System.out.println("I am a static m2()");
	}
}
