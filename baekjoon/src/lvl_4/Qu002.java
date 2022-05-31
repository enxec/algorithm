package lvl_4;

import java.util.Scanner;

public class Qu002 {

	public static void main(String[] args) {
		int cnt = 9;
		int[] arr = new int[cnt];
		Scanner scn = new Scanner(System.in);
		
		for (int i = 0; i < cnt; i++) {
			arr[i] = scn.nextInt();
		}
		
		int count = 0;
		int max = 0;
		int index = 0;
		
		for (int value : arr) {
			count++;
			
			if(value > max) {
				max = value;
				index = count;
			}
		}
		
		System.out.println(max + " " + index);
		scn.close();
	}
}
