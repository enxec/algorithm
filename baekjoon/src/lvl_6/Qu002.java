package lvl_6;

import java.util.Scanner;

public class Qu002 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		 
		int N = scn.nextInt();
		String a = scn.next();
		scn.close();
		
		int sum = 0;
        
		for(int i = 0; i < N; i++) {
			sum += a.charAt(i)-'0';
		}
		System.out.print(sum);
	}

}
