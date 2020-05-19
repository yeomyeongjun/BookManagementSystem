package Book;

import java.util.InputMismatchException;
import java.util.Scanner;

import Exception.CodeFormatException;

public abstract class Book implements BookInput{
	protected BookKind kind = BookKind.Horror; 
	public BookKind getKind() {
		return kind;
	}
	
	protected String title; //책제목
	protected String writer; //저자
	protected int code; //도서 일련번호
	protected String manager; //관리자
	
	
	public Book() {
	}
	
	public Book(BookKind kind) {
		this.kind = kind;
	}
	
	public Book(String title, String writer, int code, String manager) {
		this.title = title;	
		this.writer = writer;
		this.code = code;
		this.manager = manager;
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

	public void setCode(int code) throws CodeFormatException {
		if (code / 10000000 == 0) {
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
	
	public void setManager(String manager) {
		this.manager = manager;
	}
	
	public String getManager() {
		return this.manager;
	}
	
	
	public abstract void printInfo();
	
	public void setBookCode(BookInput book, Scanner input) {
		
		while (true) {
			try {
				int code = input.nextInt(); 
				book.setCode(code);
				break;
			} 
			catch(InputMismatchException e) {
				System.out.println("Error! Please enter an 8-digit code.");		
			}
			catch (CodeFormatException e) {
				System.out.println("Error! The first digit of an 8-digit code cannot be 0.");					
			}				
			
		}
	}
	
	public void getUserInput(Scanner input) {
		input.nextLine();
		int code = -1;
		
		System.out.print("Enter Title: ");
		String title = input.nextLine(); 
		this.setTitle(title);

		System.out.print("Enter Writer: ");
		String writer = input.nextLine();
		this.setWriter(writer);
		
		int kind = randomYesNo(input);
		if (kind == 1) {
			while (true) {
				try {
					System.out.print("Enter Book Code: ");
					code = input.nextInt(); 
					this.setCode(code); 
					break;
				}
				catch (InputMismatchException e) {
					System.out.println("Error! Please enter an 8-digit code.");	
					input.nextLine();
				}
				catch (CodeFormatException e) {
					System.out.println("Error! The first digit of an 8-digit code cannot be 0.");		
					
				}				

			}
		}
		
		else if (kind == 2) {
			while (true) {
				try {
					double random = Math.random();
					int tmp = (int)(random * 99999999) + 10000000;
					if (tmp >= 10000000 && tmp <= 99999999) {
						code = tmp;
						this.setCode(code);
						System.out.println("code: " + code);
						System.out.println();
						System.out.println("8-digits of code have been successfully generated.");
						this.setCode(code);
						break;
					}
				} 	
				catch (InputMismatchException e) {
					System.out.println("Error! Please enter an 8-digit code.");	
				}
				catch (CodeFormatException e) {
					System.out.println("Error! The first digit of an 8-digit code cannot be 0.");		
					
				}	
			}
		}
		input.nextLine();
		
		System.out.print("Enter manager's name for this book: ");
		String manager = input.nextLine();
		this.setManager(manager);
	}
	
	public int randomYesNo(Scanner input){
		int kind = -1;
		
		System.out.println("You can enter the 8-digit book code directly,");
		System.out.println("or you can generate a random 8-digit code.");
		System.out.println();
		System.out.println("1. I want to enter 8 digits of code myself");
		System.out.println("2. I Want to generate random 8-digit code");
		System.out.println();
		System.out.println("Please select one number between 1 - 2");
		
		while (true) {
			try {
				kind = input.nextInt();	
				return kind;
			}
			
			catch (InputMismatchException e){
				System.out.println("Error! Please enter 1 or 2");
				input.nextLine();
			}
		}
		
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
