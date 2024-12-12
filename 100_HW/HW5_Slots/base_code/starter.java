/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		int q = 0;
		int money = 100;
		int rand1;
		int rand2;
		int rand3;
		
		while(q==0){
			System.out.println("You have $"+money+" would you like to gamble it?(Yes, yes, Y, y)");
			String y = sc.nextLine();
			if(y.equals("Yes")||y.equals("yes")||y.equals("Y")||y.equals("y")){
				System.out.println("How much do you want to gammble?");
				int x = sc.nextInt();
				sc.nextLine();
				if(money<x){
					System.out.println("You dont have enough money and got kicked out");
					q=1;
				}else {
			
					money = money-x;
					
					rand1 = (int)(Math.random()*10);
					rand2 = (int)(Math.random()*10);
					rand3 = (int)(Math.random()*10);
					System.out.println("|"+rand1+"|"+rand2+"|"+rand3+"|");
					if(rand1 == rand2||rand1==rand3||rand2==rand3){
						System.out.println("You won!!");
						money = money+(x*2);
					}else if(rand1==rand2&&rand1==rand3){
						System.out.println("You won alot!!");
						money = money+(x*3);
					}else{
						System.out.println("You lost, try again");
					}
			}
			}else if(y.equals("No")||y.equals("no")||y.equals("N")||y.equals("n")){
					System.out.println("You suck");
					q=1;
			}else{
					System.out.print("You entered something wrong");
			}
			
		}
		
		
		
		

	}	
}
