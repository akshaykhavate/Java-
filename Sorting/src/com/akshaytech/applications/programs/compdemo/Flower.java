package com.akshaytech.applications.programs.compdemo;

public class Flower implements Comparable<Flower> {
	String color;
	String type;
	public Flower(String color,String type)
	{
		this.color=color;
		this.type=type;
	}
	@Override
	public String toString() {
		String msg=(this.color+"\t"+this.type);
		return msg;
	}
	@Override
	public int compareTo(Flower f) {
		return this.color.compareTo(f.color);
	}
}
