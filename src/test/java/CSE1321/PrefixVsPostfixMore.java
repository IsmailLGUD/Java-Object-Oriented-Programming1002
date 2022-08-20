package CSE1321;

public class PrefixVsPostfixMore {

	public static void main(String[] args) {
		 int x=0;
		 int y=0;
		    for(int i=1; i<5; i++){
		      System.out.print("X = " + x++ + "\t");
		      System.out.println("Y = "+ ++y);
		      ++x; y++;
		    }

	}

}
