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
		System.out.println("enter your name: ");
		String name = sc.nextLine();
		
		
		int space = name.indexOf(" ");
		System.out.println("Your last name is "+name.substring(space+1)+" and its "+name.length()+" letters long.");
		
		
		
		
		


		
	}
}
