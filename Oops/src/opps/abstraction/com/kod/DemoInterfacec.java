package abstraction.com.kod;

public interface DemoInterfacec {

	//abstract method
	void display1();
	
	//default concreat method
	default void display2() {
		System.out.println("inside the display1 ");
	}
	
	//static concreat method
	static void dispaly3() {
		System.out.println("inside the dispaly3");
	}
	
	//private concreat method
	private void display4() {
		System.out.println(" inside the ddisplay4");
	}
		
	
}
