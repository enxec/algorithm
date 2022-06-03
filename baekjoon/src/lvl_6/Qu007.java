package lvl_6;

import java.util.Scanner;

public class Qu007 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int a = scn.nextInt();
		int b = scn.nextInt();
		
		int rst1 = flip(a); 
		int rst2 = flip(b); 
				
		if(rst1 > rst2) {
			System.out.println(rst1);
		} else {
			System.out.println(rst2);
		}
		scn.close();
	}
	
	public static int flip(int num){
        int result = 0;
        while(num != 0){
            result= result * 10 + num % 10;
            num /= 10;
        }
        return result;
    }
}
