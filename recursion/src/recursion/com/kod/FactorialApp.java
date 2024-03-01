package recursion.com.kod;

import java.util.Scanner;

public class FactorialApp {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the value to find factorial");
    int n=scan.nextInt();
    Factorial factorial=new Factorial();
    int res=factorial.fact(n);
    System.out.println("Factorial of "+n+" is " +res);
	}

}
