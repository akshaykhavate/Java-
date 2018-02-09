package com.demo;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner extends A {
	void run(women w){
		System.out.println("jhgkfjd");
	}
	public static void main(String[] args) {
		//int reflect() throws Exception{
		Runner r= new Runner();
		r.doSomething(new man());
		r.run(new women());
	}
}
