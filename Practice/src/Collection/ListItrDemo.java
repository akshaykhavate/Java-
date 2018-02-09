package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListItrDemo {
	public static void main(String[] args) {
		ArrayList<Integer> lst = new ArrayList<Integer>();
		lst.add(10);
		lst.add(699);
		lst.add(450);
		lst.add(1000);
		lst.add(500);
		ListIterator<Integer> litr = lst.listIterator();
		while (litr.hasNext()) {
			Integer ele = litr.next();
			int i = 0;
			int in = i;
			System.out.println(ele);
		}
	}
}
