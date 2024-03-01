package abstraction.com.kod;

public class StudentApp {
	public static void doActivity(StudentActivity sa) {
		sa.attendClass();
		sa.study();
		sa.assignment();
	}
			
public static void main(String[] args) {
	PhysicsStudent ps=new PhysicsStudent();
	ChemistryStudent cs=new ChemistryStudent();
	doActivity(ps);
	doActivity(cs);
}
}
