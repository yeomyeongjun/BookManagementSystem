package Book;

import java.util.Scanner;

public class Book {
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

	
	public void printInfo() {
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
			default: //else
				
		}
		
		System.out.println("Kind: " + bkind + "Title: " + title + "Code: " + code);
	}
	
	public void getUserInput(Scanner input) {
		
		input.nextLine();
		
		System.out.print("Enter Title: ");
		String title = input.nextLine(); 
		this.setTitle(title);
		
		System.out.print("Enter Book Code: ");
		int code = input.nextInt(); //  책 코드 입력
		this.setCode(code);
		
		input.nextLine(); //엔터키 오작동으로 인한 에러 보완
	}
}
