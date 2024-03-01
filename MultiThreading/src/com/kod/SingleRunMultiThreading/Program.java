package com.kod.SingleRunMultiThreading;

public class Program extends Thread {
public void run() {
	if(Thread.currentThread().getName().equals("Number")){
		NumPrinting();
	}else {
		CharPrinting();
	}	
	
}
public void NumPrinting () {
	System.out.println("Num Printing Start");
	for(int i=0;i<=5;i++) {
		System.out.println(i);
	}try {
		Thread.sleep(3000);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("Num Printing is Ended");
}
public void CharPrinting() {
	System.out.println("char Printing is Started");
	for(char i='A';i<='B';i++) {
		System.out.println(i);
	}try {
		Thread.sleep(3000);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("Char Printing is Ended");
}
}
