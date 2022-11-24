package assignment;

import java.util.Scanner;

public class Session3 {

	public static void main(String[] args) {
		Scanner ui = new Scanner(System.in);
		System.out.println("Pleasae enter a String");
		String a = ui.next();
		System.out.println(a.toUpperCase());
		System.out.println(a.length());
        System.out.println(a.replace('o','z'));
        System.out.println(a.charAt(a.length()-1));
        System.out.println(a.concat(" Test"));
	}

}
