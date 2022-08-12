package TwoDArray;

import java.util.Scanner;

public class DiagonalAdditionMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] A = new int[3][3];
		int SumDiagonal =0;
		int SumUpperTriangle =0;
		int SumLower=0;
		
		
		//Taking input from user
		System.out.println("Plese enter A Matrix: ");
		for (int row=0; row<3; row++) {
			for(int col =0; col<3; col++) {
				System.out.printf("A[%d][%d]= ", row, col);
				A[row][col]= sc.nextInt();
			}
		}
		
		//Printing Matrix Value
		System.out.print("\n\nA= ");
		for (int row=0; row<3; row++) {
			for(int col =0; col<3; col++) {
				System.out.print("\t" +A[row][col]);
			}
			System.out.println("");
		}
		
		
		//Diagonal, upper, lower addition
		System.out.print("Plese enter A Matrix: ");
		for (int row=0; row<3; row++) {
			for(int col =0; col<3; col++) {
			
				//Diagonal Addition
				if(row==col) {
					SumDiagonal = SumDiagonal+ A[row][col];
				}
				
				//Upper Triangle
				if(row<col){
					SumUpperTriangle = SumUpperTriangle+ A[row][col];
				}
				
				//Lower Trianlge Addition
				if(row>col) {
					SumLower = SumLower + A[row][col];
				}
					
				}
			
		}
		
		System.out.println("Sum of Diagonal Elements: "+ SumDiagonal);
		System.out.println("Sum of Upper Triangle Elements: "+ SumUpperTriangle);
		System.out.println("Sum of Lower Triangle Elements: "+ SumLower);


	}
}


