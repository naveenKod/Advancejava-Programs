package com.kod.SynchronizedKeyWord;

public class KodnestLibrery implements Runnable {
	synchronized public void run() {
	 try {
		 System.out.println(Thread.currentThread().getName()+" taking kodnest book");
		 Thread.sleep(3000);
		 System.out.println(Thread.currentThread().getName()+" reading Kodnest book");
		 Thread.sleep(3000);
		 System.out.println(Thread.currentThread().getName()+" returning kodnest Book");
		 Thread.sleep(3000);
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
 }
}
