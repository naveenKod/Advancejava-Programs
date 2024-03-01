package com.kod.DeamonThread;

import java.util.Collection;

public class EclipseApp {
	public static void main(String[] args) {
     Typing tp=new Typing();
     Saving sv=new Saving();
     Compillation comp=new Compillation();
     tp.setDaemon(true);
     sv.setDaemon(true);
     comp.setDaemon(true);
     tp.start();
     sv.start();
     comp.start();
     
	}
}
