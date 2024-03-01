package com.kod.MultiThreadWay1;
public class Program {
	public static void main(String[] args) {
    NumPrinting Np=new NumPrinting();
    CharPrinting Cp=new CharPrinting();
    Np.start();
    Cp.start();
	}

}
