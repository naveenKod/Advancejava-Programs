package Composition.com.kod;

public class Book {
String author;
Page p=new Page("java");
Book(String author){
	this.author=author;
}
void readBook() {
	System.out.println("Reading book by author"+author);
}
}
