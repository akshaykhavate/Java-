package com.akshaytech.applications.programs.compdemo;

import java.util.ArrayList;
import java.util.Collections;

public class MobileSortDemo {
	public static void main(String[] args) {
		Mobile m1 = new Mobile(9980040686l, "motog2",89999);
		Mobile m2 = new Mobile(8867966586l, "Nokia6",74999);
		Mobile m3 = new Mobile(9900346298l, "iphone",29999);

		ArrayList<Mobile> lst= new ArrayList<Mobile>();
		lst.add(m1);
		lst.add(m2);
		lst.add(m3);

		Collections.sort(lst);

		for (Mobile mob : lst) {
			System.out.println(mob);

		}
	}
}