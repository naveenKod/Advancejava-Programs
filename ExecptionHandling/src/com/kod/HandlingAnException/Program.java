package com.kod.HandlingAnException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		System.out.println("Calculation is started");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a=scan.nextInt();
		System.out.println("Enter the 2nd number");
		int b=scan.nextInt();
		Multiply(a,b);
		System.out.println("Calculation is Ended");
  	}
	public static void Multiply(int a,int b) {
		System.out.println("Multiplication is Started");
		int muller=a*b;
		System.out.println("Multplication result "+muller);
		division (a,b);
		System.out.println("Multiplication is ended");
	}
	public static void division(int a,int b) {
		try {
		System.out.println("Division Is Started");
		int div=a/b;
		System.out.println("Division result is "+div);
	
	}
		catch(Exception e) {
			System.out.println("Excption is Handled in Divide Method");
		}
		System.out.println("Division Is Ended");
	}
}
