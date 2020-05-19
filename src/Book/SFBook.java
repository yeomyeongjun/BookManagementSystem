package Book;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SFBook extends Book {
	protected double score;
	
	public SFBook(BookKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		super.getUserInput(input);
		
		System.out.println("Enter a score for this book");
		System.out.println("(Caution! Input range: 0.0 to 10.0)");
		
		while (true) {
			try {
				score = input.nextDouble();
				if (score >= 0.0 && score <= 10.0)
					break;
				
				System.out.println("Error! Please enter a number between 0.0 and 10.0.");
				input.nextLine();
			}
			catch (InputMismatchException e) {
				System.out.println("Error! Please enter Only number between 0.0 and 10.0.");
				input.nextLine();
			}
		}
	}
	
	public void printInfo() {
		String bkind = getKindString();
		System.out.println("-----------------------------");
		System.out.println("Kind: " + bkind);
		System.out.println("Title: " + title);
		System.out.println("Writer: " + writer);
		System.out.println("Code: " + code);
		System.out.println("Score: " + score);
		System.out.println("Manager's name: " + manager);
		System.out.println();
	}	
}

