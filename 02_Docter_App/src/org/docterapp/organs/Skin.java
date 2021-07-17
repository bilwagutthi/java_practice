package org.docterapp.organs;

public class Skin extends Organ{
	private String color;

	public Skin(String name, String condition, String color) {
		super(name, condition);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void getDetails() {
		super.getDetails();
		System.out.println("\t Colour: "+ this.getColor());
	}
	
}
