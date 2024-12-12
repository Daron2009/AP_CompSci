/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	
	String none = "No role";
	String Wizard = "Wizard";
	String Warrior = "Warrior";
	String Rogue = "Rogue";
	
	
	public myCharacter(){
		System.out.println("Your a Wizard!!! Good luck.");
	}
	
	public myCharacter(String role){
		
		if(role.equals(none)){
			System.out.println("You chose: No role. Why not?");
		}else if(role.equals(Wizard)){
			System.out.println("You chose: Wizard. Wow how cumming");
		}else if(role.equals(Warrior)){
			System.out.println("You chose: Warrior. Nice pick");
		}else if(role.equals(Rogue)){
			System.out.println("You chose: Rogue. Good choice");
		}
		
		
	}
	
	



}

