package com.jspiders.application.monkeysenario;

public class Person {
	/*Banana b;
	void buy()
	{
		ShopKiper sk=new ShopKiper();
		sk.give();
		System.out.println("Shopkiper gave banana");
	}
	void feed()
	{
		Monkey m=new Monkey();
		System.out.println("Person gave banana to monkey");
		m.eat(b);
	}*/
	void buyAndFeed()
	{
		ShopKiper sk=new ShopKiper();
		sk.give();
		System.out.println("Shopkiper gave banana");
		Banana b=new Banana();
		Monkey m=new Monkey();
		System.out.println("Person gave banana to monkey");
		m.eat(b);
	}
}
