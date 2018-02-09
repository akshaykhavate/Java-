package com.akshaytech.applications.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudSort {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.id=123;
		s1.name="akshay";
		s1.percentage=96.48;

		Student s2 = new Student();
		s2.id=126;
		s2.name="akash";
		s2.percentage=86.12;

		Student s3 = new Student();
		s3.id=1128;
		s3.name="john";
		s3.percentage=76.48;
		
		ArrayList<Student> lst = new ArrayList<Student>();
		lst.add(s1);
		lst.add(s2);
		lst.add(s3);
		System.out.println(lst);
		Iterator<Student> itr = lst.iterator();
		while (itr.hasNext()) {
			Student std =  itr.next();
			System.out.println(std.id+"   "+std.name+"    " +std.percentage);
		}
		Collections.sort(lst);
	}
}
