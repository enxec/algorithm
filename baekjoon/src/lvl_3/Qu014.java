package lvl_3;

import java.util.Scanner;

public class Qu014 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		 
		int N = scn.nextInt();
		scn.close();
        
		int cnt = 0;
		int copy = N;
        
		while (true) {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			cnt++;
 
			if (copy == N) {
				break;
			}
		}
		System.out.println(cnt);
	}
}
