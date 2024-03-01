package com.kod.SortingObject;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Reversed {

	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque();
	    ad.add(20);
	    ad.add(10);
	    ad.add(60);
	    ad.add(40);
	    Iterator ditr=ad.descendingIterator();
	    while(ditr.hasNext()) {
	    	System.out.println(ditr.next()+" ");
	}
	}
}
