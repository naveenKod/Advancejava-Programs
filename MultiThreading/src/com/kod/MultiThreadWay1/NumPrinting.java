package com.kod.MultiThreadWay1;

public class NumPrinting extends Thread {
 public void run() { 
	 System.out.println("Print Num Is Started");
	 for(int i=0;i<=5;i++) {
		 System.out.println(i);
	 }try {
		 Thread.sleep(3000);
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
	 System.out.println("Print Num Is Ended");
 }
}
