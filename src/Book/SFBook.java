package Book;

import java.util.Scanner;

public class SFBook extends Book {
	protected int score;
	
	public SFBook(BookKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		super.getUserInput(input);
	
		System.out.print("Enter a score for this book");
		score = input.nextInt();
	}
	
	public void printInfo() {
		String bkind = getKindString();
		System.out.println("Kind: " + bkind);
		System.out.println("Title: " + title);
		System.out.println("Writer: " + writer);
		System.out.println("Code: " + code);
		System.out.println("Score: " + score);
	}	
}

