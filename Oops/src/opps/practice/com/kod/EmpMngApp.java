package opps.practice.com.kod;
 
import java.util.Scanner;

public class EmpMngApp {

	public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     EmployeeManager e=new EmployeeManager(10);
     boolean b=true;
     while(b) {
    	 System.out.println("Enter the choice");
    	 int in=scan.nextInt();
    	 if(in==1) {
    		 System.out.println("Enter tthe name");
    		 double Salary=scan.nextDouble();
    		 em.addEmployee(name,salary);
    	 }
     }
	}

}
