package com.kod.ArrayImplimentation;

import java.util.Scanner;

public class ArrayApp {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Do you wish craete any array?say true or flase");
boolean choice=scan.nextBoolean();
if(choice==true) {
	System.out.println("Ente the array length");
	int n=scan.nextInt();
	Array array=new Array(n);
	while(true) {
		System.out.println("press 1=>INSERT");
		System.out.println("press 2=>DELETE");
		System.out.println("press 3=>DISPLAY");
		System.out.println("press any num to stop");
		System.out.println("Enter the choice");
		int ch=scan.nextInt();
		switch(ch) {
		case 1: array.insert();
		break;
		case 2: array.delete();
		break;
		case 3: array.display();
		break;
		default: System.out.println("Tata bye");
		break;
		}
	}
		
	
}
	}

}
