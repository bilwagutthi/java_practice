package org.docterapp.organs;

public class Patient {
	private String name;
	private short age;
	private Eye leftEye;
	private Eye rightEye;
	private Heart heart;
	private Skin skin;
	private Stomach stomach;
	public Patient(String name, short age, Eye leftEye, Eye rightEye, Heart heart, Skin skin, Stomach stomach) {
		super();
		this.name = name;
		this.age = age;
		this.leftEye = leftEye;
		this.rightEye = rightEye;
		this.heart = heart;
		this.skin = skin;
		this.stomach = stomach;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public short getAge() {
		return age;
	}
	public void setAge(short age) {
		this.age = age;
	}
	public Eye getLeftEye() {
		return leftEye;
	}
	public void setLeftEye(Eye leftEye) {
		this.leftEye = leftEye;
	}
	public Eye getRightEye() {
		return rightEye;
	}
	public void setRightEye(Eye rightEye) {
		this.rightEye = rightEye;
	}
	public Heart getHeart() {
		return heart;
	}
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	public Skin getSkin() {
		return skin;
	}
	public void setSkin(Skin skin) {
		this.skin = skin;
	}
	public Stomach getStomach() {
		return stomach;
	}
	public void setStomach(Stomach stomach) {
		this.stomach = stomach;
	}
	
	
}
