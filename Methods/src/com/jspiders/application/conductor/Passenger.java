package com.jspiders.application.conductor;

public class Passenger {
	void ask()
	{
		Conductor c=new Conductor();
		Ticket t= c.give();
		System.out.println("Passenger got the ticket from "+c.name+"worth "+t.price+" on "+t.date);
	}
}
