package ClassMethodOOP01;

class Dog {
	int legs;
	String color, type;
	boolean isPet;
	int age;
	float weight;
	
	public Dog() {
		//default constructor
		System.out.println("default constructor");
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

public class DogClass {

	public static void main(String[] args) {

		Dog d1;
		d1 = new Dog();
		Dog d2 = new Dog();
		

	}

}