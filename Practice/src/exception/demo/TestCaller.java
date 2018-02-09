package exception.demo;

import java.io.IOException;

public class TestCaller {
	public void call() throws ArithmeticException,IOException
	{
		Test t = new Test();
		t.doSomething();
	}
	public static void main(String[] args) throws ArithmeticException,IOException
	{
		System.out.println("App start");
		new TestCaller().call();
		System.out.println("App end");
	}
}
