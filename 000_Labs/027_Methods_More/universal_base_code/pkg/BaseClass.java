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
		
	}
	
	public String setRole(String r){
		role = r;
		return role;
	}
	public int setDexterity(int d){
		if(d<0){
			dexterity = 0;
		}
		return dexterity;
	}
	public int setStrength(int s){
		if(s<0){
			strength = 0;
		}
		return strength;
	}
	public int setIntelligence(int i){
		if(i<0){
		intelligence = 0;
		}
		return intelligence;
	}
	public int setCharisma(int c){
		if(c<0){
			charisma = 0;
		}
		return charisma;
	}
	public boolean setAll(String r, int d, int s, int i, int c){
		if(i<0&&d<0&&s<0&&c<0){
			return true;
		}
		return false;
	}
	
}

