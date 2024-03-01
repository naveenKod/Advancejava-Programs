package Aggregation.com.kod;

public class Airline {
String AirlineName;
Pilot p;
Airline(String AirlineName,Pilot p){
	this.AirlineName="AirlneName";
	this.p=p;
}
void activity() {
	System.out.println(AirlineName+" is Doing Activity");
	p.fly();
}
}
