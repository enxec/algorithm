package lvl_6;

import java.util.Scanner;

public class Qu004 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int T = scn.nextInt();
		for(int i = 0; i < T; i++) {
	
			int R = scn.nextInt();
			String S = scn.next();	// nextLine() 을 쓰면 error!
			
			for(int j = 0; j < S.length(); j++) {           
				for(int k = 0; k < R; k++) {	// R 만큼 반복 출력
					System.out.print(S.charAt(j));
				}
			}
            
			System.out.println();
		}
		
		scn.close();
	}
}
