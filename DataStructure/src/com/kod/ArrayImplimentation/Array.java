package com.kod.ArrayImplimentation;

import java.util.Scanner;

public class Array {
private int arr[]=null;
private Scanner scan=new Scanner(System.in);
 
public Array(int n) {
	arr=new int[n];
}
public void  insert() {
	System.out.println("Enter the position from 0 to"+(arr.length-1));
	int pos=scan.nextInt();
	System.out.println("Enter the element insert into position"+pos);
	int ele=scan.nextInt();
	arr[pos]=ele;
}
public void delete() {
	System.out.println("Enter the position from which element has to delete");
	int pos=scan.nextInt();
	arr[pos]=0;
}
public void display() {
	for(int i:arr) {
		System.out.println(i);
	}
}
}
