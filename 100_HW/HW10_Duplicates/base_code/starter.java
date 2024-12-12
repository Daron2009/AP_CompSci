/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		int z =0;
		int [] arr = {5,8,7,8,4,2,9,1};
        int x = (int)(Math.random()*10);
        for(int i = 1; i<arr.length;i++){
            if(x==arr[i]){
                System.out.println(i);
                z=z+arr[i];
                System.out.println(z);
            }
            
        }
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.println("Consect at "+ i + " and "+(i+1));
            }
        }


	}
}
