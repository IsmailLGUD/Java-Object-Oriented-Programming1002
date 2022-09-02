package ExceptionHandling;

public class ExceptionDemo {

	public static void main(String[] args) {


		try {
		int x = 10;
		int y =5;
		int z = 0;
		int result = x+y;
		int Exception = x/z;
		
		System.out.println("Result 2 "+ Exception);
		} catch(ArithmeticException e1) {
			
		System.out.println("Try Catch Exception: " + e1 );
		}finally {
			System.out.println("Try catch Finally Exception Handling");
		}

	}

}
