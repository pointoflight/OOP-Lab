import java.util.*;

public class Library {
	
	private java.lang.String name;
	private int maxShelves;
	private java.util.List<Shelf> shelvesList;
	
	
	public Library(java.lang.String name, int capacity)
	{
		this.name = name;
		this.maxShelves = capacity;
		shelvesList = new ArrayList<Shelf>(maxShelves);
	}
	
	public boolean addShelf​(java.lang.String category, int capacity)
	{
		Shelf s1 = new Shelf(category,capacity);
		if (shelvesList.size() <  maxShelves)
		{
			shelvesList.add(s1);
			return true;
		}
		return false;
	}
	
	public int getNumBooks() {
		
		int res = 0;
		for (int i=0;i<shelvesList.size();i++)
		{
			res += shelvesList.get(i).getNumBooks();
		}
		return res;
	}
	
	public java.lang.String getName(){
		
		return name;
	}
	
	public int getMaxShelves() {
		
		return maxShelves;
	}
	
	public java.util.List<Shelf> getShelvesList(){
		
		return shelvesList;
	}
	
	public java.util.Set<Shelf> searchBook​(java.lang.String name){
		
		Set<Shelf> res = new HashSet<Shelf>();
		for (int i=0;i<shelvesList.size();i++)
		{
			Shelf s = shelvesList.get(i);
			List<Book> books = s.getBooks();
			for (int j=0;j<books.size();j++)
			{
				if (books.get(j).getName() == name)
					res.add(s);
			}
		}
		return res;
	}
	
	public Shelf getShelf​(java.lang.Integer i) {
		
		return shelvesList.get(i);
	}
	
	public java.lang.Integer getNumShelves(){
		
		return shelvesList.size();
	}
}
