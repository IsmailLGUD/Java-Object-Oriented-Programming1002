package ArrayList;

import java.util.ArrayList;

public class ArrayListAdd {

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList();
		
		cars.add("Volvo");
		cars.add("Honda");
		cars.add("BMW");
		cars.add("Tesla");
		cars.add("Volvo");
		cars.add("Honda");
		cars.add("BMW");
		cars.add("Tesla");
		cars.add("Volvo");
		cars.add("Honda");
		cars.add("BMW");
		cars.add("Tesla");
		cars.add("1");
		
		System.out.println("Cars = "+ cars);
		System.out.println("Size of cars: "+ cars.size());
		
		cars.remove("Tesla");
		
		System.out.println("Cars = "+ cars);
		System.out.println("Size of cars: "+ cars.size());

	}

}
