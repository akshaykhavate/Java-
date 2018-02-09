
package com.akshaytech.applications.programs.compdemo;

import java.util.ArrayList;
import java.util.Collections;

public class CarSortDemo {
	public static void main(String[] args) {
		Car c1= new Car("KA23X7547","Black");
		Car c2= new Car("KA03M0652","Blue");
		Car c3= new Car("KA51X3443","Green");

		ArrayList<Car> lst = new ArrayList<Car>();
		lst.add(c1);
		lst.add(c2);
		lst.add(c3);

		Collections.sort(lst);
		for (Car c : lst) {
			System.out.println(c);
		}

	}
}
