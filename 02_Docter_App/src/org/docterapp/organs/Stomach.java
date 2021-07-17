package org.docterapp.organs;

public class Stomach extends Organ{
	private boolean isEmpty;

	public Stomach(String name, String condition, boolean isEmpty) {
		super(name, condition);
		this.isEmpty = isEmpty;
	}

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	@Override 
	public void getDetails(){
		super.getDetails();
		System.out.println("\t| Stomach is "+ (this.isEmpty()?"Empty":"Full") + ".");
	}
	
	public void Digest() {
		System.out.println("\t+ Digesting begaining..");
	}
}
