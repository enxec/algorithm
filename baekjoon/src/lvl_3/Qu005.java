package lvl_3;

import java.util.Scanner;

public class Qu005 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		long N;
		
		while (true) {
			N = scn.nextLong();
			
			if(N < 1 && N > 100000) {
				System.out.println("N할당 값을 다시 입력하세요.");
				continue;
			}
			break;
		}
		
		for (int i = 1; i <= N; i++) {
			System.out.println(i);
		}
	}
}
