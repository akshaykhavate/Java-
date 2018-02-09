package exception.customexception;

import java.util.Scanner;

public class AgeNotSupportedException extends Exception {
	private static final long serialVersionUID = 3267980205956718133L;

	public static void main(String[] args) {
		Rto r = new Rto();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
		int n = sc.nextInt();
		try {
			r.issueDl(n);
			
		} catch (AgeNotSupportedException e) {
			System.out.println("age mut be greater than 18");
			e.printStackTrace();
		}
		System.out.println("DL issued");
	}
}
