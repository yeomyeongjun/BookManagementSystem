import java.util.Scanner;

public class ManuManagement { 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		BookManager bookManager = new BookManager(input); //ManuManagement���� BookManager�� �����Ѵٰ� ����

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
				bookManager.borrowBook(); //�տ� �ν��Ͻ� bookmanager�� �ٿ��� Ŭ���� ����
			else if (num == 2)
				bookManager.returnBook();
			else if (num == 3)
				bookManager.extend();
			else if (num == 4)
				bookManager.search();
			else if (num == 5)
				break;
			else
				continue;
		}
	}
}