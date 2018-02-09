package Aggregation;

public class Runner {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.model = "AudiQ6";
		Driver d = new Driver();
		d.name = "Ravi";
		d.c=c1;
		//d.null;
		System.out.println(d.c);
	}
}
