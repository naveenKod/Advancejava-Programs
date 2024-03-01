package om.kok.MultiThreading;

public class Program2 {
	public static void main(String[] args) {
    Thread t=Thread.currentThread();//Executing the thread object
    System.out.println(t);
    t.setName("My Thread");//Changing the name the thread
    t.setPriority(9);//Changing Priority
    System.out.println(t);//Printing Thread Name,Priority,group of the thread
	}

}
