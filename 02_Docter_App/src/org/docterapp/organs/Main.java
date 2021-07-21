package org.docterapp.organs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Patient p = new Patient("Lou",(short)35, 
				new Eye("Left Eye","none","blue", true),
				new Eye("Right Eye","myopia","blue",true),
				new Heart("Heart","BP",(short)120),
				new Skin("Skin","None", "brown"),
				new Stomach("Stomach","None",true));
		
		System.out.println("\t]Name: " +p.getName());
		System.out.println("\t]Age: " + p.getAge());
		
		Scanner sc= new Scanner(System.in);
		int choice;
		boolean flag= true;
		do {
			System.out.println(" Choose an organ:");
			System.out.println(" 1. Left Eye\n"
					+ " 2. Right Eye\n"
					+ " 3. Heart\n"
					+ " 4. Skin\n"
					+ " 5. Stomach\n"
					+ " 6. Exit\n");
			System.out.print("\t Enter your choice: ");
			choice= sc.nextInt();
			switch(choice) {
			case 1:
				p.getLeftEye().getDetails();
				if(p.getLeftEye().isOpen()) {
					System.out.println("\t\t| 1.Close the eye?");
					if (sc.nextInt()==1) {
						p.getLeftEye().close();
					} else continue;
					}
				else {
					System.out.println("\t\t| 1.Open the eye?");
					if (sc.nextInt()==1) {
						p.getLeftEye().open();
					} else continue;
					}
				break;
			case 2:
				p.getRightEye().getDetails();
				if(p.getRightEye().isOpen()) {
					System.out.println("\t\t| 1.Close the eye?");
					if (sc.nextInt()==1) {
						p.getRightEye().close();
					} else continue;
					}
				else {
					System.out.println("\t\t| 1.Open the eye?");
					if (sc.nextInt()==1) {
						p.getRightEye().open();
					} else continue;
					}
				break;
			
			case 3:
				p.getHeart().getDetails();
				System.out.println("\t\t| 1. Change the heart rate?");
				if (sc.nextInt()==1) {
					System.out.print("\t\t\tEnter the heart rate: ");
					short rate= sc.nextShort();
					p.getHeart().setRate(rate);
					System.out.println("\t\t\tHeart rate chnaged to: "+ p.getHeart().getRate());
				} else continue;
				break;
			case 4:
				p.getSkin().getDetails();
				break;
				
			case 5:
				p.getStomach().getDetails();
				System.out.println("\t\t1. Digest?");
				if (sc.nextInt()==1) {
					p.getStomach().Digest();
				}
				else continue;
				break;
			
			case 6:
				flag=false;
				break;
			
			default:
				System.out.println("\t\t** Invalid input! Try again.");
				break;
			}
		} while(flag);
		
	}

}
