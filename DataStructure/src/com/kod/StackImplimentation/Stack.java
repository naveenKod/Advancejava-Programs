package com.kod.StackImplimentation;

import java.util.Scanner;

public class Stack {
	private int Stack[] =null;
	private Scanner scan=new Scanner(System.in);
	private int size=0;
	private int top=-1;
	
	public Stack (int n) {
		Stack =new int[n];
		size=Stack.length;
	}
	public void push(int n) {
		if(top==size-1) {
			System.out.println("Stack is full cannot insert");
		}else {
			++top;
			int elem=scan.nextInt();
			Stack[top]=elem;
		}
	}
	public void pop(int n) {
		if(top==-1) {
			System.out.println("Stack is emty pop is not possible");
		}else {
			--top;
		}
	}
	public void display() {
		for(int i=top;i>=0;i--) {
			System.out.println(Stack[i]);
		}
	}

}
