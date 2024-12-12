/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Give a int.");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("Give and int bigger than the last one.");
		int num2 = sc.nextInt();
		int int1 = (int)(Math.random()*(num2-num1))+num1;
		int int2 = (int)(Math.random()*(num2-num1))+num1;
		int int3 = (int)(Math.random()*(num2-num1))+num1;
		int int4 = (int)(Math.random()*(num2-num1))+num1;
		int int5 = (int)(Math.random()*(num2-num1))+num1;
		System.out.println("Your range is "+ num1+" to "+num2);
		System.out.println("Here are 5 numbers in that range");
		System.out.print(int1+", "+int2+", "+int3+", "+int4+", "+int5);
		
	
	
	}
}
