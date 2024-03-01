package com.kod.DuckingAnException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		try {
		System.out.println("Calculation is started");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a=scan.nextInt();
		System.out.println("Enter the 2nd number");
		int b=scan.nextInt();
		divide(a,b);
		System.out.println("Calculation is Ended");
		}
		catch(Exception e) {
			System.out.println("Exception is handled in Main method");
		}
	}
	public static void divide (int a,int b)throws Exception {
		int div=a/b;
		System.out.println("Div result "+div);
	}

}
