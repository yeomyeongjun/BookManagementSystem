package Book;

import java.util.Scanner;

public class SFBook extends Book {
	protected int score;


	public void getUserInput(Scanner input) {
		
		System.out.print("Enter Your Student ID:");
		int id = input.nextInt(); // ������ ������ Ȯ���ϱ� ���� �й�(�л��� ID)�� �Է¹���
		this.setId(id);
		
		System.out.print("Enter Book Code that you want to borrow:");
		int code = input.nextInt(); // ������ å �ڵ� �Է�
		this.setCode(code);
		
		System.out.print("Enter a score for this book");
		score = input.nextInt();
	}
	
	public void printInfo() {
		String bkind = "none";	
		switch(this.kind) {
			case Horror:
				bkind = "Horror.";
			case Sciencefiction:
				bkind = "High";
			case Documentary:
				bkind = "Documentary";
			case Reference:
				bkind = "Reference";
			default: //else
					
			System.out.println("Kind: " + bkind + "ID: " + id + "Code: " + code + "Score: " + score);
		}
			
	}
}
