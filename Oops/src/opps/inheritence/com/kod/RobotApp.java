package opps.inheritence.com.kod;

public class RobotApp {

	public static void main(String[] args) {
    ChefRobot cr=new ChefRobot();
    cr.talk();
    cr.walk();
    cr.charge();
    cr.cook();
    System.out.println("========================");
    
    DoctorRobot dr=new DoctorRobot();
    dr.talk();
    dr.walk();
    dr.charge();
    dr.surgery();
    System.out.println("=========================");
    
    TeacherRobot tr=new TeacherRobot();
    tr.talk();
    tr.walk();
    tr.charge();
    tr.teach();
    
    
    
    
    
	}

}
