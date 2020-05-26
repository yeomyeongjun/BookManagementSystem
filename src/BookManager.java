import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Book.BookInput;
import Book.BookKind;
import Book.DocumentaryBook;
import Book.HorrorBook;
import Book.ReferenceBook;
import Book.SFBook;
import Exception.CodeFormatException;

public class BookManager implements Serializable{
	
	private static final long serialVersionUID = 689478802367667920L;

	ArrayList<BookInput> books = new ArrayList<BookInput>();
	
	transient Scanner input;
	BookInput BookInput;
	
	public void setScanner(Scanner input) {
		this.input = input;
	}
	
	BookManager(Scanner input) { 
		this.input = input;
	}

	public void addBook() {
		int kind = -1;
		
		while (!(kind >= 1 && kind <= 4)) {
			try {
				showAddMenu();
				kind = input.nextInt();
	
				switch(kind) {
				case 1:
					BookInput = new HorrorBook(BookKind.Horror);
					break;
				case 2:
					BookInput = new SFBook(BookKind.Sciencefiction);
					break;
				case 3:
					BookInput = new DocumentaryBook(BookKind.Documentary);
					break;				
				case 4:
					BookInput = new ReferenceBook(BookKind.Reference);
					break;
				default:
					System.out.println("Please select number between 1 - 4");
				}
				
				inputBook(BookInput, input);
			}
			catch (InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 4!");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		} 
	}
	
	public void showAddMenu() {
		System.out.println("***Add menu***");
		System.out.println("1. for Horror Book");
		System.out.println("2. for SF");	
		System.out.println("3. for Documentary");
		System.out.println("4. for Reference Book:");
		System.out.println("Please Select num 1 - 4 for Book Kind:");
	}
	
	public void inputBook(BookInput book, Scanner input) {
		book.getUserInput(input);
		books.add(book);
	}
	
	public void deleteBook() {
		int code = -1;
		System.out.print("Enter Book Code that you want to delete:");
		while (true) {
			try {
				code = input.nextInt();
				break;
			}
			
			catch (InputMismatchException e) {
				System.out.println("Error! Please enter Code that is integer type.");
				input.nextLine();
			}
		}
		removeBook(code);
	}
	
	public int removeBook(int bookcode) {
		int index = -1;
		
		for (int i = 0; i < books.size(); i++)
			if (books.get(i).getCode() == bookcode) {
				index = i;
				break;
			}
		
		if (index >= 0) {
			System.out.println("The book [" + books.get(index).getTitle() + "] is deleted.");
			books.remove(index);
			return 1;
		}
		
		else {
			System.out.println("The book [" + books.get(index).getTitle() + " ] has not deleted.");
			return -1;
		}
	}
	
	public void edit() {
		int code;
		System.out.println("***Edit menu***");

		while (true) {
			try {
					System.out.print("Please enter Current code you want to fix");
					code = input.nextInt();
					break;
				}
				catch (InputMismatchException e) {
					System.out.println("Error! Please enter accurate code.");
					input.nextLine();
				}
		}
		int index = -1;
		
		for (int i = 0; i < books.size(); i++) 
			if (books.get(i).getCode() == code) {
				index = i;
				System.out.print("Please enter new code:");
				setBookCode(BookInput, input);
				break;
			}
		
		input.nextLine();
	}
	
	public void setBookCode(BookInput book, Scanner input) {
		while (true) {
			try {
				int code = input.nextInt(); 
				BookInput.setCode(code);
				break;
			} 
			catch (InputMismatchException e) {
				System.out.println("Error! Please enter an 8-digit code.");
				input.nextLine();
			}
			catch (CodeFormatException e) {
				System.out.println("The millionth digit of this code cannot be zero.");	
				input.nextLine();
			} 
		}
	}
	
	public void view() { 
		System.out.println("***View menu***");
		for (int i = 0; i < books.size(); i++)
			books.get(i).printInfo();
	}
}