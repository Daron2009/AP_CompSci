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
		
		int[] arr = new int[1000];
		int x=0;
		for(int i = 0; i<1000; i++){
			arr[x]=(int)(Math.random()*100);
			x++;
		}
		int z = 0;
		for(int p = 0; p<1000; p++){
			System.out.println(arr[z]);
			z++;
		}
		}
	}



