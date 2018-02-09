package com.akshaytech.application.module1;

import java.util.Scanner;

public class Shop {
		public Vegetable sell()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter Vegetable[Carrot|Chilly|Potato]");
			String type =sc.next();
			if(type.equals("Carrot"))
			{
				Carrot cr =new Carrot();
				System.out.println("carrot returned");
				return cr;
			}
			else if(type.equals("Chilly"))
			{
				Chilly ch =new Chilly();
				System.out.println("chilly returned");
				return ch;
			}
			else 
			{
				Potato p=new Potato();
				System.out.println("potato is returned");
				return p;
			}
		}
	}

