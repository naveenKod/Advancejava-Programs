package opps.com.kod;

public class StudentApp {

	public static void main(String[] args) {
    Student st=new Student();
    st.setData(17,"Naveen",23);
    System.out.println(st.getrollNo());
    System.out.println(st.getname());
    System.out.println(st.getage());
	}

}
