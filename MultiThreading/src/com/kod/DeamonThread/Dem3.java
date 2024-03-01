package com.kod.DeamonThread;
import java.util.Scanner;
public class Dem3 {
	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
     System.out.println(System.in);
    int N=scan.nextInt();
    int d=scan.nextInt();
    int count=0;
    int arr[]=new int[N];
    for(int i=0;i<=N;i++) {
    	arr[i]=scan.nextInt();
    }
    for(int i=0;i<arr.length-2;i++) {
    	for(int j=0;j<arr.length-1;j++) {
    		if(arr[j]-arr[i]==d) {
    		for(int k=j++;k<=arr.length;k++) {
    			if(arr[k]-arr[j]==d) {
    				count++;
    				break;
    			}
    		}
    		}
    	}
    }
	
	}
}

