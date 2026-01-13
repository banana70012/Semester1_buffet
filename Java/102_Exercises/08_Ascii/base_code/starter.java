/*
 *	Author:AJ Conroy
 *  Date:9/29/25
 *	Collaborator(s): none
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Enter a word:"); 
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		if(word.equals("cat")){
		System.out.println(" ^_______^");
		System.out.println("| 0     0 |");	
		System.out.println("|   -><-  |");	
		System.out.println("|    __   |");	
		System.out.println("  _______");	
		}
		else if(word.equals("phone")){
		System.out.println("__________");
		System.out.println("|         |");	
		System.out.println("|  Phone  |");	
		System.out.println("|         |");	
		System.out.println("|         |");	
		System.out.println("|         |");	
		System.out.println("|         |");	
		System.out.println("|_________|");	
		System.out.println("|    0    |");	
		System.out.println("__________");
		
		}
		else if(word.equals("face")){
		System.out.println(" __________");
		System.out.println(" |         |");
		System.out.println(" |_      / |");
		System.out.println(" |o      o |");
		System.out.println(" |  ____   |");
		System.out.println("  _________");
		}
		else{
		System.out.println("Type something else!");
		}
	}
}
