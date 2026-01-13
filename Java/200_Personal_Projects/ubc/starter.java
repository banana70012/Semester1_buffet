/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int cheese = 1;
while(true){
	if(cheese == 1){
	System.out.println("1-----");	
	}
	if(cheese == 2){
	System.out.println("-1----");		
	}
	if(cheese ==3){
	System.out.println("--1---");		
	}
	if(cheese == 4){
	System.out.println("---1--");	
	}
	if(cheese == 5){
	System.out.println("----1-");		
	}
	if(cheese == 6){
	System.out.println("-----1");		
	}
	if(cheese == 7){
	System.out.println("------1");		
	}
	if(cheese>7){
		cheese = 1;
	}
System.out.println("\033[H\033[2J");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
	cheese++;
}

		
	}
}
