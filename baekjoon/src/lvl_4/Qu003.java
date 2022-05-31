package lvl_4;

import java.util.Scanner;

public class Qu003 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int A = scn.nextInt();
		int B = scn.nextInt();
		int C = scn.nextInt();
		
		int sum = A * B * C;
		String numstr = Integer.toString(sum);
		int[] arr = new int[numstr.length()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(numstr.substring(i, i + 1));
		}
		
		for (int i = 0; i < 10; i++) {
			int cnt = 0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[j] == i) {
					cnt++;
				}
			}
			System.out.println(cnt);
			cnt = 0;
		}
		scn.close();
	}
}
