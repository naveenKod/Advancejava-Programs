package opps.com.kod;

public class Laptop {
private String Processor;
private int Storage;

public Laptop(String Processor,int Storage) {
	this.Processor=Processor;
	this.Storage=Storage;
}
public  String getProcessor() {
	return Processor;
}
public int getStorage() {
	return Storage;
}
}
