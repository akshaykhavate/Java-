package org.akshay.app.staticdemo;

public class Runner {
	static{
		System.out.println("I am a sttic block of main runner");
	}
	public static void main(String[] args) {
		System.out.println("Main() start");
		Sample s1=new Sample();
		Simple s2=new Simple();
		//Sample s3=new Sample();
		System.out.println("Main() end");
	}
}
