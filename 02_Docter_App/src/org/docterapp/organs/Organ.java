package org.docterapp.organs;

public class Organ {
	private String name;
	private String condition;
	public Organ(String name, String condition) {
		super();
		this.name = name;
		this.condition = condition;
	}
	public Organ() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	public void getDetails() {
		System.out.println("\t| Name: "  + this.getName());
		System.out.println("\t| Condition: "+ this.getCondition());
	}
	
}
