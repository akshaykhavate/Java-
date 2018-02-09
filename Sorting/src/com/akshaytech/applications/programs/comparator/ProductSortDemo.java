package com.akshaytech.applications.programs.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductSortDemo {
	public static void main(String[] args) {
		Product p1 = new Product(111,"Harddisk");
		Product p2 = new Product(159,"Laptop");
		Product p3 = new Product(121,"Pendrive");
		
		ArrayList<Product> lst = new ArrayList<Product>();
		lst.add(p1);
		lst.add(p2);
		lst.add(p3);
		
		Comparator<Product> ctr = new ProductNameComparator();
		ctr = new ProductIdComparator();
		Collections.sort(lst,ctr);
		
		for (Product p : lst) {
			System.out.println(p.name+"    "+p.id);
		}
		
	}
}
