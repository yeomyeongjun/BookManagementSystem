package Book;

import java.util.Scanner;

public class HorrorBook extends Book {
	protected int score;

	public HorrorBook(BookKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		
		super.getUserInput(input);
		
		System.out.print("Enter a score for this HorrorBook");
		score = input.nextInt();
	}
	
	public void printInfo() {
		String bkind = getKindString();
		System.out.println("Kind: " + bkind);
		System.out.println("Title: " + title);
		System.out.println("Code: " + code);
		System.out.println("Score: " + score);
	}	
	
	
}

