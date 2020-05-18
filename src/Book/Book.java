package Book;

import java.util.Scanner;

import Exception.CodeFormatException;

public abstract class Book implements BookInput{
	protected BookKind kind = BookKind.Horror; 
	public BookKind getKind() {
		return kind;
	}
	
	protected String title; 
	protected String writer;
	protected int code;
	
	
	public Book() {
	}
	
	public Book(BookKind kind) {
		this.kind = kind;
	}
	
	public Book(String title, String writer, int code) {
		this.title = title;	
		this.writer = writer;
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
		return this.code;
	}

	public void setCode(int code) throws CodeFormatException { //코드는 8자리로, 첫번째 숫자가 0이 아님
		if (code % 10000000 == 0) {
			throw new CodeFormatException();
		}
		
		this.code = code;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String getWriter() {
		return this.writer;
	}
	
	
	public abstract void printInfo();
	
	public void setBookCode(BookInput book, Scanner input) {
		int code = input.nextInt(); 
		try {
			book.setCode(code);
		} catch (CodeFormatException e) {
			System.out.println("Error! Please enter an 8-digit code.");
			System.out.println("The millionth digit of this code cannot be zero.");			
		} 
		finally {
			System.out.println("The code" + code + "is successfully set.");
		}
	}
	
	public void getUserInput(Scanner input) {
		input.nextLine();
		
		System.out.print("Enter Title: ");
		String title = input.nextLine(); 
		this.setTitle(title);

		System.out.print("Enter Writer: ");
		String writer = input.nextLine();
		this.setWriter(writer);
		
		System.out.print("Enter Book Code: ");
		int code = input.nextInt(); 
		try {
			this.setCode(code); 
		}
		catch (CodeFormatException e) {
			System.out.println("Error! Please enter an 8-digit code.");
			System.out.println("The millionth digit of this code cannot be zero.");			
		}
		
		input.nextLine();
	}
	
	public String getKindString() {
		String bkind = "none";
		switch(this.kind) {
			case Horror:
				bkind = "Horror.";
				break;
			case Sciencefiction:
				bkind = "Sciencefiction";
				break;
			case Documentary:
				bkind = "Documentary";
				break;
			case Reference:
				bkind = "Reference";
				break;
			default: 
		}
		return bkind;
	}
}
