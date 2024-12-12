/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf test1 = new PooleDwarf(randName(), (int)(Math.random()*100));
		PooleDwarf test2 = new PooleDwarf(randName(), (int)(Math.random()*100));
		PooleDwarf test3 = new PooleDwarf(randName(), (int)(Math.random()*100));
		PooleDwarf test4 = new PooleDwarf(randName(), (int)(Math.random()*100));
		PooleDwarf test5 = new PooleDwarf(randName(), (int)(Math.random()*100));
		PooleDwarf test6 = new PooleDwarf(randName(), (int)(Math.random()*100));
		PooleDwarf test7 = new PooleDwarf(randName(), (int)(Math.random()*100));
		
		
		String onesname = new String(test1.getName());
		int x = 0;
		if(test1.isSameName(test2.getName())){
			x++;
		}
		if(test1.isSameName(test3.getName())){
			x++;
		}
		if(test1.isSameName(test4.getName())){
			x++;
		}
		if(test1.isSameName(test5.getName())){
			x++;
		}
		if(test1.isSameName(test6.getName())){
			x++;
		}
		if(test1.isSameName(test7.getName())){
			x++;
		}
	
		System.out.print(x);
		
		
		
		
		
	}
}
