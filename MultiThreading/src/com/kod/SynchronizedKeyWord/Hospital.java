package com.kod.SynchronizedKeyWord;

public class Hospital {
 String res1="Doctor";
 String res2="Bed";
 
 public void TomTreatment() {
	try {
		synchronized(res1) {
			System.out.println("Tom is using "+res1);
			Thread.sleep(3000);
			
			synchronized(res2){
				System.out.println("Tom is using "+res2);
				Thread.sleep(3000);
			}
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
 }
 public void JerryTreatment() {
	 try {
		 synchronized (res1) {
			 System.out.println("Jerry is used "+res1);
			 Thread.sleep(3000);
			 
			 synchronized(res2) {
				 System.out.println("Jerry is Used "+res2);
			 }
		 }
		 
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
 }
	 
 
}
