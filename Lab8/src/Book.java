import java.util.*;

public class Book extends java.lang.Object implements java.lang.Comparable<Book> {
	
	public static java.util.HashMap<Book,Shelf> bookToShelf;
	private int id;
	private java.lang.String name;
	private java.lang.String author;
	
	
	public Book(java.lang.String name, java.lang.String author, int id){
		
		 this.name = name;
		 this.author = author;
		 this.id = id;
	}
	
	public int getId() {
		
		return id;
	}
	
	public java.lang.String getName(){
			
		return name;
	}
	
	public java.lang.String getAuthor(){
		
		return author;
	}
	
	public int compareTo(Book obj) {
		
		return this.id - obj.id;
	}
	
	public boolean equals(Book obj) {
		
		if (this.getName() == obj.getName() && this.getId() == obj.getId() && this.getAuthor() == obj.getAuthor())
			return true;
		return false;
	}
	
	public Shelf getShelf() {
		
		Book b1 = new Book(this.name,this.author,this.id);
		return bookToShelf.get(b1);
		
	}
	
}
