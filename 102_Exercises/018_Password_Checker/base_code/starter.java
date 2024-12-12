import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
        
        int mid=0;
        int good=0;
        int trash=0;
       
        
        
        for(int z =0;z<passwords.length;z++){
            int x=0;
            
            if(passwords[z].length()>=8){
                x++;
            }
            if(passwords[z].indexOf("!")!=-1||passwords[z].indexOf("@")!=-1||passwords[z].indexOf("#")!=-1||passwords[z].indexOf("$")!=-1||passwords[z].indexOf("%")!=-1||passwords[z].indexOf("^")!=-1||passwords[z].indexOf("&")!=-1||passwords[z].indexOf("*")!=-1){
                x++;
            }
            if(x==2){
                x++;
            }
            if(x==1){
                mid++;
            }else if(x==3){
                good++;
            }else{
                trash++;
            }
        }
         System.out.print("There are "+mid+" mid passwords, "+good+" good passwords, and "+trash+" trash passwords");
	}
}
