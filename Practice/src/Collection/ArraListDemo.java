package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Vector;

public class ArraListDemo {
	public static void main(String[] args) {
		HashSet<String> lst1 = new HashSet<String>();
		lst1.add("Akshay");
		lst1.add("Kumar");
		lst1.add("SRK");
		lst1.add("Akshay");
		lst1.add(null);
		lst1.add(null);
		//lst1.add(null);
		/*ArrayList<String> lst = new ArrayList<String>(lst1);
		Iterator<String> itr = lst.iterator();
		while (itr.hasNext()) {
			String ele = itr.next();
			if(ele.equals("Akshay")){
				itr.remove();
			}
		}*/
		System.out.println(lst1+" ");
	}
}
