package Inheritance;
class Mammal2 {
	public float weight;
	public int age;
	private double temp;
	// private int weight;
	private double IQ;
	private String furColor;
	
	public Mammal2() {
		// default constructor
	}
	

	public Mammal2(int i, float f) {
		// TODO Auto-generated constructor stub
	}


	}
	
	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}
	public String getFurColor() {
		return furColor;
	}

	
	
	public void setTemp(double temp) {
		this.temp= temp;
	}
	
	public String getTemp() {
		return "Private Mammal= " + temp;
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

class Dog2 extends Mammal2 {
	int age;
	private String name;
	public boolean isWild;

	public void Bark() {
		System.out.println("Dog:: Bark!!!");
	}
	public void Mammal2(int a, ) {
		age = a;
		weight = w;
	}
	@Override
	public String toString() {
		 String s = " Mammal age = " + age + " and weight is " + weight;
		    return s;
	}


public class OverrideToStringMethod {

	public static void main(String[] args) {
		Mammal2 m1 = new Mammal2();
		m1.Drink();
		m1.weight = 1.3f;
		m1.setTemp(12);
		System.out.println("m1.weight= " + m1.weight);
		System.out.println(m1.getTemp());
		
		m1.setFurColor("Black");
		System.out.println(m1.getFurColor());
		
		
		Mammal2 m2 = new Mammal2(1, 2.0f);
		//System.out.println(m2);
		
		
		Dog2 d1;
		d1= new Dog2();
		d1.Bark();
		d1.age= 12;
		System.out.println("d1.age= " +d1.age);



	}

}
