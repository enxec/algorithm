package lvl_3;

import java.util.Scanner;

public class Qu003 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int num = 0;
		
		for (int i = 1; i <= n; i++) {
			num += i;
		}
		
		System.out.println(num);
		scn.close();
	}

}
