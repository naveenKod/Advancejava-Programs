package com.kod.RethrowingAnException;
import java.util.Scanner;

public class Shopping {
	public static void main(String[] args) {
   shop();
	}
	public static void shop() {
		System.out.println("Shopping is Started");	
		try {
		pay();
		}
		catch(Exception e) {
			System.out.println("Exception is Handled in shop methods");
		}
		System.out.println("Shopping Complted");
	}
	public static void pay()throws Exception {
		try {
		System.out.println("Pyament s stated");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the amount to be Paid");
		int amount =scan.nextInt();
	}
		catch(Exception e) {
			System.out.println("Exception is handled in pay method");
			throw e;
		}
		finally {
	System.out.println("Payment in Complted");
	}
	}
}

