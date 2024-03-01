package com.kod.ExceptionHandling;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
   System.out.println("Prigram excution is Start");
   try {
   Scanner scan=new Scanner(System.in);
   System.out.println("Enter the Denominator");
   int a=scan.nextInt();
   System.out.println("Enter the Numaretor");
   int b=scan.nextInt();
   int c=a/b;
   System.out.println("Division result is "+c);
   System.out.println("Enter size to crate an array");
   int size=scan.nextInt();
   int []arr=new int[size];
   System.out.println("Enter Element to Store in Array");
   int ele=scan.nextInt();
   System.out.println("Enter the index at which element has to be stored");
   int index=scan.nextInt();
   arr[index]=ele;
   System.out.println("Element is inserted in Array");
	}
	catch(Exception e) {
		System.out.println("Exception is Handling");
	}
   finally{
	   
	   System.out.println("Program excution is Ended");
   }

}
}