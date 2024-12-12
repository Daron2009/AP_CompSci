/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
	
		myCharacter x = new myCharacter();
		System.out.print("Choose a role(Wizard, Warrior, Rogue, none): " );
		String y = sc.nextLine();
		myCharacter test = new myCharacter(y);


		
	}
}
