package Inheritance;

class Mammal {
	public float weight;
	public int age;
	private double temp;
	// private int weight;
	private double IQ;
	private String furColor;
	
	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}
	public String getFurColor() {
		return furColor;
	}

	public Mammal() {
		// default constructor
	}

	public void setTemp(double t) {
		temp = t;
	}
	public double getTemp() {
		return temp;
	}
	public void Eat() {
		System.out.println("Mammal:: Eat()");
	}

	public void Drink() {
		System.out.println("Mammal:: Drink()");
	}

	public void Move() {
		System.out.println("Mammal:: Move");
	}
}

class Dog extends Mammal {
	int age;
	private String name;
	public boolean isWild;

	public void Bark() {
		System.out.println("Dog:: Bark!!!");
	}
}

public class InheritanceClass {

	public static void main(String[] args) {

		Mammal m1 = new Mammal();
		m1.Drink();
		m1.weight = 1.3f;
		m1.setTemp(12.0);
		System.out.println("m1.weight= " + m1.weight);
		System.out.println(m1.getTemp());
		m1.setFurColor("Black");
		System.out.println(m1.getFurColor());
		
		
		
		Dog d1;
		d1= new Dog();
		d1.Bark();
		d1.age= 12;
		System.out.println("d1.age= " +d1.age);
	}

}
