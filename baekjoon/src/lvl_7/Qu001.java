package lvl_7;

import java.util.Scanner;

public class Qu001 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
 
 
		int A = scn.nextInt();	// 불변 비용
		int B = scn.nextInt();	// 가변 비용
		int C = scn.nextInt(); 	// 상품 가격
        
		if (C <= B) {
			System.out.println("-1");
		} 
		else {
			System.out.println((A/(C-B))+1);
		}
		
		scn.close();
	}
}
