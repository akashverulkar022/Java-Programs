package Test2;

import java.util.Scanner;

public class InsertSpace {
	public static String insertSpace(String s) {
		// Use a lambda expression to insert a space between each character
		return s.chars()
				.mapToObj(c -> (char) c + " ")
				.reduce("", String::concat)
				.trim();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String result = insertSpace(input);
		System.out.println("Formatted string: " + result);
	}

}