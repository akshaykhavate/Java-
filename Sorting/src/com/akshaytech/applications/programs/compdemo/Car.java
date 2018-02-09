package com.akshaytech.applications.programs.compdemo;

public class Car implements Comparable<Car> {
	String regNumber;
	String color;
	public Car(String regNumber,String color) 
	{
		this.regNumber=regNumber;
		this.color=color;
	}
	@Override
	public String toString() {
		String msg=(this.regNumber+"\t"+this.color);
		return msg;
	}
	@Override
	public int compareTo(Car c) {
		//return this.regNumber.compareTo(c.regNumber);
		return this.regNumber.compareToIgnoreCase(c.regNumber);
	}
}