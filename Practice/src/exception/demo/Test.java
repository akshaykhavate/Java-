package exception.demo;

import java.io.FileWriter;
import java.io.IOException;

public class Test {
	public Test() throws ArrayIndexOutOfBoundsException
	{
		
	}
	public void doSomething() throws ArithmeticException,IOException
	{
		System.out.println("Doing something");
		int re=10/0;
		new FileWriter("result.txt").write("Hello");
	}
}
