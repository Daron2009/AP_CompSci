/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		
		String x = "Sponge Case";
	
		
	
		while(true){
			if(x.indexOf("") == -1){
				System.out.print(spongeCase(x));
				break;
			}
			
			int space = x.indexOf(" ");
			String word = x.substring(0,space);
			System.out.print(spongeCase(word)+ " ");
			x=x.substring(space+1);
			
			
			
			
		}
		
		
		
	}
	
	public static String spongeCase(String word){
		
		String x = word;
		String z;
		String y;
		for(int i=0;i<x.length();i++){
			
			if(i%2==0){
				y=x.substring(i,i+1);
				System.out.print(y.toUpperCase());
			}
			if(i%2==1){
				y=x.substring(i,i+1);
				System.out.print(y.toLowerCase());
			}
			
		}
		return "";
		
	}
	
	
	
}
