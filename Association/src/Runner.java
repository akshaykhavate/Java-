public class Runner {
	public static void main(String[] args) {
		Flower f = new Flower();
		System.out.println("color is : "+f.color);
		System.out.println("type is : "+f.type);
		System.out.println("price is : "+f.price);
		System.out.println("leaf color is : "+f.lf);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		f.color="red";
		System.out.println("color is : "+f.color);
		f.type="Rose";
		System.out.println("type is : "+f.type);
		f.price=50;
		System.out.println("price is : "+f.price);
		f.lf=new Leaf();
		System.out.println("leaf color is : "+f.lf);
	}
}