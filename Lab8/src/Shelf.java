import java.util.*;

public class Shelf {
	
	private java.lang.String category;
	private java.util.List<Book> books;
	private int capacity;
	
	public Shelf(java.lang.String category, int capacity) {
		
		this.books = new ArrayList<Book>();
		this.capacity = capacity;
		this.category = category;
	}
	
	public java.lang.String getCategory(){
		
		return category;
	}
	
	public Book getBooks​(int id) {
		
	//	ListIterator<Book> i = new ListIterator<Book>();
		for (int i=0;i<books.size();i++)
		{
			Book b1 = books.get(i);
			if (b1.getId() == id)
				return b1;
		}
		return null;
	}
	
	public boolean addBook​(java.lang.String name, java.lang.String author, int id) {
		
	
		Book b = new Book(name,author,id);
		Book.bookToShelf.put(b, this);
		books.add(b);
		return true;
		
	}
	
	public boolean addBook​(Book book) {
		
		int c = 0;
		for (int i=0;i<books.size();i++)
		{
			Book b1 = books.get(i);
			if (b1.equals(book))
				c = 1;
		}
		if (c==1)
			return false;
		else
		{
			books.add(book);
			return true;
		}
		
	}
	
	public int getCapacity() {
		
		return capacity;
	}
	
	public int getNumBooks() {
		
		return books.size();
	}
	
	public java.lang.Boolean organize(){
		
		Collections.sort(books);
		return true;
	}
	
	public java.lang.Boolean isRedundant​(Shelf shelf) {
		
		if (shelf.getBooks().containsAll(this.getBooks()))
			return true;
		return false;
	}
	
	public java.util.List<Book> getBooks(){
		
		return books;
	}
	
	
}
