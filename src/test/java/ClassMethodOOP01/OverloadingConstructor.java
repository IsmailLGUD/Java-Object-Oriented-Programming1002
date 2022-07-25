package ClassMethodOOP01;

class Cat1 {
	int legs;
	String color, type;
	boolean isPet;
	int age;
	float weight;

	public Cat1() {
		// default constructor
		// System.out.println("default constructor");
		legs = 4;
	}

	// Method Overloading
	public Cat1(int legs, String t, float weight) {

		this.legs = legs;
		type = t;
		this.weight = weight;

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

public class OverloadingConstructor {

	public static void main(String[] args) {
		Cat1 d1 = new Cat1(3, "Black", 5);
		Cat1 d2 = new Cat1();

		System.out.println("Legs: " + d1.legs);

	}

}
