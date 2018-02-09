package com.akshaytech.applications.programs.compdemo;

public class Mobile implements Comparable<Mobile> {
	long mobNumber;
	String model;
	int price;
	public Mobile(long mobNumber,String model,int price)
	{
		this.mobNumber=mobNumber;
		this.model=model;
		this.price=price;
	}
	@Override
	public String toString() {
		String msg=(this.mobNumber+"\t"+this.model+"\t"+this.price);
		return msg;
	}
	@Override
	public int compareTo(Mobile m) {
		if(this.price==m.price)
		{
			return 0;
		}
		else if(this.price>m.price)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
