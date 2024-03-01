package opps.com.kod;

public class EmployeeApp {

	public static void main(String[] args) {
    Employee e1=new Employee(1,"Ajay",23);
    System.out.println(e1.getempId());
    System.out.println(e1.getName());
    System.out.println(e1.getSalary());
    
	
    Employee e2=new Employee(2,"Nikhil",24);
    System.out.println(e2.getempId());
    System.out.println(e2.getName());
    System.out.println(e2.getSalary());
    
	}
}