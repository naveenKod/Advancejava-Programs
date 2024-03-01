package opps.practice.com.kod;

public class EmployeeManager {
private Employee[]e;
private int capacity;
private int size;
EmployeeManager(int capacity){
	this.capacity=capacity;
			e=new Employee[capacity];
			size=0;
}
public void addEmployee(String name,double salary) {
	e[size]=new Employee(name,salary);
	System.out.println("employee added successfully and generated id"+e[size]);
	size++;
}else {
	
}
	
public void searchEmployee(int id) {
	
}
public void displayEmployee() {
	
}
}
