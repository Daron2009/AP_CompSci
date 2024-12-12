/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("What's your name?");
		String name = sc.nextLine();
		System.out.println("How many times should I print in");
		int num = sc.nextInt();
		int x = 0;
		while(x<num){
			System.out.println(name);
			x=x+1;
		}


		
	}
}
