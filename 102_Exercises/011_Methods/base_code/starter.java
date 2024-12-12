/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/
import java.util.Scanner;
import java.util.Random;


class starter {
	// The goal of the first method is to give back whether the year given is a leap year or not. 2004 is a leap year.
	public static boolean isLeapYear(int year){
		boolean leap = false;
		if(year%4==0){
			leap = true;
		}else{
			leap = false;
		}
		return leap;
	}
	public static int getDigitSum(int number){
		int num1 = number/10000; 
		int num2 = (number-(num1*10000))/1000;
		int number1 = number-(num1*10000+num2*1000);
		int num3 = number1/100;
		int number2 = number-(num1*10000+num2*1000+num3*100);
		int num4 = number2/10;
		int number3 = number-(num1*10000+num2*1000+num3*100+num4*10);
		int num5 = number3/1;
		
		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5);
		int x=num1+num2+num3+num4+num5;
		
		return x;	
	}
	public static void printIfConsecutive(int x, int y, int z){
		String q = new String("Its not consevutive");
		
		if(x+1==y&&y+1==z){
			q=("Its consecutive");
		}else{
			q=("Its not consecutive");
		}
		System.out.print(q);
	}
	// The goal of the second method is to add all the digits of a number up. Ex: 12345 has a total of 15.

	// The goal of the third method is to check if 3 numbers are consecutive. 15 16 17 are consecutive. It will print if they are or not.
	// Assume that the first number is always the smallest and the third number is always the largest.

	public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		System.out.println();
		if(isLeapYear(year))
			System.out.println(year + " is a leap year!");
		else
			System.out.println(year + " is not a leap year!");

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		System.out.println();
		System.out.println("The sum of the digits of " + number + " is " + sum);

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		System.out.println("Enter a number");
		int num3 = sc.nextInt();
		System.out.println();
		printIfConsecutive(num1, num2, num3);
		System.out.println();
		System.out.println("----------------------------------------");
		
	}
}
