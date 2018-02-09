package Collection;

public class Beer implements Comparable<Beer> {
	String Brand;
	int price;
	@Override
	public int compareTo(Beer b) {
		return this.Brand.compareTo(b.Brand);
	}
	@Override
	public String toString() {
		return (this.Brand+"------------>"+this.price);
	}
}
