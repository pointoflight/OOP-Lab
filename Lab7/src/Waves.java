import java.util.*;
import java.io.*;


public class Waves {
	
	java.util.ArrayList<Day> days;
	
	public Waves() {
		
		days = new ArrayList<Day>();
	}
	
	public boolean addDay​(Day d) {
		
		ListIterator<Day> iterator = days.listIterator();
		int c = 0;
		while (iterator.hasNext())
		{	
			if (iterator.next().dayIndex != c)
				{
					return false;
				}
			else
			{
				c++;
			}
		}
		days.add(d);
		return true;
		
	}
	
	public boolean deleteDay​(Day d) {
		
		ListIterator<Day> iterator = days.listIterator();
		while (iterator.hasNext())
		{
			if (iterator.next() == d)
				{
					days.remove(iterator.previous().dayIndex);
					return true;
				}
		}
		return false;
	}
	
	public boolean addEvent​(int dayIndex, int startTime, int endTime, java.lang.String eventName) {
		
		ListIterator<Day> iterator = days.listIterator();
		//Day.Node.Event ev1 = new Day.Node.Event(startTime, endTime, eventName);
		while(iterator.hasNext())
		{
			if (iterator.next().dayIndex == dayIndex)
				{
					Day d1 = iterator.previous();
				//	Day.Node.Event ev1 = new d1.head.;
					d1.head.new Event(startTime, endTime, eventName);
					iterator.next();
					//iterator.previous().addEvent​(ev1);
					return true;
				}
		}
		return false;
	}
	
	public boolean deleteEvent​(int dayIndex, int eventIndex) {
		
		ListIterator<Day> iterator = days.listIterator();
		
		while (iterator.hasNext())
		{
			if (iterator.next().dayIndex == dayIndex)
			{
				iterator.previous().deleteEventAtIndex​(eventIndex);
				return true;
			}
		}
		return false;
	}
	
	public void modifyBST​(int dayIndex, int eventIndex, int bst) {
		
		ListIterator<Day> iterator = days.listIterator();
		
		while (iterator.hasNext())
		{
			if (iterator.next().dayIndex == dayIndex)
			{
				iterator.previous().modifyTime​(eventIndex, bst);
			}
		}
	}
	
	/*public void cascadeBST​(int dayIndex, int eventIndex, int startBST, int reduce, int maxEvents) {
		
		ListIterator<Day> iterator = days.listIterator();
		
		while (iterator.hasNext()) {
			
			if (iterator.next().dayIndex == dayIndex)
			{
				Day d1 = iterator.previous();
				Day.Node current = d1.head;
				while (current.next!=null)
				{
					
				}
			}
		}
	}*/
	
	
	
}
