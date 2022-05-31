package lvl_4;

import java.util.Scanner;

public class Qu006 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int N = scn.nextInt();
		String[] arr = new String[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.next();
		}
		
		scn.close();
		
		for (int i = 0; i < arr.length; i++) {
			
			int cnt = 0;
			int sum = 0;
			
			for (int j = 0; j < arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') {
					cnt++;
				} else {
					cnt = 0;
				}
				sum += cnt;
			}
			System.out.println(sum);
		}
	}
}
