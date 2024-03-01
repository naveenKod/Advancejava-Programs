package com.kod.MultiThreadWay2;

public class CharPrinting implements Runnable {
	public void run() {
		 System.out.println("Print Char Is Started");
		 for(char i='A';i<='E';i++) {
			 System.out.println(i);
		 }try {
			 Thread.sleep(3000);
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 System.out.println("Print Char Is Ended");
}
}