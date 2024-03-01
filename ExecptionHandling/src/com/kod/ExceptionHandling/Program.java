package com.kod.ExceptionHandling;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
try {
	//Statement might generated exception
	System.out.println("Progarm Excution is Stating");
	Scanner scan=new Scanner( System.in);
	System.out.println("Enter the Denominator");
	int a=scan.nextInt();
	System.out.println("Enter thr Numerator");
    int b=scan.nextInt();
    int c=a/b;
    System.out.println(c);	
}
//Statements excuted after handling exeption
catch(Exception e){
	System.out.println("Exception is handling");
}
//Statement should excted mandatory
finally {
	System.out.println("Program excution is ending");
}
	}
}