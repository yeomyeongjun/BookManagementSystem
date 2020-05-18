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
		String bkind = getKindString();
		System.out.println("Kind: " + bkind);
		System.out.println("Title: " + title);
		System.out.println("Writer: " + writer);
		System.out.println("Code: " + code);
		System.out.println("Related Subject: " + subject);
	}
}
