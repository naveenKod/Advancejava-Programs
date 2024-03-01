package com.kod.DeamonThread;

public class Compillation extends Thread {
	public void run() {
		  try {
			  for(;   ;) {
				  System.out.println("Compillation The Code");
				  Thread.sleep(3000);
			  }
		  }catch(Exception e) {
			  e.printStackTrace();
		  }
	  }
}
