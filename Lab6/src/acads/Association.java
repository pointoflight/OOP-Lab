package acads;
import extracurriculars.*;

public class Association extends java.lang.Object implements java.lang.Comparable<Association>, IAssociation {
	
	private java.lang.String name;
	private java.lang.String prez;
	private int memberCount;
	private int budget;
	private static final int MAX_NO_OF_MEMBERS = 1000;
	
	public Association(java.lang.String name, java.lang.String prez, int memberCount) {
		
		this.name = name;
		this.prez = prez;
		this.memberCount = memberCount;
		budget = 0;
	}
	
	public java.lang.String getName(){
		return name;
	}
	
	public java.lang.String getPrez(){
		return prez;
	}
	
	public int getMemberCount() {
		return memberCount;
	}
	
	/*public int compareTo​(Association assoc) {
		
		if (this.memberCount == assoc.memberCount)
			return 0;
		else if (this.memberCount > assoc.memberCount)
			return 1;
		else
			return -1;
	}*/
	
	public int calculateBudget() {
		budget = IAssociation.BASE_BUDGET + calculateProjectBudget();
		return budget;
	}
	
	public int extraBudget() {
		
		return (this.BASE_BUDGET - ((Organization)this).BASE_BUDGET);
	}
	
	public int calculateProjectBudget() {
		
		return 3000*memberCount;
	}
	
	public boolean addNewMember() {
		
		if (memberCount < MAX_NO_OF_MEMBERS)
		{
			memberCount++;
			return true;
		}
		return false;
	}

	public int compareTo(Association o) {
		if (this.memberCount == o.memberCount)
			return 0;
		else if (this.memberCount > o.memberCount)
			return 1;
		else
			return -1;
		
	}


	



}
