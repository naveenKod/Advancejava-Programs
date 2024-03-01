package Composition.com.kod;

public class Page {
String content;
Page(String content){
this.content=content;
}
void writecontent() {
	System.out.println("Writing content"+content+"an page");
}
}
