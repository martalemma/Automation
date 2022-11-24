package assignment;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner ui = new Scanner(System.in);
		Operation obj = new Operation();
		
		System.out.println("Enter a number?");
		double x = ui.nextDouble();
		System.out.println("Enter another number?");
		double y = ui.nextDouble();
		System.out.println("What operation would you like to do?");
		String result = ui.next();
		
	
    switch(result.toLowerCase()) {
	case "add":
		double add = Operation.add(x, y);
		System.out.println(add);
		break;
	case "sub":
		double sub = Operation.sub(x, y);
		System.out.println(sub);
		break;
	case "multi":
		double multi = obj.multi(x, y);
		System.out.println(multi);
		break;
	case "div":
	  if(y==0) {
		  System.out.println("you cannot divide by 0");
	  }else {
		  double div = obj.div(x, y);
		  System.out.println(div);
	 }
	      break;
    default:
	      System.out.println("Invalid input");
	  
		}
   
	/*
	if(result.equalsIgnoreCase("add")) {
		double add = Operation.add(x, y);
		System.out.println(add);
		
	}
	else if(result.equalsIgnoreCase("sub")) {
		double sub = Operation.sub(x, y);
		System.out.println(sub);
		
		}
	else if(result.equalsIgnoreCase("multi")) {
		double multi = obj.multi(x, y);
		System.out.println(multi);
		}
	else if(result.equalsIgnoreCase("div")) {
		   if(y==0) {
			     System.out.println("you cannot divide by 0");
		   }
		      else {
			      double div = obj.div(x, y);
		          System.out.println(div);
		          }
	  }
	
	else {
		 System.out.println("Invalid input");
	}*/
	}
	
	
		}
	
