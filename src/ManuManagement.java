import java.util.Scanner;

public class ManuManagement {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.println("========================================");
			System.out.println("***BOOK MANAGEMENT PROGRAM***");
			System.out.println("----------------------------------------");
			System.out.println("1. Borrow Books"); // ���� ����
			System.out.println("2. Return Books"); // ���� �ݳ�
			System.out.println("3. Extension of The Borrow Period"); // ���� �Ⱓ ����
			System.out.println("4. Book Search"); // ���� �˻�
			System.out.println("5. Exit"); // ������
			System.out.println("----------------------------------------");
			System.out.println("Please select one number between 1 - 5");
			System.out.println("========================================");
			
			int num = input.nextInt();
			
			if (num == 1) 
				borrowBook();
			else if (num == 2)
				returnBook();
			else if (num == 3)
				extend();
			else if (num == 4)
				search();
			else if (num == 5)
				break;
			else
				continue;
		}
	}
	
	public static void borrowBook() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Your Student ID:");
		int id = input.nextInt(); // ������ ������ Ȯ���ϱ� ���� �й�(�л��� ID)�� �Է¹���
		
		System.out.print("Enter Book Code that you want to borrow:");
		int code = input.nextInt(); // ������ å �ڵ� �Է�
		
		String buf = input.nextLine(); //����Ű ���۵����� ���� ���� ����
	}
	
	public static void returnBook() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Book Code that you want to return:");
		int code = input.nextInt(); // �ݳ��� å �ڵ� �Է�
		
		String buf = input.nextLine(); //����Ű ���۵����� ���� ���� ����
	}
	
	public static void extend() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Your Student ID:");
		int id = input.nextInt(); // ������ ������ Ȯ���ϱ� ���� �й�(�л��� ID)�� �Է¹���
		
		System.out.print("Enter Book Code that you want to extend borrowing period:");
		int code = input.nextInt(); // ����Ⱓ�� ������ å �ڵ� �Է�
		
		System.out.print("How long period you want to extend?");
		while (true) {
			int day = input.nextInt(); // �����ϰ� ���� �Ⱓ �Է�(��: 7��)
			if (day >= 0 && day <= 7)
				break;
		}
		
		String buf = input.nextLine(); //����Ű ���۵����� ���� ���� ����
	}
	
	public static void search() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Book Title that you want to borrow:"); //�˻��� å ���� �Է�
		String title = input.nextLine();
	}
}