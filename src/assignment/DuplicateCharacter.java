package assignment;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharacter {

	public static void main(String[] args) {
		Scanner ui = new Scanner(System.in);
		System.out.println("enter String?");
		String s = ui.nextLine();
		
		Set<Character> C = new LinkedHashSet<Character>();
		Set<Character> duplicateC = new LinkedHashSet<Character>();
		
		char[] myarry = s.toCharArray();
		
		for(char item : myarry) {
			if(C.add(item)) {
				
			}
			else {
				 duplicateC.add(item);
			}
		}
		 System.out.println(duplicateC );

	}

}
