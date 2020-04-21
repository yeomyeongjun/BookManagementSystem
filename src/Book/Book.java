package Book;

import java.util.Scanner;

public class Book { //day는 삭제함
	protected BookKind kind = BookKind.Horror; //디폴트 값 넣어줌
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
		int id = input.nextInt(); // 대출자 정보를 확인하기 위해 학번(학생증 ID)을 입력받음
		this.setId(id);
		
		System.out.print("Enter Book Code that you want to borrow:");
		int code = input.nextInt(); // 대출할 책 코드 입력
		this.setCode(code);
		
		String buf = input.nextLine(); //엔터키 오작동으로 인한 에러 보완
	}
}
