import java.util.ArrayList;
import java.util.Scanner;

import Book.Book;
import Book.HorrorBook;
import Book.SFBook;

public class BookManager {
	
	ArrayList<Book> books = new ArrayList<Book>();
	
	Scanner input; // 스캐너를 반복적으로 선언하지 않고 한번에 선언함
	Book book;
	BookManager(Scanner input) { 
		this.input = input;
	}

	public void addBook() {
		
		int kind = 0;
		
		while (kind != 1 && kind != 2) {
			System.out.print("Select num for Student Kind:");
			System.out.print("1. for Horror Book");
			System.out.print("2. for SF");	
			System.out.print("3. for Documentary");
			System.out.print("4. for Reference Book:");
		
			kind = input.nextInt();
			
			if (kind == 1) {
				book = new HorrorBook();
				book.getUserInput(input);
				books.add(book); //입력받은 정보 추가
				break;
			}
			
			else if (kind == 2) {
				book = new SFBook();
				book.getUserInput(input);
				books.add(book); //입력받은 정보 추가
				break;
				
			}
			
			else if (kind == 2) {
				book = new HorrorBook();
				book.getUserInput(input);
				books.add(book); //입력받은 정보 추가
				break;
				
			}
			
			else {
				System.out.println("Please select num between 1 - 2");
			}
		}
	}
	
	public void deleteBook() {
		
		System.out.print("Enter Book Code that you want to delete:");
		int code = input.nextInt(); // 반납할 책 코드 입력
		
		int index = -1; //초기치를 -1로 설정
		
		for (int i = 0; i < books.size(); i++) 
			if (books.get(i).getCode() == code) {
				index = i;
				break;
			}
		
		
		if (index >= 0) {
			books.remove(index); // 리스트에서 반납할 책 코드는 삭제
			System.out.println("The book" + code + "is deleted.");
			return;
		}
		
		else
			System.out.println("The book" + code + "has not been borrowed.");
	
		
		String buf = input.nextLine(); //엔터키 오작동으로 인한 에러 보완
	}
	
	public void edit() {
		
		int index = -1;
		System.out.println("Please enter current code"); 
		int code = input.nextInt(); // 변경할 코드 입력
		
		for (int i = 0; i < books.size(); i++) 
			if (books.get(i).getCode() == code) {
				index = i;
				System.out.println("Please enter new code");
				int edit = input.nextInt(); // 변경할 코드 입력
				book.setCode(edit); // 코드 변경
				break;
			}
		
		String buf = input.nextLine(); //엔터키 오작동으로 인한 에러 보완
	}
	
	public void view() { // search기능 대신 view 기능으로 대체함
		for (int i = 0; i < books.size(); i++)
			books.get(i).printInfo();
			
	}
}
