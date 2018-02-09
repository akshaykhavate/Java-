package com.jspiders.application.monkeysenario;

public class Runner {
	public static void main(String[] args) {
		Person p=new Person();
		//p.buy();
		//p.feed();
		p.buyAndFeed();
		System.out.println("monkey ate banana");
	}
}
