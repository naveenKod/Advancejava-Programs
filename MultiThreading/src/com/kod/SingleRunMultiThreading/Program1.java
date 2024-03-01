package com.kod.SingleRunMultiThreading;

public class Program1 implements Runnable {
   public void run() {
	   if(Thread.currentThread().getName().equals("Number")) {
		   NumPrinting();
	   }else {
		   CharPrinting ();
	   }
   }
   public void NumPrinting() {
	   System.out.println("Num Printing is Start");
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
	   System.out.println("Char Printing is Start");
	   for(char i='A';i<='E';i++) {
		   System.out.println(i);
	   }try {
		   Thread.sleep(3000);
	   }catch(InterruptedException e) {
		   e.printStackTrace();
	   }
	   System.out.println("Char Printing is Ended");
   }
}
