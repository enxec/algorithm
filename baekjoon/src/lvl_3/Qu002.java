package lvl_3;

import java.util.Scanner;

public class Qu002 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int T = scn.nextInt();
		
		for (int i = 0; i < T; i++) {
			int A = scn.nextInt();
			int B = scn.nextInt();
			
			System.out.println(A + B);
		}
		
		scn.close();
	}

}
