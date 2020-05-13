package Book;

import java.util.Scanner;

public abstract class Book implements BookInput{
	protected BookKind kind = BookKind.Horror; 
	public BookKind getKind() {
		return kind;
	}
	
	protected String title; 
	protected int code;
	
	public Book() {
	}
	
	public Book(BookKind kind) {
		this.kind = kind;
	}
	
	public Book(String title, int code) {
		this.title = title;
		this.code = code;
	}
	
	public void setKind(BookKind kind) {
		this.kind = kind;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	public abstract void printInfo();
	
	public void setBookCode(BookInput book, Scanner input) {
		int code = input.nextInt(); 
		book.setCode(code); 
	}
	
	public void getUserInput(Scanner input) {
		input.nextLine();
		
		System.out.print("Enter Title: ");
		String title = input.nextLine(); 
		this.setTitle(title);
		
		System.out.print("Enter Book Code: ");
		int code = input.nextInt(); 
		this.setCode(code); 
		
		input.nextLine();
	}
	
	public String getKindString() {
		String bkind = "none";
		switch(this.kind) {
			case Horror:
				bkind = "Horror.";
			case Sciencefiction:
				bkind = "High";
			case Documentary:
				bkind = "Documentary";
			case Reference:
				bkind = "Reference";
			default: 
		}
		return bkind;
	}
}
