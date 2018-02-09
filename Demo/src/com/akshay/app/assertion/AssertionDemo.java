package com.akshay.app.assertion;

import java.util.Scanner;

public class AssertionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
	
		int x = sc.nextInt();
	
		assert x>=10 :"not valid";
		
		System.out.println("Value is:"+x);
		
	}
}
