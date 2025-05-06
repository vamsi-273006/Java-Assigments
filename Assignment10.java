//ELC and BLC
//Source Code

package assignment10_ELCBLC;
//ELC(Executable Logic class)
public class LibraryMain {
public static void main(String[] args) {
	Library lib=new Library();
	lib.setBookDetails(101, "prakash", "A biopic", 1100, 200);
	lib.displayBookDetails();
}
}

//Business Logic class
class Library{
	int bookId;
	String author;
	String title;
	double price;
	int pages;
	public void setBookDetails(int bookId,String author,String title,double price,int pages) {
		this.bookId=bookId;
		this.author=author;
		this.title=title;
		this.price=price;
		this.pages=pages;
	}
	public void displayBookDetails() {
		System.out.println("book id:"+bookId);
		System.out.println("author:"+author);
		System.out.println("title:"+title);
		System.out.println("price:"+price);
		System.out.println("pages:"+pages);
	}
}


//Output

book id:101
author:prakash
title:A biopic
price:1100.0
pages:200