package com.jspider.methodapp;

public class Runner {
	public static void main(String[] args) {
		BoreWell bw=new BoreWell();
		//bw.give(); 
		Water w=bw.give();
		System.out.println(bw);
	}
}
