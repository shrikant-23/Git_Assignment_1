package example.git.calculator;

import java.util.Scanner;

public class CalculatorMain {
  
	
	
	public static void main(String[] args) {
		Scanner inputnum= new Scanner(System.in);
		int result;
		
		System.out.println("Choose an operator: add, sub, mult, or div");
	   String  operator = inputnum.next();
	    
		System.out.println("Enter First Number");
		int num1= inputnum.nextInt();
		
		System.out.println("Enter Second Number");
		int num2= inputnum.nextInt();
		
		
		switch (operator) {

	      // performs addition between numbers
	      case "add":
	        result = num1 + num2;
	        System.out.println(num1 + " + " + num2 + " = " + result);
	        break;

	      // performs subtraction between numbers
	      case "sub":
	        result = num1 - num2;
	        System.out.println(num1 + " - " + num2 + " = " + result);
	        break;

	      // performs multiplication between numbers
	      case "mult":
	        result = num1 * num2;
	        System.out.println(num1 + " * " + num2 + " = " + result);
	        break;

	      // performs division between numbers
	      case "div":
	        result = num1 / num2;
	        System.out.println(num1 + " / " + num2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	}

}
