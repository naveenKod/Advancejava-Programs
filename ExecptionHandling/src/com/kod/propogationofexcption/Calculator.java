package com.kod.propogationofexcption;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
System.out.println("Calculation is stated");
Scanner scan=new Scanner(System.in);
System.out.println("Enter the 1st Number");
int a=scan.nextInt();
System.out.println("Enter th 2nd Number");
int b=scan.nextInt();
multiply(a,b);
System.out.println("Calculation is ended");

	}
	
	
	public static void multiply(int a,int b) {
		System.out.println("Multiplication is started");
		int muller=a*b;
		System.out.println("Multiplication result "+muller);
		divide(a,b);
		System.out.println("Multiplication is ended");
	}
	public static void divide(int a,int b) {
		System.out.println("Division is started");
		int dives=a/b;
		System.out.println("Division result "+dives);
		System.out.println("Devision is ended");
	}

}
