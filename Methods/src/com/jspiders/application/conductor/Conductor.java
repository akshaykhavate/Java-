package com.jspiders.application.conductor;

public class Conductor {
	String name;
	Ticket give()
	{
		Ticket t=new Ticket();
		t.date="16-Apr-2017";
		t.price=20;
		return t;
	}
}
