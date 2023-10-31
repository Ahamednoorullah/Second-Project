package com.chinesys.practiseday2.first;
class Books{
	String title;
	String author;
}

class BooksTestDrive {

	public static void main(String[] args) {
		Books[] myBooks = new Books[3];
		
		myBooks[0] = new Books();
		myBooks[1] = new Books();
		myBooks[2] = new Books();
		int i =0 ;
		myBooks[0].title = "The Grapes of Java";
		myBooks[1].title = "The Java Gatsby";
		myBooks[2].title = "The Java Cookbook";
		myBooks[0].author = "bob";
		myBooks[1].author = "sue";
		myBooks[2].author = "ian";
		
		
		while (i < 3) {
			System.out.print(myBooks[i].title);
			System.out.print(" by ");
			System.out.println(myBooks[i].author);
			i++;
		}
		

	}

}
