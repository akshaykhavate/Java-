package com.jspider.methodapp;

public class Passenger {
	void take(Ticket t)
	{
		System.out.println("Passenger got the ticket worth "+t.price +" "+t.date+" from conductor");
	}
}
