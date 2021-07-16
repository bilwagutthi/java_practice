import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		printWelcome();
		int choice;
		boolean flag = true;
		do {
			System.out.println("--------------MENU--------------");
			System.out.println("  1. Start Game");
			System.out.println("  2. Exit");
			System.out.print("      Enter your choice:");
			choice= sc.nextInt();
			switch (choice) {
			case 1 :
				playGame();
				break;
			case 2 :
				flag= false;
				break;
			default :
				System.out.println(" Invalid input. Try again.");
				break;
			}
			System.out.println();
		}while (flag);
		System.out.println("--------------EXIT--------------");
	}

	private static void playGame() {
		System.out.println();
		System.out.println("--------------GAME--------------");
		Random ran = new Random();
		int numToGuess= ran.nextInt(9)+1;
		int trys =6 ;
		int guess;
		while(trys-->0) {
			System.out.println();
			System.out.println("   | Attempts remaining: " + trys);
			guess= getGuess();
			if ( guess== numToGuess) {
				System.out.println("\n Congrations!!\n You guessed correctly in "+(6-trys)+" attempts!");
				break;
			}
			else if(guess < numToGuess && trys>0) {
				System.out.println("   | Wrong! Try a number thats higher");
			}
			else if( guess > numToGuess && trys>0 ) {
				System.out.println("   | Wrong! Try a number thats lower");
			}
			else {
				System.out.println("\n Looks like you couldnt guess."
						+ "\n The number was " + numToGuess
						+ "\n Try the game once more");
			}
		}
		System.out.println();
		System.out.println("------------GAMEOVER------------");
	}

	private static int getGuess() {
		int guess;
		while(true) {
			
			System.out.print("   | Enter your guess: ");
			guess=  sc.nextInt();
			if( guess <1 || guess > 10) {
				System.out.println("   | Invaild input! Try again!");
				continue;
			}
			else {
				break;
			}
		}
		return guess;
	}


	private static void printWelcome() {
		System.out.println("================================");
		System.out.println("|     NUMBER GUESSING GAME     |");
		System.out.println("================================");
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("          INSTRUCTIONS          ");
		System.out.println();
		System.out.println("  1. The number to guess is\n     between 1 to 10.");
		System.out.println("  2. You have 5 chances to\n     guess the number.");
		System.out.println("--------------------------------");
		System.out.println();
	}

}
