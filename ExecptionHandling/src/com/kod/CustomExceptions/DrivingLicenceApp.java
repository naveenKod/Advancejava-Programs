package com.kod.CustomExceptions;

import java.util.Scanner;

public class DrivingLicenceApp {
	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the Age");
    int age=scan.nextInt();
    try {
    	ApplyLicence(age);
    }catch(Exception e) {
    	e.printStackTrace();
    }
    
	}
	
	public static void ApplyLicence(int age) throws Exception{
		if(age<18) {
			throw new UnderAgeException();
		}else if(age>65) {
			throw new OverAgeException();
		}else {
			System.out.println("Take the Driving licence");
		}
	}

}
