/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog one = new Dog("Dog1");
		Dog two = new Dog("Dog2","German");
		if(one.isSleeping()){
			System.out.println("It's asleep");
		}else{
			one.bark();
		}
		if(two.isSleeping()){
			if(!one.isSleeping()){
				two.bark();
			}else{
				System.out.println("It's asleep");
			}
		}else{
			if(!one.isSleeping()){
				two.bark();
			}
		}


	}
}
