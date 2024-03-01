package abstraction.com.kod;

public class CarApp {

	public static void main(String[] args) {
     car ref ;
     ref= new electricCar();
     ref.start();
     ref.stop();
     ref.refuel();
     
     ref=new petrolCar();
     ref.start();
     ref.stop();
     ref.refuel();
     
     ref=new DesielCar();
     ref.start();
     ref.stop();
     ref.refuel();
	}

}
