package Book;

import java.util.Scanner;

public class Book { //day�� ������
	protected BookKind kind = BookKind.Horror; //����Ʈ �� �־���
	public BookKind getKind() {
		return kind;
	}
	
	protected int id; 
	protected int code;
	
	public Book() {
	}
	

	public void setKind(BookKind kind) {
		this.kind = kind;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	
	public void printInfo() {
		System.out.println("ID: " + id + "Code: " + code);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Enter Your Student ID:");
		int id = input.nextInt(); // ������ ������ Ȯ���ϱ� ���� �й�(�л��� ID)�� �Է¹���
		this.setId(id);
		
		System.out.print("Enter Book Code that you want to borrow:");
		int code = input.nextInt(); // ������ å �ڵ� �Է�
		this.setCode(code);
		
		String buf = input.nextLine(); //����Ű ���۵����� ���� ���� ����
	}
}
