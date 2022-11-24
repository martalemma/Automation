package assignment;

import java.util.Scanner;

public class Session2 {

	public static void main(String[] args) {
		Scanner ui = new Scanner(System.in);
		 Scanner ui2 = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = ui.nextLine();
		
		System.out.println("How old are you?");
		int age = ui.nextInt();
				
		System.out.println("What is your gender?");
		String gender = ui.next();
		
		System.out.println("Where are you from?");
		String country = ui.next();
		
		System.out.println("Where do you live now?");
		String city = ui2.nextLine();
		
		System.out.println("Where do you work?");
		String work = ui.next();
		
		System.out.println("What is your job role?");
		String role = ui.next();
		
		System.out.println("What is your salary?");
		double salary = ui2.nextDouble();
		
		System.out.println("How much raise are you getting next year?");
		double raise = ui2.nextDouble();
		double totalsalary = salary + raise;	
      System.out.println("My name is "+ name +". I am "+age+" years old, " +gender +"."
      		+ " I work at "+work+" as "+role+". I currently live in "+city+"."
      		+ " I am originally from "+country+". I make "+salary+" dollar. I will get "+raise+""
      		+ " as annual raise so my total salary would be "+totalsalary+" dollar next year.");



	}

}
