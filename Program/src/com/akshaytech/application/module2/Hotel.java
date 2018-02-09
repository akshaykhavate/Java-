package com.akshaytech.application.module2;

import java.util.Scanner;

public class Hotel {
	String name="MTR";
	public Food serveFood() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter food type[Idly|Vada|dosa]");
		String type=sc.next();
		if(type.equals("Idly"))
		{
			Idly i=new Idly();
			System.out.println("idly returned");
			return i;
		}
		else if(type.equals("Vada"))
		{
			Vada v =new Vada();
			System.out.println("vada returned");
			return v;
		}
		else 
		{
			Dosa d =new Dosa();
			System.out.println("dosa returned");
			return d;
		}
	}
}
