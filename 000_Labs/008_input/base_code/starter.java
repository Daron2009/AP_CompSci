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
		System.out.print("What's your first name? "); 
		String name = sc.nextLine ();
		System.out.print("How old are you? "); 
		int age = sc.nextInt ();
		sc.nextLine();
		System.out.print("What month were you born? "); 
		String month = sc.nextLine ();
		System.out.print("What day were you born? "); 
		int day = sc.nextInt ();
		sc.nextLine();
		System.out.print("What year were you born? "); 
		int year = sc.nextInt ();
		sc.nextLine();
		System.out.print("How much is a buck fifty? "); 
		Double money = sc.nextDouble ();
		
		
		System.out.print("Hi, my name is " + name + " and I am "+age+" years old. My birthday is "+month+"/"+ day+"/" +year+" and a buck fifty is $"+ money+"."); 
	}
}
