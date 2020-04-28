import java.util.Scanner;

public class ManuManagement { 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		BookManager bookManager = new BookManager(input); //ManuManagement���� BookManager�� �����Ѵٰ� ����

		while (true) {
			System.out.println("========================================");
			System.out.println("***BOOK MANAGEMENT PROGRAM***");
			System.out.println("----------------------------------------");
			System.out.println("1. Add Book"); // ���� ����
			System.out.println("2. Delete Book"); // ���� �ݳ�
			System.out.println("3. Edit Book Information"); // ���� ���� ����
			System.out.println("4. View All Books"); // ���� �˻�
			System.out.println("5. Exit"); // ������
			System.out.println("----------------------------------------");
			System.out.println("Please select one number between 1 - 5");
			System.out.println("========================================");
			
			int num = input.nextInt();
			
			if (num == 1) 
				bookManager.addBook(); //�տ� �ν��Ͻ� bookmanager�� �ٿ��� Ŭ���� ����
			else if (num == 2)
				bookManager.deleteBook();
			else if (num == 3)
				bookManager.edit();
			else if (num == 4)
				bookManager.view();
			else if (num == 5)
				break;
			else
				continue;
		}
	}
}