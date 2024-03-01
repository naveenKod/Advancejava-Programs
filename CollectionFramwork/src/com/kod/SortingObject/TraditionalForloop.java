package com.kod.SortingObject;

import java.util.ArrayList;

public class TraditionalForloop {

	public static void main(String[] args) {
     ArrayList al=new ArrayList();
     al.add(10);
     al.add(20);
     al.add(30);
     al.add(40);
    for(int i=0;i<al.size()-1;i++) {
    	System.out.println(al.get(i)+" ");
    }
     }

}
