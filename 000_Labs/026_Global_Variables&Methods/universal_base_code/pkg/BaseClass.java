/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	int strength;
	String role;
	int dexterity;
	int intelligence;
	int charisma;
	
	public BaseClass() {
		strength = 1;
		role = "Wizard";
		dexterity = 10;
		intelligence= 15;
		charisma = 7;
		
	}
	public void myToString(){
		System.out.println("Your role is "+ role + "\nYour strength is "+strength+"\nYour dexterity is "+ dexterity+"\nYour intelligence is "+ intelligence + "\nYour charisma is "+ charisma);
	}

}

