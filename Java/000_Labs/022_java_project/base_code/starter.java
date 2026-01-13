/*
 *	Author:AJ Conroy
 *  Date:10/14/25
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int dalladalla = 100;
	String chicken = "0";
	int bet = 0;
	int num1 = 0;
	int num2 = 0;
	int num3 = 0;
	System.out.println("Slot Machine Rules:");	
	System.out.println("1) Each player starts with $100!");	
	System.out.println("2) Input a wager less than your total amount of money!");
	System.out.println("3) The slot machine will roll 3 numbers from 1 to 10!");
	System.out.println("       a) If 2 numbers match, you double your money!!!!");
	System.out.println("       b) If 3 numbers match, you triple your money!!!!!!!!!!!!!!");
	System.out.println("       c) If none match, you lose your money.");
	System.out.println(" ");
	
	while(dalladalla>0){
	System.out.print("Would you like to play? (Yep/yep/Nah/nah):");
	chicken = sc.nextLine();
	if(chicken.equalsIgnoreCase("nah")){
	break;
	}
	else if(!(chicken.equalsIgnoreCase("nah")) && !(chicken.equalsIgnoreCase("yep"))){
	System.out.print("Please input one of the following(Yep/yep/Nah/nah): ");
	chicken = sc.nextLine();
	if(!(chicken.equalsIgnoreCase("nah")) && !(chicken.equalsIgnoreCase("yep"))){
	System.out.println("You are too dumb to play at this casino!");
	break;
	}
	else{
	System.out.println(" ");	
	}
	}
	System.out.print("You have $"+dalladalla+". How much would you like to wager? :");
	bet = sc.nextInt();
	System.out.println("Great! LETS PLAY!!!!");
	System.out.println("Your rolls are:");
	num1 = (int)(Math.random()*10);
	num2 = (int)(Math.random()*10);
	num3 = (int)(Math.random()*10);
	System.out.println("________________________________");
	System.out.println("|          |          |         |");
	System.out.println("|          |          |         |");
	System.out.println("|          |          |         |");
	System.out.println("|    "+num1+"     |   "+num2+"      |    "+num3+"    |");
	System.out.println("|          |          |         |");
	System.out.println("|          |          |         |");
	System.out.println("|          |          |         |");
	System.out.println("________________________________");
	if(num1==num2 || num1==num3 || num2==num3 && !(num1==num2 && num2==num3)){
	System.out.println("You Won! Your wager has been doubled!");
	dalladalla = bet*2+dalladalla;
	}
	else if(num1==num2 && num2==num3){
	System.out.println("You Won! Your account balance has been tripled!");
	dalladalla = bet*2+dalladalla;
	}
	else{
	System.out.println("You lose! Better luck next time!");
	dalladalla = dalladalla-bet;
	
	}
	System.out.println("You now have $"+dalladalla);
		
	}
	
	
	if(dalladalla<0){
	System.out.println("You've run out of money! Thanks for coming! Come back soon!");
	}
	else{
	System.out.println("Sad to see you go! You still have $"+dalladalla+" left! Come again soon!!");
	}
	}
}
