package com.akshaytech.applications.programs.comparator;

import java.util.Comparator;

public class EmployeeHtComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee e1, Employee e2) {
		/*if(e1.ht == e2.ht)
		{
			return 0;
		}
		else if (e1.ht > e2.ht) 
		{
			return 1;
		}
		else
		{
			return -1;
		}*/
		Double ht = e1.ht;
		return ht.compareTo(e2.ht);
	}

}
