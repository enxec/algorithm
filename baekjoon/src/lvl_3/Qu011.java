package lvl_3;

import java.util.Scanner;

public class Qu011 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int N = scn.nextInt();
		int X = scn.nextInt();
		int[] seq = new int [N];		
		
		for (int i = 0; i < N; i++) {
			seq[i] = scn.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			if(seq[i] < X) {
				System.out.print(seq[i] + " ");
			}
		}
	}
}
