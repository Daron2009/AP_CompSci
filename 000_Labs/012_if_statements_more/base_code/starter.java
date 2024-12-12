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
		System.out.print("Give and int");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("Give another int");
		int num2 = sc.nextInt();
		if(num1 == num2){
			System.out.println("The numbers are the same");
		}else{
			System.out.println("The numbers aren't the same");
		}
	}
}
