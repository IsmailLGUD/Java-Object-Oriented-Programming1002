package TwoDArray;

public class TwoDArrayLoop {

	public static void main(String[] args) {
		int[][] semeseter = new int[2][3];
		semeseter[0][0] = 1;
		semeseter[0][1] = 2;
		semeseter[0][2] = 3;
		semeseter[1][0] = 4;
		semeseter[1][1] = 5;
		semeseter[1][2] = 6;
		
		for(int row=0; row<2; row++) {
			for(int column = 0; column<3; column ++) {
				System.out.print("\t " + semeseter[row][column]);
			}
			System.out.println("");
		}

	}

}
