package exercice2;

import java.util.Scanner;

public class SnakeTranslator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Write word to be translated!");
		String input = scanner.nextLine();
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			output.append(input.charAt(i));
			if ("aeiouAEIOU".contains(String.valueOf(input.charAt(i)))){
				output.append("s").append(input.charAt(i));
			}
		}
		System.out.println("Snake translator: " + output);
		scanner.close();
		
	}

}
