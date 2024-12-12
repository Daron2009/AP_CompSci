/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int [] arr = new int[(int)(Math.random()*51)+150];
		
		for(int i = 0; i<arr.length; i++){
			arr[i]=(int)(Math.random()*100);
		}
		
		int min = 300;
		
		for(int i = 0; i<arr.length; i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		int max = 0;
		for(int i = 0; i<arr.length; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		int x = 0;
		for(int i = 0; i<arr.length; i++){
			x=x+arr[i];
		}
		System.out.println(min+" "+max+" "+(x/arr.length));
		

		
	}
}
