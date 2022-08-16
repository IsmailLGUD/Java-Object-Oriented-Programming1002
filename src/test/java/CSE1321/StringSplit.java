package CSE1321;

public class StringSplit {

	public static void main(String[] args) {
		String s1 = "A, B, C, D";
		String[] tokens = s1.split(",");
		
		for (int i = 0; i < tokens.length; i++) {
			System.out.print(tokens[i]);
		}

	}

}
