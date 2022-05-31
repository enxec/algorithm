package lvl_3;

import java.util.Scanner;

public class Qu013 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		while (scn.hasNextInt()) {
			int A = scn.nextInt();
			int B = scn.nextInt();
			
			System.out.println(A + B);
		}
		scn.close();
	}
}
