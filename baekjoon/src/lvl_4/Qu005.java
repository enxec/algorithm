package lvl_4;

import java.util.Arrays;
import java.util.Scanner;

public class Qu005 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int N = scn.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		Arrays.sort(arr);
		double M = arr[arr.length - 1];
		double subCon;
		double subAvg = 0;
		
		for (int i = 0; i < arr.length; i++) {
			subCon = Math.round(arr[i] / M * 100);
			subAvg += subCon;
		}
		
		System.out.println(subAvg / N);
		
		scn.close();
	}
}
