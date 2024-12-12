/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Would you like to be a Wizard, Warrior, or a Rogue? "); 
		String q = sc.nextLine();
		if(q.equals("Wizard")){
			System.out.print("Your a Wizard.");
		}else if(q.equals("Warrior")){
			System.out.print("Your a Warrior.");
		}else if(q.equals("Rogue")){
			System.out.print("Your a Rogue.");
		}else{
			System.out.print("You entered something incorrectly.");
		}
		
		
		
		
	}
}
