package com.kod.SynchronizedKeyWord;

public class KodnestLibreryApp {

	public static void main(String[] args) {
		KodnestLibrery kl=new KodnestLibrery();
		Thread t1=new Thread(kl);
		Thread t2=new Thread(kl);
		
		t1.setName("Tom");
        t2.setName("Jerry");
        
        t1.start();
        t2.start();
		
	}

}
