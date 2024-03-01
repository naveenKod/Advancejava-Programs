package recursion.com.kod;

import java.util.Scanner;

public class GcdApp {

	public static void main(String[] args) {
    Scanner scan=new Scanner( System.in);
    System.out.println("Enter the 2 number");
    int m=scan.nextInt();
    int n=scan.nextInt();
    Gcd gcd=new Gcd();
    int res=gcd.gcd(m, n);
    System.out.println("Gcd of 2 number "+m+" "+n+" is "+res);
	}
}
