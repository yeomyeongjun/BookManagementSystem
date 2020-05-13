import java.util.ArrayList;
import java.util.Scanner;

import Book.Book;
import Book.BookInput;
import Book.BookKind;
import Book.DocumentaryBook;
import Book.HorrorBook;
import Book.ReferenceBook;
import Book.SFBook;

public class BookManager {
	
	ArrayList<BookInput> books = new ArrayList<BookInput>();
	
	Scanner input; // 스캐너를 반복적으로 선언하지 않고 한번에 선언함
	BookInput BookInput;
	BookManager(Scanner input) { 
		this.input = input;
	}

	public void addBook() {
		int kind = -1;
		
		while (!(kind >= 1 && kind <= 4)) {

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
				System.out.println("Please select num between 1 - 2");
			}
			
			inputBook(BookInput, input);
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
		System.out.println("***Delete menu***");
		System.out.print("Enter Book Code that you want to delete:");
		int code = input.nextInt();

		removeBook(findIndex(code), code);
		input.nextLine();
	}
	
	public int findIndex(int bookcode) {
		int index = -1;
		
		for (int i = 0; i < books.size(); i++) 
			if (books.get(i).getCode() == bookcode) {
				index = i;
				break;
			}
		return index;
	}
	
	public int removeBook(int index, int bookcode) {
		
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
		BookInput.setCode(code); 
	}
	
	public void view() { 
		System.out.println("***View menu***");
		for (int i = 0; i < books.size(); i++)
			books.get(i).printInfo();
	}
}