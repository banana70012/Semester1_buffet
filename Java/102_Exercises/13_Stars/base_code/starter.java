/*
 *	Author:AJ Conroy
 *  Date:10/14/25
 *	Collaborator(s): none
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter an integer: ");
	int cheese = sc.nextInt();
	System.out.println(" ");
	cheese++;
	int lnn = 1;
	int stary = 1;
	int clone = 0;
while(cheese>lnn){
while(stary>clone){
System.out.print("*");
clone++;
	
}
clone = 0;
stary++;
System.out.println(" ");
lnn++;
}
}
	}

