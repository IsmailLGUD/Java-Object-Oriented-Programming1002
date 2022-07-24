package ClassMethodOOP01;

class Dog2 {
	int legs;
	String color, type;
	boolean isPet;
	int age;
	float weight;

	public Dog2() {
		// default constructor
		// System.out.println("default constructor");

		legs = 4;
		color = "red";

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

public class ObjectCallingVariable {

	public static void main(String[] args) {

		Dog2 d1 = new Dog2();
		System.out.println(d1.color);
		System.out.println(d1.legs);
		System.out.println(d1.age);
		System.out.println(d1.isPet);

	}

}
