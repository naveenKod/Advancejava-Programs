package com.kod.MultiThreadWay2;

public class Program {

	public static void main(String[] args) {
    NumPrinting Np=new NumPrinting();
    CharPrinting Cp=new CharPrinting();
    Thread t1=new Thread (Np);
    Thread t2=new Thread(Cp);
    t1.start();
    t2.start();
	}

}
