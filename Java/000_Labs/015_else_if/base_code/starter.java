/*
 *	Author:  AJ Conroy
 *  Date: 9/18/25
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int bob = (int)(Math.random()*999+1);
	System.out.print("Pick a number between 1-1000: ");
	int cheese = sc.nextInt();
	if(bob == cheese){
	System.out.println("There is no way! You got it!");
	}
	else if (bob>cheese){
	System.out.println("Your number was smaller than the number. The number was "+bob);
			
		}
		else if (bob<cheese){
	System.out.println("Your number was larger than the number. The number was "+bob);
			
		}
	}
}
