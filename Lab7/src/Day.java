import java.util.*;
import java.io.*;

public class Day {
	
	public class Node{
		
		public class Event{
			
			private int startTime;
			private int endTime;
			java.lang.String name;
			
			public Event(int startTime, int endTime, java.lang.String eventName) {
				
				this.startTime = startTime;
				this.endTime = endTime;
				this.name = eventName;
			}
			
			public int getStartTime() {
				
				return startTime;
			}
			
			public int getEndTime() {
				
				return endTime;
			}
			
			public void changeStartTime​(int newStartTime) {
				
				this.startTime = newStartTime;
			}
			
			public void changeEndTime​(int newEndTime) {
				
				this.endTime = newEndTime;
			}
			
			public void addBST​(int bstValue) {
				
				 this.startTime += bstValue;
				 this.endTime += bstValue;
			}
		}
		
		Day.Node.Event event;
		Day.Node prev;
		Day.Node next;
		
		
		Node(int eventStartTime, int eventEndTime, java.lang.String eventName){
			
			event = new Event(eventStartTime,eventEndTime,eventName);
			 
			this.prev = null;
			this.next = null;
		}
		
		Node(Day.Node.Event ev){
			
			event = ev;
			this.prev = null;
			this.next = null;
		}
			
	}
	
	Day.Node head;
	int dayIndex;
	
	
	public Day(int dayNumber) {
		
		head = new Node(null);  // sure?
		this.dayIndex = dayNumber;
	}
	
	public boolean addEvent​(Day.Node.Event ev) {
		
		Node current = head.next;
		if (head.next == null)
		{
			head.next = new Day.Node(ev);
			return true;
		}
		else
		{
		while (current.next != null)
		{
			if (ev.startTime >= current.event.endTime)
			{
				Node newn = new Node(ev);
				Node temp = current.next;
				current.next = newn;
				newn.next = temp;
				return true;
			}
			else
				current = current.next;
		}
		}
		return false;
		
	}
	
	public boolean deleteEventAtIndex​(int index) {
		
		if (index>0)
		{
			Node current = head;
			int counter = -1;
			Node prev = head.prev;
			while (current.next!=null)
			{
				if (counter==index)
				{
					prev.next = current.next;
					return true;
				}
				else
				{
					counter++;
					prev = current;
					current = current.next;
				}
			}
				return false;
		}
		else
			return false;
	}
	
	public void modifyTime​(int index, int change) {
		
		Node current = head.next;
		int counter = 0;
		while (current.next!=null)
		{
			if (counter ==  index)
			{
				current.event.addBST​(change);
				break;
			}
			else
			{
				counter++;
				current = current.next;
			}
		}
		
	}
}
