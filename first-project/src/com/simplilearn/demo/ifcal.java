package com.simplilearn.demo;

import java.util.Scanner;

public class ifcal {
public static void main(String[] args) {
	char operator ;
	int num1, num2 , result;
	Scanner sc= new Scanner(System.in);
	 System.out.println("Enter first num");
	    num1 = sc.nextInt();

	    System.out.println("Enter second num");
	    num2 = sc.nextInt();

	 System.out.println("Choose an operator: +, -, *, or /");
	 operator = sc.next().charAt(0);
	 if(operator=='+') {
		 result = num1 + num2;
	        System.out.println(num1 + " + " + num2 + " = " + result);
	 }else if(operator=='-') {
		 result = num1 - num2;
	        System.out.println(num1 + " - " + num2 + " = " + result);
	 }
	 else if(operator=='*') {
	 result = num1 * num2;
       System.out.println(num1 + " * " + num2 + " = " + result);
}
	 else if(operator=='/') {
	 result = num1 / num2;
       System.out.println(num1 + " / " + num2 + " = " + result);
}
	
	
}
}
