package opps.com.kod;

public class Employee {
private int empId;
private String Name;
private float Salary;

public  Employee(int empId,String Name,float Salary) {
	this.empId=empId;
	this.Name=Name;
	this.Salary=Salary;
}
public int getempId() {
	return empId;
}
public String getName() {
	return Name;
}
public float getSalary() {
	return Salary;
}
}
