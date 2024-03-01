package opps.com.kod;

public class LaptopApp {

	public static void main(String[] args) {
    Laptop l1=new Laptop("intel icore i5",4);
    System.out.println(l1.getProcessor());
    System.out.println(l1.getStorage());
    
	System.out.println("=====================");
    Laptop l2=new Laptop("intel icore i6",8); 
    	System.out.println(l2.getProcessor());
    	System.out.println(l2.getStorage());
    }
	

}
