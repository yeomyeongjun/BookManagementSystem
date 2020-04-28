package Book;

import java.util.Scanner;

public class ReferenceBook extends Book {
	protected String subject;

	public ReferenceBook(BookKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		
		super.getUserInput(input);
		
		System.out.print("Enter a related subject of this book: ");
		subject = input.nextLine();
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Related Subject: " + subject);
	}
			
}
