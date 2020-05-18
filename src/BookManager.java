import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Book.Book;
import Book.BookInput;
import Book.BookKind;
import Book.DocumentaryBook;
import Book.HorrorBook;
import Book.ReferenceBook;
import Book.SFBook;
import Exception.CodeFormatException;

public class BookManager {
	
	ArrayList<BookInput> books = new ArrayList<BookInput>();
	
	Scanner input;
	BookInput BookInput;
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
					System.out.println("Please select num between 1 - 4");
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
		code = input.nextInt();
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
			books.remove(index);
			System.out.println("The book" + bookcode + "is deleted.");
			return 1;
		}
		
		else {
			System.out.println("The book" + bookcode + "has not deleted.");
			return -1;
		}
	}
	
	public void edit() {
		System.out.println("***Edit menu***");
		System.out.println("Please enter Current code you want to fix");
		int code = input.nextInt();
		
		int index = -1;
		
		for (int i = 0; i < books.size(); i++) 
			if (books.get(i).getCode() == code) {
				index = i;
				System.out.println("Please enter new code");
				setBookCode(BookInput, input);
				break;
			}
		
		input.nextLine();
	}
	
	public void setBookCode(BookInput book, Scanner input) {
		int code = input.nextInt(); 
		try {
			BookInput.setCode(code);
		} 
		catch (CodeFormatException e) {
			System.out.println("Error! Please enter an 8-digit code.");
			System.out.println("The millionth digit of this code cannot be zero.");			
		} 
	}
	
	public void view() { 
		System.out.println("***View menu***");
		for (int i = 0; i < books.size(); i++)
			books.get(i).printInfo();
	}
}