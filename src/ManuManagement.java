import java.util.Scanner;

public class ManuManagement { 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BookManager bookManager = new BookManager(input); 

		int kind = -1;
		
		while (true) {

			showMenu();
			
			kind = input.nextInt();
			
			switch(kind) {
			case 1:
				bookManager.addBook();
				break;
			case 2:
				bookManager.deleteBook();
				break;
			case 3:
				bookManager.edit();
				break;
			case 4:
				bookManager.view();
				break;
			
			default:
				continue;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("***BOOK MANAGEMENT PROGRAM***");
		System.out.println();
		System.out.println("1. Add Book"); // 도서 대출
		System.out.println("2. Delete Book"); // 도서 반납
		System.out.println("3. Edit Book Information"); // 도서 정보 수정
		System.out.println("4. View All Books"); // 도서 검색
		System.out.println("5. Exit"); // 나가기
		System.out.println();
		System.out.println("Please select one number between 1 - 5");
	}
}