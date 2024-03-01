package om.kok.MultiThreading;

public class Program3 {
//Disadvantage of single Threading
	public static void main(String[] args) {
		Numprinting();
		CharPrinting();
	}
	
	public static void Numprinting() {
		System.out.println("Staring Printing Number");
		for(int i=0;i<=5;i++) {
			System.out.println(i);
		}try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}System.out.println("Print Num is Ending");
	}
	public static void CharPrinting() {
		System.out.println("Printing Char is Started");
		for(char i='A';i<='E';i++) {
			System.out.println(i);
		}try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Char printing is ended");
	}

}
