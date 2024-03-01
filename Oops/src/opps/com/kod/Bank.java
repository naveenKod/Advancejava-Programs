package opps.com.kod;

public class Bank {
private int money;
public void setMoney(int amount) {
	if(amount>0) {
		amount=money;
	}else {
	{
		System.out.println("Kindly enter positive no of Money");
	}
	}
}
	public int getMoney(){
		return money;
	}
	
}


