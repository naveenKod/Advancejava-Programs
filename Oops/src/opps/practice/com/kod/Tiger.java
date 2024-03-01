package opps.practice.com.kod;

public class Tiger extends Animal{
String TigerSound="TigerSound";
public void makeSound()
{
	System.out.println("Tiger is making " + TigerSound);
	}
public void acceptParentMethod() {
	super.makeSound();{
		
	}
}
}
