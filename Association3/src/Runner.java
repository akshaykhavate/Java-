
public class Runner {
	public static void main(String[] args) {
		Boy b=new Boy();
		System.out.println("name is : "+b.name);
		System.out.println("stream is : "+b.stream);
		System.out.println("mobile is : "+b.m.make);
		b.m.color="Baby pink";
		System.out.println("color is : "+b.m.color);
		b.m.b1.type="lithium";
		System.out.println("Battery type is : "+b.m.b1.type);
		b.m.b1.capacity=5000;
		System.out.println("capacity is : "+b.m.b1.capacity);
	}
}
