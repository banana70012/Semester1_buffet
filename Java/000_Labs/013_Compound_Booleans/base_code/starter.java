/*
 *	Author:  AJ Conroy
 *  Date: 9/17/25
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your first number:");
		int cheesy = sc.nextInt();
		System.out.print("Please enter your second number:");
		int bobby = sc.nextInt();
		System.out.print("Please enter your third number:");
		int bobcheese = sc.nextInt();
		int big = 0;
		int small = 0;
		String thing1 = "bob";
		String thing2 = "bob";
		
		/*finding the biggest number*/
		
		if(bobby > bobcheese && bobby > cheesy){
		big = bobby;
		thing1 = new String("second");
		}
		if(bobcheese > bobby && bobcheese > cheesy){
		big = bobcheese;
		thing1 = new String("third");
		}
		if(cheesy > bobby && cheesy > bobcheese){
		big = cheesy;
		thing1 = new String("first");
		}
		
		/*finding the smallest number*/
		
		if(bobby < cheesy && bobby < bobcheese){
		small = bobby;
		thing2 = new String("second");
		}
		if(cheesy < bobby && cheesy < bobcheese){
		small = cheesy;
		thing2 = new String("first");
		}
		if(bobcheese < bobby && bobcheese < cheesy){
		small = bobcheese;
		thing2 = new String("third");
		}
		
		System.out.println("Your "+thing1+" was the largest of the three!");
		System.out.println("The number was "+big+".");
		System.out.println("Your "+thing2+" was the smallest of the three!");
		System.out.println("The number was "+small+".");
		}
	}

