/*
 *	Author:AJ Conroy
 *  Date: 9/9/25
 *	Collaborator(s): None
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Please enter a number:");
int bob = sc.nextInt();
double bobby = bob;
System.out.println(" ");
System.out.println("Here are the next five numbers!");
System.out.println(bob + "," + (bob + 1) + "," + (bob + 2) + "," + (bob + 3) + "," + (bob + 4));
System.out.println(" ");
System.out.println("Here are the next 5 multiples of "+bob+"!");
System.out.println(bob + "," + (bob*2) + "," + (bob*3) + "," + (bob*4) + "," + (bob*5));
System.out.println(" ");
System.out.println("Here is "+bob+" divided by 100!");
double cheese = bobby/100;
System.out.println(cheese);
System.out.println(" ");
System.out.println("Here is "+bob+" divided by 10!");
cheese = bobby/10;
System.out.println(cheese);
	}
}
