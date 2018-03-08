package ch5_cleanup;

public class Flower {
	int petalCount = 0;
	String s = "initial value";

	Flower(int petals) {
		// TODO Auto-generated constructor stub
		petalCount = petals;
		System.out.println("Constructor w/ int arg only,petalCount=" + petalCount);
	}

	Flower(String ss) {
		System.out.println("Constructor w/ String only,s=" + ss);
		s = ss;
	}

	Flower(String s, int petals) {
		this(petals);
		this.s = s;
		System.out.println("String & int args");
	}

	Flower() {
		this("hi", 47);
		System.out.println("default constructor (no args)");
	}

	void printPetalCount() {
		System.out.println("petalCount=" + petalCount + "s=" + s);
	}

	public static void main(String[] args) {
		Flower x = new Flower();
		x.printPetalCount();
	}
}
