package opps.inheritence.com.kod;

public class ParentChildApp {

	public static void main(String[] args) {
    Parent p=new Parent();
    p.foodBusiness();
    System.out.println(p.eyeColor);
    
    Child c=new Child();
    c.foodBusiness();
    System.out.println(c.eyeColor);
	}

}
