/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a phrase: ");
		String x = sc.nextLine();
		String word = "";
		
		while(true){
			int space = x.indexOf(" ");
			if(space == -1){
				if(x.substring(0,1).equals("a")||x.substring(0,1).equals("e")||x.substring(0,1).equals("i")||x.substring(0,1).equals("o")||x.substring(0,1).equals("u")){
					word=x+"way";
					
				}else{
					word=x.substring(1) + x.substring(0,1)+"ay";
				}
				System.out.print(word);
				break;
			}
			
			
			String y = x.substring(0,space);
			if(x.substring(0,1).equals("a")||x.substring(0,1).equals("e")||x.substring(0,1).equals("i")||x.substring(0,1).equals("o")||x.substring(0,1).equals("u")){
				word=y+"way ";
			}else{
				word=y.substring(1) + y.substring(0,1)+"ay ";
			}
			x=x.substring(space+1);
		
			System.out.print(word);
		}
		
		
		
	}
	

	

}
