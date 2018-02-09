package Collection;

import java.util.HashSet;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> lst = new LinkedList<Integer>();
		lst.add(10);
		lst.add(20);
		lst.add(30);
		lst.add(40);
		lst.add(10);
		lst.add(null);
		System.out.println(lst);
		HashSet<String> lst1 = new HashSet<String>();
		lst1.add("akshay");
		lst1.add("akshay");
		lst1.add("jkd");
		lst1.add("akshdhfhay");
		lst1.add(null);
		lst1.add(null);
		System.out.println(lst1);
	}

}
