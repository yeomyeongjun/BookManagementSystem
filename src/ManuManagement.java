import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class ManuManagement { 
	
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BookManager bookManager = getObject("bookmanager.ser");
		
		if (bookManager == null)
			bookManager = new BookManager(input);
		else
			bookManager.setScanner(input);
		
		if (bookManager == null) 
			bookManager = new BookManager(input);

		selectMenu(input, bookManager);
		putObject(bookManager, "bookmanager.ser");
	}
	
	public static void selectMenu(Scanner input, BookManager bookManager) {
		int kind = -1;
		
		while (true) {
			try {
				showMenu();
				
				kind = input.nextInt();
				
				switch(kind) {
				case 1:
					bookManager.addBook();
					logger.log("Add a book");
					break;
				case 2:
					bookManager.deleteBook();
					logger.log("Delete a book");
					break;
				case 3:
					bookManager.edit();
					logger.log("Edit list of book");
					break;
				case 4:
					bookManager.view();
					logger.log("View all books");
					break;
				case 5:
					break;
				
				default:
					continue;
				}
			}
			catch (InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}	
		}
	}
	
	public static void showMenu() {
		System.out.println("=====BOOK MANAGEMENT PROGRAM=====");
		System.out.println("***MENU***");
		System.out.println("1. Add Book"); // 도서 대출
		System.out.println("2. Delete Book"); // 도서 반납
		System.out.println("3. Edit Book Information"); // 도서 정보 수정
		System.out.println("4. View All Books"); // 도서 검색
		System.out.println("5. Exit"); // 나가기
		System.out.println();
		System.out.println("Please select one number between 1 - 5");
	}
	
	
	public static BookManager getObject(String filename) {
		BookManager bookManager = null;
		FileInputStream file;
		try {
			file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			bookManager = (BookManager) in.readObject();

			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
			return bookManager;
		} catch (IOException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return bookManager;
	} 
		
	public static void putObject(BookManager bookManager, String filename) {
		
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(bookManager);

			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	} 
}
