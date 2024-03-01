package com.kod.CollectionFrameWork;

import java.util.*;

public class Program5 {
public static void main(String[] args) {
	ArrayDeque ad=new ArrayDeque();
    ad.add(10);
    ad.add(20);
    ad.add(30);
    ad.add(40);
    ad.add(50);
    ad.add(60);
    System.out.println(ad);
    ad.addFirst(88);
    System.out.println(ad);
    ad.addLast(99);
    System.out.println(ad);
}
}
