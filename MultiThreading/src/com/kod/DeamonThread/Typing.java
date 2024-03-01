package com.kod.DeamonThread;

public class Typing  extends Thread {
public void run() {
	try {
		for(int i=0;i<=5;i++) {
		System.out.println("Typing in Coding");
		Thread.sleep(3000);
		System.out.println();
		
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
