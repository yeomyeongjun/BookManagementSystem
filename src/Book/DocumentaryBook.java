package Book;

import java.util.Scanner;

public class DocumentaryBook extends Book {
	protected String genre;

	public DocumentaryBook(BookKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		super.getUserInput(input);
		System.out.print("Enter a detailed genre of this book: ");
		genre = input.nextLine();
	}
	
	public void printInfo() {
		String bkind = getKindString();
		System.out.println("Kind: " + bkind);
		System.out.println("Title: " + title);
		System.out.println("Code: " + code);
		System.out.println("Detailed genre: " + genre);
	}
}
