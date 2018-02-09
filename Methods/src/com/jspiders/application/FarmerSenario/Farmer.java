package com.jspiders.application.FarmerSenario;

public class Farmer {
	Water w;
	void pump()
	{
		BoreWell b=new BoreWell();
		b.pump();
		System.out.println("Farmer pumps borewell");
		
	}
	void Feed()
	{
		Cow c =new Cow();
		c.drinks(w);
		System.out.println("Farmer feeds water to the cow");
	}
	/*void pumpAndFeed()
	{
		BoreWell b=new BoreWell();
		b.pump();	
		Cow c =new Cow();
		c.drinks(w);
	}*/
}
