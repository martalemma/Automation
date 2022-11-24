package assignment;

import java.util.Scanner;

public class Session4 {
	public static void main(String[] args) {
		Scanner ui = new Scanner(System.in);
		System.out.println("give me a number?");
		int N = ui.nextInt();
		System.out.print(1+",");
		for(int i=4; i<=N; i=i+4) {
			System.out.print(i+",");
		
		}
		System.out.println();
		for(int i=5; i>=0; i=i-1) {
			System.out.print(i+",");
		}
		System.out.println();
		System.out.println("enter a word");
		String a= ui.next();
		char[] x = a.toCharArray();
		for(int i=0; i< a.length(); i++) 
			System.out.print(x[i]+" ");
		
	}
}
