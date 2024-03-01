package com.kod.JoinMultiThreading;

public class InstagramApp {
	public static void main(String[] args) {
try {
	System.out.println("Instagram App is Started");
	Chatting ch=new Chatting();
	Reels rl=new Reels();
	ch.start();
    rl.start();	
    ch.join();
    rl.join();
    System.out.println("Instagram App is Closing");
}catch(Exception e) {
	e.printStackTrace();
}
		
	}

}
