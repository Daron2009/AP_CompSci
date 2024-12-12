/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Give an intiger:");
		int num = sc.nextInt ();
		double num3 = num;
		double num1 = num3/100;
		double num2 = num3/10;
		System.out.println("Here are the next 5 numbers!\n" + (num+1)+ ","+(num+2)+","+(num+3)+","+(num+4)+","+(num+5));
		System.out.println("Here are the next 5 multiples of "+num+"!\n"+ + (num*1)+ ","+(num*2)+","+(num*3)+","+(num*4)+","+(num*5));
		System.out.println("Here is "+num+" divided by 100!\n"+num1);
		System.out.print("Here is "+num+" divided by 10!\n"+num2);
		
		
	}
}
