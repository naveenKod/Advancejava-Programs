package com.kod.StackImplimentation;

import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Do you wish to create stack?say true or false");
    boolean choice=scan.nextBoolean();
    if(choice==true) {
    	System.out.println("Enter the length of stack");
    	int n=scan.nextInt();
    	Stack s=new Stack(n);
    		while(true) {
    			System.out.println("press 1=> push");
    			System.out.println("press 2=> pop");
    			System.out.println("press 3=> display");
    			System.out.println("pree any to stop");
    			System.out.println("enter the choice");
    			int ch=scan.nextInt();
    			switch(ch){
    			case 1:System.out.println("enter elem to push");
    			int ele=scan.nextInt();
    			s.push(ele);
    			break;
    			case 2: s.pop(n);
    			break;
    			case 3: s.display();
    			break;
    			default: System.out.println("tata bye");
    			return;
    			}
    				
    			
    			
    		}
    }
	}

	private static void Swith(int ch) {
		// TODO Auto-generated method stub
		
	}

}
