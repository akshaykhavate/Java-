package com.akshaytech.applications.programs.compdemo;

import java.util.ArrayList;
import java.util.Collections;

public class FlowerSortDemo {
	public static void main(String[] args) {
		Flower f1 = new Flower("Sunflower", "Yellow");
		Flower f2 = new Flower("Jasmine", "White");
		Flower f3 = new Flower("Rose", "Red");

		ArrayList<Flower> lst = new ArrayList<Flower>();
		lst.add(f1);
		lst.add(f2);
		lst.add(f3);

		Collections.sort(lst,Collections.reverseOrder());

		for (Flower fl : lst) {
			System.out.println(fl);
		}

	}
}
