package com.kod.CollectionFrameWork;

public class Studentt {
int rollno;
String name;
Float Percntage;

public Studentt(int rollno,String name,float Percntag ) {
	this.rollno=rollno;
	this.name=name;
	this.Percntage=Percntag;
	
}
public String toString() {
	return rollno+" "+name+" "+Percntage;
}
}
