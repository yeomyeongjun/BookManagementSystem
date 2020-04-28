import java.util.ArrayList;
import java.util.Scanner;

import Book.Book;
import Book.HorrorBook;
import Book.SFBook;

public class BookManager {
	
	ArrayList<Book> books = new ArrayList<Book>();
	
	Scanner input; // ��ĳ�ʸ� �ݺ������� �������� �ʰ� �ѹ��� ������
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
				books.add(book); //�Է¹��� ���� �߰�
				break;
			}
			
			else if (kind == 2) {
				book = new SFBook();
				book.getUserInput(input);
				books.add(book); //�Է¹��� ���� �߰�
				break;
				
			}
			
			else if (kind == 2) {
				book = new HorrorBook();
				book.getUserInput(input);
				books.add(book); //�Է¹��� ���� �߰�
				break;
				
			}
			
			else {
				System.out.println("Please select num between 1 - 2");
			}
		}
	}
	
	public void deleteBook() {
		
		System.out.print("Enter Book Code that you want to delete:");
		int code = input.nextInt(); // �ݳ��� å �ڵ� �Է�
		
		int index = -1; //�ʱ�ġ�� -1�� ����
		
		for (int i = 0; i < books.size(); i++) 
			if (books.get(i).getCode() == code) {
				index = i;
				break;
			}
		
		
		if (index >= 0) {
			books.remove(index); // ����Ʈ���� �ݳ��� å �ڵ�� ����
			System.out.println("The book" + code + "is deleted.");
			return;
		}
		
		else
			System.out.println("The book" + code + "has not been borrowed.");
	
		
		String buf = input.nextLine(); //����Ű ���۵����� ���� ���� ����
	}
	
	public void edit() {
		
		int index = -1;
		System.out.println("Please enter current code"); 
		int code = input.nextInt(); // ������ �ڵ� �Է�
		
		for (int i = 0; i < books.size(); i++) 
			if (books.get(i).getCode() == code) {
				index = i;
				System.out.println("Please enter new code");
				int edit = input.nextInt(); // ������ �ڵ� �Է�
				book.setCode(edit); // �ڵ� ����
				break;
			}
		
		String buf = input.nextLine(); //����Ű ���۵����� ���� ���� ����
	}
	
	public void view() { // search��� ��� view ������� ��ü��
		for (int i = 0; i < books.size(); i++)
			books.get(i).printInfo();
			
	}
}
