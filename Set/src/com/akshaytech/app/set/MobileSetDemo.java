package com.akshaytech.app.set;

import java.util.HashSet;

public class MobileSetDemo {
	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.no=9980040686L;
		m1.model="Moto g2";
		
		Mobile m2 = new Mobile();
		m2.no=8867966586L;
		m2.model="Nokia 6";
		
		HashSet<Mobile> set = new HashSet<Mobile>();
		set.add(m1);
		set.add(m2);
		
		System.out.println(set.size());
	}
}
