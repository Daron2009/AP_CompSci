/* 
    Lecture note example - String Methods!
    length() - Returns the number of characters in a String
    substring(int) - Starts from the given int and returns to the end of the String
    substring(int, int) - Starts from the first int and returns until the last int (NOT including last int index)
    indexOf(String) - Returns the index of the first instance of a given String
    indexOf(String, int) - Returns the index of the first instance of a given String STARTING at the int index given
*/
import java.util.*;


class LectureStringMethods{
    public static void main(String args[]) {
        // Your Code Goes here!
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String s = sc.nextLine();
        
        int space1 = s.indexOf(" ");
        String word1 = s.substring(0,space1);
        int space2 = s.indexOf(" ", space1+1);
        String word2 = s.substring(space1+1, space2);
        
        
        System.out.println(word1);
        System.out.println(word2);
        
        
        
        while(true){
            if(s.indexOf("")==-1){
                System.out.println(s);
                break;
            }
            
            int space = s.indexOf(" ");
            String word = s.substring(0,space);
            System.out.println(word);
            
            s=s.substring(space+1);
            
            
            
            
        }
        
        
        
        
	}
}