package Inheritancedemo;

public class Son extends Father {
	void ride(Bike b)
	{
		System.out.println("Son rides bike");
	}
	public static void main(String[] args) {
		Son s = new Son();
		s.ride(new Bike());
		s.ride(new Horse());
		
	}
}
