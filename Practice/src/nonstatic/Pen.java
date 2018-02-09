package nonstatic;

public class Pen {
	{
		System.out.println("I am a pen object");
	}
	public Pen() {
		System.out.println("I am a Constuctor of pen object");
	}
	static{
		System.out.println("I am static block");
	}
	public Pen(int price)
	{
		this();
		System.out.println("I am int type constructor");
	}
	public Pen(int price,String color)
	{
		this(price);
		System.out.println("I am 2 param constructor");
	}
}
