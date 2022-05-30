package lvl_2;

import java.util.Scanner;

public class Qu006 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int hour = scn.nextInt();
		int minute = scn.nextInt();
		int ct = scn.nextInt();
		
		int mct = minute + ct;
		
		if(mct > 59) {
			hour = hour + (mct / 60);
			
			if(hour > 23) {
				hour = hour % 24;
			}
			minute = mct % 60;
			
			System.out.println(hour + " " + minute);
		} else {
			System.out.println(hour + " " + mct);
		}
	}

}
