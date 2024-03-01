package com.kod.DeamonThread;

public class Saving  extends Thread{
  public void run() {
	  try {
		  for( ;  ;) {
			  System.out.println("Saving The Code");
			  Thread.sleep(3000);
		  }
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
  }
}
