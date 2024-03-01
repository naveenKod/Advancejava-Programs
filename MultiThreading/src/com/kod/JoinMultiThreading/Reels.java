package com.kod.JoinMultiThreading;

public class Reels extends Thread{
public void run () {
	try {
		System.out.println("Reel Creating Is Start");
		Thread .sleep(3000);
        System.out.println("Reels Getting Posted");
        Thread.sleep(3000);
        System.out.println("Reels Getting Uploaded");
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
