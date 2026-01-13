/*
    Lecture note example - Input!!
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Welcome to AJ's 🤑fancy🤑 burger joint");
        System.out.println("Here's our menu:");
        System.out.println(" ");
        System.out.println("1.🍔 Cheese burger - $15.99");
        System.out.println(" ");
        System.out.println("2.🍟 Fries - $10.99");
        System.out.println(" ");
        System.out.println("3.🍹Soft drink (REFILS $2) - $5.99");
        System.out.println(" ");
        
        System.out.println("What's the name for the order?");
        String name = sc.nextLine();
        System.out.println(" ");
        System.out.println("How many cheese burgers would you like?");
        int item1 = sc.nextInt();
        System.out.println(" ");
        System.out.println("How many fries would you like?");
        int item2 = sc.nextInt();
        System.out.println(" ");
        System.out.println("How many drinks would you like?");
        int item3 = sc.nextInt();
        System.out.println(" ");
        
        System.out.println("How much will you like to tip?");
        double tip = sc.nextDouble();
        double price1 = item1*15.99;
        double price2 = item1*10.99;
        double price3 = item1*5.99;
        System.out.println(" ");
        System.out.println("--------------------------------------");
        System.out.println("      AJ's Fancy Burger Joint");
        System.out.println(" ");
        System.out.println("            For "+name);
        System.out.println("     "+item1+"x Cheeseburgers = $"+price1);
        System.out.println("     "+item2+"x Fries = $"+price2);
        System.out.println("     "+item3+"x Soft Drinks = $"+price3);
        System.out.println("     Tip = $"+tip);
        System.out.println("         50% gratuity");
        double total = price1+price2+price3+tip;
        total = total*1.3;
        System.out.println("     Your Grand Total Is: ");
        System.out.println("          $"+total);
        System.out.println("        NO REFUNDS!");
        System.out.println("--------------------------------------");

	}
}
