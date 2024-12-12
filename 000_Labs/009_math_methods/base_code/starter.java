/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Give a x value: ");
		Double x = sc.nextDouble();
		System.out.print("Give a y value: ");
		Double y = sc.nextDouble();
		
		double num1 = Math.max(x,y);
		System.out.println("The max of "+x+" and "+y+" is "+num1);
		double num2 = Math.sqrt(y);
		System.out.println("The square root of "+y+" is "+num2);
		double num3 = Math.pow(x,y);
		System.out.println("The power of ("+x+","+y+" is "+num3);
		
		
		
	}
}
