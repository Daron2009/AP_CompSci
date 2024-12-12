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
		Scanner sc = new Scanner(System.in);
		System.out.print("What's your characters name?");
		String name = sc.nextLine();
		System.out.println("Whats the character title?(ex:King of CVHS)");
		String title = sc.nextLine();
		System.out.print("Would you like to be a Wizard, Warrior, or a Rogue? "); 
		String q = sc.nextLine();
		if(q.equals("Wizard")){
			System.out.println("Your a Wizard.");
		}else if(q.equals("Warrior")){
			System.out.println("Your a Warrior.");
		}else if(q.equals("Rogue")){
			System.out.println("Your a Rogue.");
		}else{
			System.out.println("You entered something incorrectly.");
			System.exit(0);
			
		}
		
		int points = 20;
		if(points>0){
			System.out.println("You have "+points+" points.");
			System.out.println("You must spend yout points wisely)");
			System.out.print("Strength (1-10): ");
			int x = sc.nextInt();
			sc.nextLine();
			if(x>10){
				System.out.println("Up to ten nothing more. try again");
				x = sc.nextInt();
				sc.nextLine();
			}
			points=points-x;
			
			System.out.println("You have " +points + " points left.");
			System.out.print("Dexterity (1-10): ");
			int y = sc.nextInt();
			sc.nextLine();
			if(y>10){
				System.out.println("Up to ten nothing more. try again");
				y = sc.nextInt();
				sc.nextLine();
			}
			points=points-y;
			
			System.out.println("You have " +points + " points left.");
			System.out.print("Intelligence (1-10): ");
			int z = sc.nextInt();
			sc.nextLine();
			if(z>10){
				System.out.println("Up to ten nothing more. try again");
				z = sc.nextInt();
				sc.nextLine();
			}
			points = points-z;
			if(points<z){
				System.out.println("Ïnsufficent funds");
				z=0;
			}
			
			System.out.println("You have " +points + " points left.");
			System.out.print("Charisma (1-10): ");
			int w = sc.nextInt();
			sc.nextLine();
			if(w>10){
				System.out.println("Up to ten nothing more. try again");
				w = sc.nextInt();
				sc.nextLine();
			}
			points=points-w;
			if(points<w){
				System.out.println("Ïnsufficent funds");
				w=0;
			}
			
			System.out.print("You are "+name+", "+title+".\nYou're a "+q+" with the following stats\nStrength - "+x+"\nDexterity - "+y+"\nIntelligence - "+z+"\nCharisma - "+w);
		}
		
	}
}
