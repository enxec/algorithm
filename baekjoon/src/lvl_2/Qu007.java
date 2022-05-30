package lvl_2;

import java.util.Scanner;

public class Qu007 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int A;
		int B;
		int C;
		int[] arr = new int[3];
		
		while (true) {
			A = scn.nextInt();
			
			if(A < 1 || A > 6) {
				System.out.println("첫번째 주사위를 다시돌려주세요.");
				continue;
			}
			break;
		}
		
		while (true) {
			B = scn.nextInt();
			
			if(B < 1 || B > 6) {
				System.out.println("두번째 주사위를 다시돌려주세요.");
				continue;
			}
			break;
		}
		
		while (true) {
			C = scn.nextInt();
			
			if(C < 1 || C > 6) {
				System.out.println("세번째 주사위를 다시돌려주세요.");
				continue;
			}
			break;
		}
		
		if(A == B && B == C) {
			System.out.println(10000 + A * 1000);
		} else if(A == B || A == C) {
			System.out.println(1000 + A * 100);
		} else if(B == C) {
			System.out.println(1000 + B * 100);
		} else {
			System.out.println(Math.max(A, Math.max(B, C)) * 100);
		}
	}

}
