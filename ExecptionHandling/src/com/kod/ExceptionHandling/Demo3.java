package com.kod.ExceptionHandling;
import java.util.Scanner;
public class Demo3 {

	public static void main(String[] args) {
    System.out.println("Program start the Excution");
    try {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the Denominator");
    int a=scan.nextInt();
    System.out.println("Enter the Numaretor");
    int b=scan.nextInt();
    int c=a/b;
    System.out.println("Division Result is=> " +c);
    System.out.println("Enter the size to create Array");
    int size=scan.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter the element to Store in Array");
    int ele=scan.nextInt();
    System.out.println("Enter the index at which ele is stored");
    int index=scan.nextInt();
    arr[index]=ele;
    System.out.println("Ele is inserted in array");
    }
    //Specific catch block to handle Arithmetic Exception
    catch(ArithmeticException ae) {
    	System.out.println("Do not provide 0 as Denominator");
    }
    //Specific catch block to handle Array Index Bound Exception 
    catch(ArrayIndexOutOfBoundsException aiobe ) {
    	System.out.println("Provide valid index for array");
    }
  //Specific catch block to handle Negative Array Exception
    catch(NegativeArraySizeException nase) {
    	System.out.println("Do not Provide Negative size in array");
    }
    //Generic catch block
    catch(Exception e) {
    	System.out.println("Exception is handling");
    }
    finally {
    	System.out.println("Program Excution is ended");
    }
	}
}
