package lvl_4;

import java.util.HashSet;
import java.util.Scanner;

public class Qu004 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[10];
		HashSet<Integer> hs = new HashSet<>();
		int A;
		
		for (int i = 0; i < 10; i++) {
			A = scn.nextInt();
			int rem = A % 42;
			arr[i] = rem;
			hs.add(arr[i]);
		}
		
		System.out.println(hs.size());
		
		scn.close();
	}
}
