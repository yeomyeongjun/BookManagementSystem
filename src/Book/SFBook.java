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
			super.printInfo();
			System.out.println("Score: " + score);
	}
			
}

