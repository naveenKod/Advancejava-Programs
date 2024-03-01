package imp.com.kod;
import java.util.Scanner;
public class StudentApp {
	public static void main(String[] args) 
	{
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number of student");
    int studentCount=scan.nextInt();
    Student[]arr=new Student[studentCount];
    for(int i=0;i<arr.length-1;i++)
    {
    	System.out.println("Enter the rollNo of student");
    	int rollNo=scan.nextInt();
    	System.out.println("Enter the name of student");
    	String name=scan.next();
    	System.out.println("Enter the age of student");
    	int age=scan.nextInt();
    	arr[i]=new Student(rollNo,name,age);
    	System.out.println("student detailas are");
    	for(int i1=0;i1<=arr.length-1;i1++)
    	{
    		System.out.println(arr[i1].rollNo+" "+arr[i1].name+" "+arr[i1].age);
    	}
    
    }
}
}
