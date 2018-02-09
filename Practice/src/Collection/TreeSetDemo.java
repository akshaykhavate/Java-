package Collection;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Beer b1 = new Beer();
		b1.Brand = "KF";
		b1.price = 250;
		
		Beer b2 = new Beer();
		b2.Brand = "Bedwiser";
		b2.price = 180;

		Beer b3 = new Beer();
		b3.Brand = "KF";
		b3.price = 150;

		Beer b4 = new Beer();
		b4.Brand = "Zinora";
		b4.price = 50;
		
		TreeSet<Beer> tset = new TreeSet<Beer>();
		tset.add(b1);
		tset.add(b2);
		tset.add(b3);
		tset.add(b4);
		
		for (Beer b : tset) {
			System.out.println(b);
		}
	}
}
