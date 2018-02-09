package exception.demo;

public class Calculator {
	void devide(int a,int b)
	{
		System.out.println("Method starts");
		try {
			int res = a/b;	
			System.out.println("Result is:"+res);
		} catch (Exception e) {
			System.out.println("enter proper input");
			System.out.println("Don't enter denominator as a zero");
		}
		System.out.println("Devide method ends");
	}
	public static void main(String[] args) {
		System.out.println("App starts");
		Calculator c = new Calculator();
		c.devide(10,0);
		System.out.println("App ends");
	}
}
