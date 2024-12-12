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
		int int1 = (int) (Math.random() * 10);
		int int2 = (int) (Math.random() * 100);
		double dub1 = Math.random() * 1;
		double dub2 = Math.random() * 575;
		
		System.out.print("A. "+int1+"\n"+"B. "+(int2+1)+"\n"+"C. "+(dub1+2.5)+"\n"+"D. "+(dub2+14)+"\n");
	}
}
