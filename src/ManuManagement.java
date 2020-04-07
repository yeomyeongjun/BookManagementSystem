import java.util.Scanner;

public class ManuManagement { 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		BookManager bookManager = new BookManager(input); //ManuManagement에서 BookManager를 관리한다고 생각

		while (true) {
			System.out.println("========================================");
			System.out.println("***BOOK MANAGEMENT PROGRAM***");
			System.out.println("----------------------------------------");
			System.out.println("1. Borrow Books"); // 도서 대출
			System.out.println("2. Return Books"); // 도서 반납
			System.out.println("3. Extension of The Borrow Period"); // 대출 기간 연장
			System.out.println("4. Book Search"); // 도서 검색
			System.out.println("5. Exit"); // 나가기
			System.out.println("----------------------------------------");
			System.out.println("Please select one number between 1 - 5");
			System.out.println("========================================");
			
			int num = input.nextInt();
			
			if (num == 1) 
				bookManager.borrowBook(); //앞에 인스턴스 bookmanager를 붙여서 클래스 연동
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