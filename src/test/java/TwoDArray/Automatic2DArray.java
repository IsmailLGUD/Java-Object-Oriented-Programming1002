package TwoDArray;

public class Automatic2DArray {

	public static void main(String[] args) {
		
		int [][] number = new int [4][5];
		int k =0;
		
		//Assigning the value 
		for(int row=0; row<4; row++) {
			for(int col=0; col<5; col++) {
				number[row][col]= k;
				k++;
			}

		}
		
		//printing elements
		for(int row=0; row<4; row++) {
			for(int col=0; col<5; col++) {
				System.out.print("\t" +number[row][col]);
				
			}
			System.out.println();

		}
		

	}

}
