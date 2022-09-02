package Inheritance;
class Mammal21 {
	public float weight;
	public int age;
	private double temp;
	// private int weight;
	private double IQ;
	private String furColor;
	
	public Mammal21() {
		// default constructor
	}
	

	
	public Mammal21(int a, float weight ) {
		age = a;
		this.weight = weight;
	}
	@Override
	public String toString() {
		 String s = " Mammal age = " + age + " and weight is "+ weight ;
		    return s;
	}

}

class Dog2 extends Mammal21 {
	int age;
	private String name;
	public boolean isWild;

	public void Bark() {
		System.out.println("Dog:: Bark!!!");
	}
	
}


public class OverrideToStringMethod {

	public static void main(String[] args) {
		Mammal21 m2 = new Mammal21(12, 1.2f);
		System.out.println(m2);
		
		
		Dog2 d1;
		d1= new Dog2();
		d1.Bark();
		d1.age= 12;
		System.out.println("d1.age= " +d1.age);



	}

   
}
