/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Warrior [] x = new Warrior[100];
		Wizard [] y = new Wizard[100];
		
		for(int i = 0; i<x.length; i++){
			
			x[i] = new Warrior();
			
		}
		
		for(int i = 0; i<y.length; i++){
			
			y[i] = new Wizard();
			
		}
		
		int wa = 100;
		int wz = 100;
		int q = 0;
		int u = 0;
		
		
		while(true){
			
			if(wa == 0){
				System.out.print("Wizards won with "+ wz+" wizards left");
				break;
			}
			if(wz == 0){
				System.out.print("Warriors won with "+wa+" warriors left");
				break;
			}
			
		
				
			y[q].attack(x[u]);
			if(x[u].isDead()){
				u++;	
				wa--;
			}
			if(y[q].isDead()){
				q++;
				wz--;
			}
			x[u].attack(y[q]);
			if(x[u].isDead()){
				u++;	
				wa--;
			}
			if(y[q].isDead()){
				q++;
				wz--;
			}
				
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
