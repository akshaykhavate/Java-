package com.akshaytech.applications.programs.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeSortDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee(5.9, 29000);
		Employee e2 = new Employee(5.6, 27000);
		Employee e3 = new Employee(5.11, 29400);

		ArrayList<Employee> lst = new ArrayList<Employee>();
		lst.add(e1);
		lst.add(e2);
		lst.add(e3);

		Comparator<Employee> ctr = new EmployeeHtComparator();
		ctr = new EmployeeSalaryComparator();
		Collections.sort(lst,ctr);

		for (Employee e : lst) 
		{
			System.out.println(e.ht+"----->"+e.salary);
		}
	}
}
