package ClassMethodOOP01;

class Cat {
	int legs;
	String color, type;
	boolean isPet;
	int age;
	float weight;

	// Method Overloading
	public Cat() {
		// default constructor
		// System.out.println("default constructor");

		legs = 4;
		color = "White";

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

public class VariableValue {

	public static void main(String[] args) {

		Cat d1 = new Cat(), d2 = new Cat();
		d2.legs = 3;

		System.out.println(d1.legs);
		System.out.println(d2.legs);

	}

}
