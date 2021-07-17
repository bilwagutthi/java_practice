package org.docterapp.organs;

public class Heart extends Organ{
	private short rate;

	public Heart(String name, String condition, short rate) {
		super(name, condition);
		this.rate = rate;
	}

	public short getRate() {
		return rate;
	}

	public void setRate(short rate) {
		this.rate = rate;
	}
	
	@Override
	public void getDetails() {
		super.getDetails();
		System.out.println("\t| Heart Rate: "+this.getRate());
	}
}
