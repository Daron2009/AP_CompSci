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
		
		System.out.print("Give 3 integers(hit enter inbetween each one)");
		int num1 = sc.nextInt();
		sc.nextLine();
		int num2 = sc.nextInt();
		sc.nextLine();
		int num3 = sc.nextInt();
		sc.nextLine();
		
		if(num1>num2&&num1>num3){
			System.out.println(num1 + " is the largest");
		}else if (num3>num2&&num3>num1){
			System.out.prinlnt(num3+" is the largest");
		}else{
			System.out.prinlnt(num2+" is the largest");
		}
		if (num1<num2&&num1<num3){
			System.out.print(num1 + " is the smallest");
		}else if (num3<num2&&num3<num1){
			System.out.print(num3+" is the smallest");
		}else{
			System.out.print(num2+" is the smallest");
		}
		
		
		
		
		
		
		
	}
}
