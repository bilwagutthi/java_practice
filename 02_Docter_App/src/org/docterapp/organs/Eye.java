package org.docterapp.organs;

public class Eye extends Organ{
	private String color;
	private boolean isOpen;
	public Eye() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Eye(String name, String condition) {
		super(name, condition);
		// TODO Auto-generated constructor stub
	}
	public Eye(String name, String condition, String color, boolean isOpen) {
		super(name, condition);
		this.color = color;
		this.isOpen = isOpen;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	@Override
	public void getDetails() {
		super.getDetails();;
		System.out.println("\t| Colour: " + this.getColor());
		System.out.println("\t| Opened: " + this.isOpen());
		
	}
	
	public void open() {
		this.isOpen= true;
		System.out.println("\t+" + this.getName()+" opened.");
	}
	
	public void close() {
		this.isOpen= false;
		System.out.println("\t+" + this.getName()+" closed.");
	}
}
