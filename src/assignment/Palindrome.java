package assignment;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner ui = new Scanner(System.in);
         System.out.println("Enter a word?");
         String word = ui.next();
         
         char[] myarray = word.toCharArray();
         
         String result = "";
         for(int i=myarray.length-1; i>=0;i--) { 
        	 result =result + myarray[i];
        			 
         }
        	if(word.equalsIgnoreCase(result)) {
        		System.out.println("Palindrome");
        	}
        	else {
        		System.out.println("not palindrome");
        	}
	}

}
