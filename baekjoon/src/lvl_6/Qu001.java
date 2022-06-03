package lvl_6;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Qu001 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String S = scn.next();
		byte[] bt = S.getBytes(StandardCharsets.US_ASCII);
		
		System.out.println(bt[0]);
	}

}
