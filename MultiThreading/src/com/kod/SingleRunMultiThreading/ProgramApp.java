package com.kod.SingleRunMultiThreading;

public class ProgramApp {

	public static void main(String[] args) {
		Program t1=new Program();
		Program t2=new Program();
	t1.setName("Number");
	t2.setName("Char");
		
		
		t1.start();
		t2.start();
	}

}
