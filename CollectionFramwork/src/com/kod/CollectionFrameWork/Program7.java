package com.kod.CollectionFrameWork;

import java.util.PriorityQueue;

public class Program7 {

	public static void main(String[] args) {
  //Generic
		PriorityQueue <Integer>pq=new PriorityQueue<Integer>();
		pq.add(20);
		pq.add(5);
		pq.add(80);
		System.out.println(pq);
	
	PriorityQueue <String>pq1=new PriorityQueue<String>();
	pq1.add("naven");
	pq1.add("Anu");
	pq1.add("Carry");
	System.out.println(pq1);

}
}