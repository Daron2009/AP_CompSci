/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	String Role;
	int Strength;
	int Dexterity;
	int Intelligence;
	int Charisma;
	
	public void BaseClass(String r) {
		Role = r;
		Strength = 10;
		Dexterity = 10;
		Intelligence = 10;
		Charisma = 10;
		
		
	}
	
	public void stats(){
		System.out.println(Strength);
		System.out.println(Dexterity);
		System.out.println(Intelligence);
		System.out.println(Charisma);
	}

}

