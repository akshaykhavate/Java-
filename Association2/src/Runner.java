
public class Runner {
	public static void main(String[] args) {
		Boy b=new Boy();
		System.out.println("name is : "+b.name);
		System.out.println("stream is : "+b.stream);
		System.out.println("mobile number is : "+b.mob);
		System.out.println("watch is : "+b.w);
		b.w.price=4700;
		System.out.println("price is : "+b.w.price);
	}
}
