package ClassMethodOOP01;

class Dog {
	int legs;
	String color, type;
	boolean isPet;
	int age;
	float weight;

	void run() {

		System.out.println("Dog runs!");
	}

	void eat() {

	}
	
	void sleep() {
		
	}
}

public class DogClass {

	public static void main(String[] args) {
		
		
		Dog d1, d2, d3;
		d1 = new Dog();
		d1.run();

	}

}
