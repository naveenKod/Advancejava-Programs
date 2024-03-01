package com.kod.CollectionFrameWork;

import java.util.ArrayList;

public class StudentApp {

	public static void main(String[] args) {
     
		Studentt st1=new Studentt(1,"Anu",72.0F);
		Studentt st2=new Studentt(2,"Priya",78.8F);
		Studentt st3=new Studentt(3,"Manu",68.8F);
		
		ArrayList al=new ArrayList();
		al.add(st1);
		al.add(st2);
		al.add(st3);
		System.out.println(al);
	
	}

}
