/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	int example = 0;

	public BaseClass() {
		
		
		int[] arr = new int[100];
		int x=0;
		while(x<100){
			arr[x]=(int)(Math.random()*100);
			x++;
		}
		int z = 0;
		while(z<100){
			System.out.println(arr[z]);
			z++;
		}
		
	}

}

