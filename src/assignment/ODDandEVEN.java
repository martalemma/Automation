package assignment;

import java.util.Scanner;

public class ODDandEVEN {

	public static void main(String[] args) {
		Scanner ui = new Scanner(System.in);
		System.out.println("Enter a number?");
		int x = ui.nextInt();
	
		if(x%2==1) {
          System.out.println("ODD");
	}
		else 
		{  
			System.out.println("EVEN");
			
			}
		}
}
