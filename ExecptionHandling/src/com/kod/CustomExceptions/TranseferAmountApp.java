package com.kod.CustomExceptions;

import java.util.Scanner;

public class TranseferAmountApp {
	public static void main(String[] args) {
   Scanner scan=new Scanner(System.in);
   System.out.println("Enter The Aomunt");
   int Amount=scan.nextInt();  
	try
	{
		trancefer(Amount);
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	public static void trancefer(int Amount) throws Exception {
		if(Amount<1000) {
			System.out.println("Amount is Taken");
		}else {
			throw new InsufficentBalenceException();
		}
	}
}