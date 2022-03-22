package com.simplilearn.demo;

public class typecasting {
public static void main(String[] args) {
	//implicit conversion//
	System.out.println("implicit typecasting");
	char a ='A';
	System.out.println("value of a: "+a);
	int b=a;
	System.out.println("value of b " +b);
	
	System.out.println("\n");
	System.out.println("Explicit typecasting");
	double x=45.5;
	int y =(int)x;
	
	System.out.println("value of x: " +x);
	System.out.println("value of y: " +y);
}
}
