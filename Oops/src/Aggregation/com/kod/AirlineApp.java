package Aggregation.com.kod;

public class AirlineApp {

	public static void main(String[] args) {
Pilot p=new Pilot("Raju");
p.fly();
Airline ar=new Airline("Kodair",p);
	ar.activity();
	p.fly();
	}

}
