package com.kod.CustomExceptions;

public class InsufficentBalenceException  extends Exception{
	public InsufficentBalenceException() {
		super("Amount is more than Balence");
	}

}
