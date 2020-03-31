import java.util.Scanner;

public class ManuManagement {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
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
		int id = input.nextInt(); // 대출자 정보를 확인하기 위해 학번(학생증 ID)을 입력받음
		
		System.out.print("Enter Book Code that you want to borrow:");
		int code = input.nextInt(); // 대출할 책 코드 입력
		
		String buf = input.nextLine(); //엔터키 오작동으로 인한 에러 보완
	}
	
	public static void returnBook() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Book Code that you want to return:");
		int code = input.nextInt(); // 반납할 책 코드 입력
		
		String buf = input.nextLine(); //엔터키 오작동으로 인한 에러 보완
	}
	
	public static void extend() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Your Student ID:");
		int id = input.nextInt(); // 대출자 정보를 확인하기 위해 학번(학생증 ID)을 입력받음
		
		System.out.print("Enter Book Code that you want to extend borrowing period:");
		int code = input.nextInt(); // 대출기간을 연장할 책 코드 입력
		
		System.out.print("How long period you want to extend?");
		while (true) {
			int day = input.nextInt(); // 연장하고 싶은 기간 입력(예: 7일)
			if (day >= 0 && day <= 7)
				break;
		}
		
		String buf = input.nextLine(); //엔터키 오작동으로 인한 에러 보완
	}
	
	public static void search() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Book Title that you want to borrow:"); //검색할 책 제목 입력
		String title = input.nextLine();
	}
}