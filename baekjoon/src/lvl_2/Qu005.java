package lvl_2;

import java.util.Scanner;

public class Qu005 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int hour = scn.nextInt();
		int minute = scn.nextInt();
		
		if(minute < 45) {
			hour--;
			minute = 60 - (45 - minute);
			if(hour < 0) {
				hour = 23;
			}
			System.out.println(hour + " " + minute);
		} else {
			System.out.println(hour + " " + (minute - 45));
		}
	}

}
