/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	
	
	public static void toStringArray(int [] x){
		
		for(int i = 0; i<x.length; i++){
			System.out.println(x[i]);
		}
	}
	public static int getArrayAverage(int [] x){
		int z = 0;
		int y = 0;
		int q = 0;
		while(true){
			if(q > x.length){
				break;
			}
			z=z+x[y];
			y++;
		}
		return z/x.length;
	}
	
	public static int getArrayMax(int [] x){
		int max = 0;
		for(int i = 0; i<x.length; i++){
			if(x[i]>max){
				max = x[i];
			}
		}
		return max;
		
	}
	
	public static int getArrayMin(int [] x){
		int min = 100000;
		for(int i = 0; i<x.length; i++){
			if(x[i]<min){
				min=x[i];
			}
		}
		return min;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();

		int [] arr = new int[100];
		
		for(int i = 0; i<arr.length; i++){
			arr[i]=(int)(Math.random()*100);
		}
		
		toStringArray(arr);
		getArrayAverage(arr);
		getArrayMax(arr);
		getArrayMin(arr);
		
		
		
		
		
		
		
	}
}
