package exercice1;

import java.util.Scanner;

public class GuessTheNumber {
// steuerung + shift + f um code einzurücken
// steuerung + alt + enter für vervollständigen lassen
	public static void main(String[] args) {
		int numberToGuess = (int) (Math.random() * 20) + 1;
		Scanner scanner = new Scanner(System.in);
		
		boolean guessed = false;
		int tries = 1;

		while (tries <= 5 && !guessed) {
			int guess = scanner.nextInt();
			if (guess > numberToGuess) {
				System.out.println("too big");
				tries++;
			} else if (guess < numberToGuess) {
				System.out.println("too small");
				tries++;
			} else {
				guessed = true;
				break;
			}
		}
		System.out.println("your guess was " + guessed + " after " + tries + " tries");
		scanner.close();
	}

}
