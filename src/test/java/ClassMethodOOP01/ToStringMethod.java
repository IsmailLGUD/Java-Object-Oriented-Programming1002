package ClassMethodOOP01;

class Tiger {
	int legs;
	String color, type;
	boolean isPet;
	int age;
	float weight;

	public Tiger() {
		// default constructor
		// System.out.println("default constructor");
		legs = 4;
	}

	// Method Overloading
	public Tiger(int legs, String c, float weight) {

		this.legs = legs;
		color = c;
		this.weight = weight;

	}

	// Overriding toString()Method
	public String toString() {
		return "legs: " + legs + ", color: " + color + ", weight: " + weight;
	}

	void run() {

		System.out.println("Dog runs!");
	}

	void eat() {

	}

	void sleep() {
		System.out.println("Dog sleep!");

	}
}

public class ToStringMethod {

	public static void main(String[] args) {

		Tiger d1 = new Tiger(3, "Black", 5);
		System.out.println(d1);

		Tiger t2 = new Tiger(4, "white", 6);
		System.out.println(t2);

	}

}
