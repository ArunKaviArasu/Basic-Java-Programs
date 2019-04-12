package week1.day2;

public class LearnOverloading {

	public static float area(float a) {
		return a*a; 
	}
	public int area(int a) {
		return a*a;
	}
	public int area(int a, int b) {
		return a*b;
	}
	public LearnOverloading() {
		System.out.println("no args");
	}
	public LearnOverloading(int a) {
		this();
		System.out.println("with args"); 
	}
	public LearnOverloading(int a, float b) {
		this(10);
		System.out.println("two args");
	}
	public static void main(String[] args) {
		LearnOverloading load = new LearnOverloading(5,5.8f);
		System.out.println(load.area(5));

	}

}
