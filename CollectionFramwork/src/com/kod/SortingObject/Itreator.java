package com.kod.SortingObject;

import java.util.ArrayList;
import java.util.Iterator;

public class Itreator {

	public static void main(String[] args) {
    ArrayList al=new ArrayList();
    al.add(10);
    al.add(20);
    al.add(30);
    al.add(40);
    al.add(50);
    Iterator itr =al.iterator();
    while(itr .hasNext()) {
    	System.out.println(itr.next()+" ");
    }
	}

}
