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
		
		int rand = (int)(Math.random()*1000);
		System.out.println("guess the number(out of 1000)");
		int x = sc.nextInt();
		sc.nextLine();
		while(true){
			if(x==rand){
				break;
			}
			System.out.print("wrong try again!");
			x=sc.nextInt();
			sc.nextLine();
		}
		


		
	}
}
