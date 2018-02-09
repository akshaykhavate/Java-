package com.jspiders.application.FarmerSenario;

public class Runner {
public static void main(String[] args) {
	Farmer f =new Farmer();
	f.pump();
	f.Feed();
	//f.pumpAndFeed();
	System.out.println("cow drinks water");
}
}
