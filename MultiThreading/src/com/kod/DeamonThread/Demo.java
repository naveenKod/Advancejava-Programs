package com.kod.DeamonThread;

import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	String  S=scan.nextLine();
	S=S.toLowerCase();
	int zcount=0;
	int Ocount=0;
	for(int i=0;i<=S.length();i++) {
	if(S.charAt(i)=='z') {
			zcount++;
	}else if(S.charAt(i)=='o') {
		Ocount++;
	}
	}if(zcount*2==Ocount) {
		System.out.println("Yes");
	}else {
		System.out.println("no");
	}
}
}

