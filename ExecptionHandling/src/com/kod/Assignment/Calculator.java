package com.kod.Assignment;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		try {
		System.out.println("Calculation is started");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a=scan.nextInt();
		System.out.println("Enter the 2nd number");
		int b=scan.nextInt();
		addition (a,b);
		System.out.println("Calculation is Ended");
		Subtraction(a,b);
	}
		catch(Exception e) {
			System.out.println("Exception is handling In Main Method");
		}
		finally {
			
		}
	}
	public static void addition(int a,int b)throws Exception {//Ducking an Exception
		int add=a+b;
		System.out.println("Addition Result"+add);
	}
 public static void Subtraction(int a,int b) {
	 try {
	 System.out.println("Subtraction Started");
	 int sub=a-b;
	 System.out.println("Subtraction result "+sub);
	 System.out.println("Sutraction Is Complted");
	 Multipication(a,b);
	 }catch(Exception e) {
		 System.out.println("Exception is Handled In Sub Method");
	 }
 }
 public static void Multipication(int a,int b) {
	 try {
	 System.out.println("Multipication Started");
	 int mul=a*b;
	 System.out.println("Multipication result "+mul);
	 System.out.println("Multipication Is Complted");
	 Division(a,b);
	 }catch(Exception e) {
		 System.out.println("Exception is Handled In Mul Method");
	 }
	 finally {
	 }
 }
 public static void Division(int a,int b)throws Exception {//providing the warning to its caller
	 try {
	 System.out.println("Division  Started");
	 int div=a/b;
	 System.out.println("Division result "+div);
	 System.out.println("Division Is Complted");
	 }catch(Exception e) {
		 System.out.println("Exception is Handled In Div Method");
		 throw e;//re throws the exception to its caller method
	 }
	 finally {
		 
	 }
}
}