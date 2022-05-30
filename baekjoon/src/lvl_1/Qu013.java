package lvl_1;

import java.util.Scanner;

public class Qu013 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int A = scn.nextInt();
		int B = scn.nextInt();
		
		int one = B % 10;
		int two = (B / 10) % 10;
		int three = ((B / 10) / 10) % 10;
		
		System.out.println(A * one);
		System.out.println(A * two);
		System.out.println(A * three);
		System.out.println(A * B);
	}

}
