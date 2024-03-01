package com.kod.SingleRunMultiThreading;

public class Program1App {

	public static void main(String[] args) {
   Program1 pg=new Program1();
   
   Thread t1= new Thread(pg);
   Thread t2=new Thread(pg);
   
   t1.start();
   t2.start();
	}

}
