package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemp {

	public static void main(String[] args) {
		ArrayList<String> lst = new ArrayList<String>();
		lst.add("one");
		lst.add("Two");
		//lst.add("Three");
		lst.add("four");
		Iterator<String> itr = lst.iterator();
		while (itr.hasNext()) {
			String str =  itr.next();
			if(str.equals("Three")){
				itr.remove();
			}
			System.out.println(str);
		}
	}
}
