package opps.polymorphism.com.kod;

public class PaymentApp {

	public static void main(String[] args) {
    UPI upi=new UPI();
    upi.bill();
    upi.offer();
    upi.pay();
    System.out.println("====================");
    Wallet wlt=new Wallet();
    wlt.bill();
    wlt.offer();
    wlt.pay();
    System.out.println("====================");
    Card cr=new Card();
    cr.bill();
    cr.offer();
    cr.pay();
    System.out.println("====================");
	}

}
