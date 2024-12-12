/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static int pow(int x,int y) {
		int counter=1;
		int power = x;
		while(counter<y){
			power = power*x;
			counter = counter +1;
			
		}
		
		return power;
			
	}
	
	public static void main(String args[]) {
		// Your code goes below here

		int num = pow(4,4);
		System.out.print(num);

		
	}
}
