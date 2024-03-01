package com.kod.JoinMultiThreading;

public class Chatting extends Thread {
   public void run() {
	   try {
		   System.out.println("Chatting is Started");
		   Thread.sleep(3000);
		   System.out.println("Chatting Happening");
		   Thread.sleep(3000);
		   System.out.println("Chatting is Ended");
		   Thread.sleep(3000);
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
}
}