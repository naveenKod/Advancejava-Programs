package com.kod.CollectionFrameWork;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class Program9 {

	public static void main(String[] args) {
    ArrayDeque al=new ArrayDeque();
    al.add(10);
    al.add(30);
    al.add(89);
    System.out.println(al);
    
    
    ArrayList al1=new ArrayList();
    al1.addAll(al1);
    Collections.sort(al1);
    System.out.println(al1);
    al1.clear();
    al1.addAll(al1);
    System.out.println(al1);
	}

}
