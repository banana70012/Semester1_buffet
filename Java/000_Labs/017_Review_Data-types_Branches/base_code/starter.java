/*
 *	Author:  AJ Conroy
 *  Date: 9/24/25
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String bob = "unaligned";
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("What is your title? ex: Slayer of Dragons");
		String title = sc.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior, or Rouge");
		String cheese = sc.nextLine();
		int skpt = 20;
		if(cheese.equalsIgnoreCase("wizard")){
			 bob = "Wizard";
			System.out.println("You have choosen the Wizard! Excelsior!");
		}
		else if(cheese.equalsIgnoreCase("warrior")){
			 bob = "Warrior";
			System.out.println("You have choosen the Warrior! For honor!");
		}
		else if(cheese.equalsIgnoreCase("rouge")){
			 bob = "Rouge";
			System.out.println("You have choosen the Rouge! How cunning!");
		}
		else{
		System.out.println("You have decided not to choose a role. Rerun program.");	
		}
		System.out.println(" ");
		System.out.println("You have 20 skill points to spend on the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely");
		System.out.println(" ");
		
		System.out.print("Strength (1-10): ");
		int strength = sc.nextInt();
		if(!(strength <= 10 && strength >= 1 && strength <= skpt)){
			System.out.print("Pick a number in the correct range:");
			strength = sc.nextInt();
		if(!(strength <= 10 && strength >= 1 && strength <= skpt)){
				System.out.print("STOP CHEATING! PICK THE CORRECT NUMBER:");
			strength = sc.nextInt();}
			if(!(strength <= 10 && strength >= 1 && strength <= skpt)){
			System.out.println("I give up. CHEATER!");
			title = "CHEATER";}
		}
		skpt = skpt-strength;
		System.out.println("You have "+skpt+" skill points left!");
		System.out.println(" ");
		System.out.print("Dexterity (1-10): ");
		int dexterity = sc.nextInt();
		
		if(!(dexterity <= 10 && dexterity >= 0 && dexterity <= skpt)){
			System.out.print("Pick a number in the correct range:");
			dexterity = sc.nextInt();
		if(!(dexterity <= 10 && dexterity >= 0 && dexterity <= skpt)){
				System.out.print("STOP CHEATING! PICK THE CORRECT NUMBER:");
			dexterity = sc.nextInt();}
		if(!(dexterity <= 10 && dexterity >= 0 && dexterity <= skpt)){
			System.out.println("I give up. CHEATER!");
			title = "CHEATER";
			
		}
		}
		skpt = skpt-dexterity;
		System.out.println("You have "+skpt+" skill points left!");
		System.out.println(" ");
		System.out.print("Intelligence (1-10): ");
		int intelligence = sc.nextInt();
		if(!(intelligence <= 10 && intelligence >= 0 && intelligence <= skpt)){
			System.out.print("Pick a number in the correct range:");
			intelligence = sc.nextInt();
		if(!(intelligence <= 10 && intelligence >= 0 && intelligence <= skpt)){
				System.out.print("STOP CHEATING! PICK THE CORRECT NUMBER:");
			intelligence = sc.nextInt();}
		if(!(intelligence <= 10 && intelligence >= 0 && intelligence <= skpt)){
			System.out.println("I give up. CHEATER!");
			title = "CHEATER";
			
		}
		}
		skpt = skpt-intelligence;
		System.out.println("You have "+skpt+" skill points left!");
		System.out.println(" ");
		System.out.print("Charisma (1-10): ");
		int charisma = sc.nextInt();
		if(!(charisma <= 10 && charisma >= 0 && charisma <= skpt)){
			System.out.print("Pick a number in the correct range:");
			charisma = sc.nextInt();
		if(!(charisma <= 10 && charisma >= 0 && charisma <= skpt)){
				System.out.print("STOP CHEATING! PICK THE CORRECT NUMBER:");
			charisma = sc.nextInt();}
		if(!(charisma <= 10 && charisma >= 0 && charisma <= skpt)){
			System.out.println("I give up. CHEATER!");
			title = "CHEATER";
		}
		}
		skpt = skpt-charisma;
		System.out.println("You have "+skpt+" skill points left!");
		System.out.println(" ");
		System.out.println("------------------------------------------------");
		System.out.println("You are "+name+", the "+title+" of CVHS.");
		System.out.println("You're a "+bob+" with the following stats!");
		System.out.println("Strength - "+strength);
		System.out.println("Dexterity - "+dexterity);
		System.out.println("Intelligence - "+intelligence);
		System.out.println("Charisma - "+charisma);
		System.out.println(" ");
		System.out.println("Good luck on your quest "+name+"!");
}
}