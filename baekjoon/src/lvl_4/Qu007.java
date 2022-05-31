package lvl_4;

import java.util.Scanner;

public class Qu007 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int[] arr;
		
		int testcase = scn.nextInt();
		
		for(int i = 0 ; i < testcase ; i++) {
 
			int N = scn.nextInt();	
			arr = new int[N];
			
			double sum = 0;	
			
			// 성적 입력부분 
			for(int j = 0 ; j < N ; j++) {
				int val = scn.nextInt();
				arr[j] = val;
				sum += val;	
			}
			
			double mean = (sum / N);
			double count = 0; 
			
			for(int j = 0 ; j < N ; j++) {
				if(arr[j] > mean) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n", (count/N)*100);
		}
		
		scn.close();
	}
}
