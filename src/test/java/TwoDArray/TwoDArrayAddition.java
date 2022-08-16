package TwoDArray;

import java.util.Scanner;

public class TwoDArrayAddition {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int [][]A= new int [2][3];
		int [][]B= new int [2][3];
		
		System.out.println("Please enter A Matrix: ");
		for(int row=0; row <2; row++) {
			for(int col=0; col <3; col++) {
				System.out.printf("A[%d][%d] = ", row, col);
				A[row][col]= sc.nextInt();
			}
		}
		System.out.print("\nA= ");
		for(int row=0; row <2; row++) {
			for(int col=0; col <3; col++) {
				System.out.print("\t " + A[row][col]);
			}
			System.out.println("");
		}

		System.out.println("\nPlease enter B Matrix: ");
		for(int row=0; row <2; row++) {
			for(int col=0; col <3; col++) {
				System.out.printf("B[%d][%d] = ", row, col);
				B[row][col]= sc.nextInt();
			}
		}

		System.out.print("\nB= ");
		for(int row=0; row <2; row++) {
			for(int col=0; col <3; col++) {
				System.out.print("\t " + B[row][col]);
			}
			System.out.println("");
		}

	}

}
