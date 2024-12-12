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
		
		String [] arr = new String[10];
		arr[0]="If you're happy and you know it, clap your hands";
		arr[1]="If you're happy and you know it, clap your hands";
		arr[2]="If you're happy and you know it";
		arr[3]="Then your face will surely show it";
		arr[4]="If you're happy and you know it, clap your hands";
		arr[5]="If you're happy and you know it, stomp your feet";
		arr[6]="If you're happy and you know it, stomp your feet";
		arr[7]="If you're happy and you know it";
		arr[8]="Then your face will surely show it";
		arr[9]="If you're happy and you know it, stomp your feet";
		
		int x=0;
		
		while(x<10){
			System.out.println(arr[x]);
			x++;
		}
		
	}

}

