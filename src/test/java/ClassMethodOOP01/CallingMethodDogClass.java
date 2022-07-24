package ClassMethodOOP01;

class Dog1 {
	int legs;
	String color, type;
	boolean isPet;
	int age;
	float weight;

	public Dog1() {
		// default constructor
		//System.out.println("default constructor");
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

public class CallingMethodDogClass {
	public static void main(String[] args) {

		Dog1 d1;
		d1 = new Dog1();
		Dog1 d2 = new Dog1();
		d1.run();
		d2.sleep();

	}

}
