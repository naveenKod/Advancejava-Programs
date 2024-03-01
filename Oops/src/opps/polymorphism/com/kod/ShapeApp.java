package opps.polymorphism.com.kod;

public class ShapeApp {

	public static void main(String[] args) {
     Square sr=new Square();
     Retangle rt=new Retangle();
     Circle cr=new Circle();
     Geometry gr=new Geometry();
     gr.activity(sr);
     gr.activity(rt);
     gr.activity(cr);
    
	}

}
