package Book;

import java.util.Scanner;

public class HorrorBook extends Book {
	
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
