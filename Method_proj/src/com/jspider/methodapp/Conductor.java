package com.jspider.methodapp;

public class Conductor {
	String name;
	void issue()
	{
		Ticket t =new Ticket();
		t.price=20;
		t.date="16-Apr-2017";
		Passenger p =new Passenger();
		p.take(t);

	}
}
