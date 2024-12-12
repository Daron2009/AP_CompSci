/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an intiger:");
		int x = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter another intiger:");
		int y = sc.nextInt();
		sc.nextLine();
		
		if(x%2 == 0){
			System.out.println("Your 1st int is even");
		}else{
			System.out.println("Your 1st int is odd");
		}
		if(x%3 == 0){
			System.out.println("Your 1st int is divisable by 3");
		}
		if(x%4 == 0){
			System.out.println("Your 1st int is divisable by 4");
		}
		if(x%5 == 0){
			System.out.println("Your 1st int is divisable by 5");
		}
		if(x%3 !=0 && x%4 != 0 && x%5 !=0){
			System.out.println("Your 1st int isn't divisable by 3,4, and 5");
		}
		if(y%2 == 0){
			System.out.println("Your 2nd int is even");
		}else{
			System.out.println("Your 2nd int is odd");
		}
		if(y%3 == 0){
			System.out.println("Your 2nd int is divisable by 3");
		}
		if(y%4 == 0){
			System.out.println("Your 2nd int is divisable by 4");
		}
		if(y%5 == 0){
			System.out.println("Your 2nd int is divisable by 5");
		}
		if(y%3 !=0 && y%4 != 0 && y%5 !=0){
			System.out.println("Your 2nd int isn't divisable by 3,4, and 5");
		}
		
		
		
	}
}
