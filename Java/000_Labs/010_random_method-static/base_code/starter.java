/*
 *	Author: AJ Conroy 
 *  Date: 9/10/25
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int cheesy = (int)(Math.random() * 10);
		int bobby = (int)(Math.random() * 100+1);
		double bob = Math.random() * 1+2.5;
		double bobcheesy = Math.random() * 575+14;
		System.out.println("A number between 0 and 9: "+cheesy);
		System.out.println("A number between 1 and 100: "+bobby);
		System.out.println("A double between 2.5 and 3.5: "+bob);
		System.out.println("A double between 14 and 589: "+bobcheesy);
	}
}
