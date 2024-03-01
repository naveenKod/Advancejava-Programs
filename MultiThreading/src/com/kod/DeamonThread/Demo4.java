package com.kod.DeamonThread;

import java.util.Scanner;
public class Demo4 {
	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int N=scan.nextInt();
    System.out.println("Enter the array lngth");
    int arr[]=new int[scan.nextInt()];
    for(int i=0;i<=arr.length-1;i++) {
    	arr[i]=scan.nextInt();
    	if(N%10==0) {
    		System.out.println("yes");
    	}else {
    		System.out.println("no");
    	}
    }
	}

}
