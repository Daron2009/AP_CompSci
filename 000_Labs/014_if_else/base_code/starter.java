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
		int rand = (int)(Math.random()*100);
		
		System.out.print("Give a number 1-1000"); 
		int guess = sc.nextInt();
		
		if(rand==guess){
			System.out.print("Correct!!!");
		}else{
			System.out.print("Wrong");
		}
	}
}
