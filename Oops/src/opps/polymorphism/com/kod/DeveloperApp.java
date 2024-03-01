package opps.polymorphism.com.kod;

public class DeveloperApp {

	public static void main(String[] args) {
    Developer dev;
    BackEndDeveloper bd=new BackEndDeveloper();
    dev=bd;//upcosting
    dev.attendMeeting();//inheritence
    dev.project();//overridin
   ((BackEndDeveloper) (dev)).learnJava();//upcosting
   System.out.println("++++++++++++++++++++++++++++++++");
    DataBaseDeveloper dd=new DataBaseDeveloper();
    dev=dd;
    dev.attendMeeting();
    dev.project();
    ((DataBaseDeveloper)(dev)).learnSql();
    System.out.println("++++++++++++++++++++++++++++++++");
    FrontEndDeveloper fd=new FrontEndDeveloper();
    dev=fd;
    dev.attendMeeting();
    dev.project();
    ((FrontEndDeveloper)(dev)).learnHtml();
    System.out.println("++++++++++++++++++++++++++++++++");
 
	}

}
