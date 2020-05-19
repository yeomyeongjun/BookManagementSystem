package Book;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HorrorBook extends Book {
	protected int restrict;

	public HorrorBook(BookKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		
		super.getUserInput(input);
		
		while (true) {
			System.out.println("Is there an age limit for this book? (Y / N)"); //연령제한 있는지 확인
			String kind = input.next();
			

			if (kind.equals("Y") || kind.equals("y")) {
		
				try {
					System.out.print("Enter Age restrictions for this HorrorBook:");
					restrict = input.nextInt();		
					break;
				}
				
				catch (InputMismatchException e) {
					System.out.println("Error! Entered data is not accurate.");
					input.nextLine();
				}
			}
				
			else if (kind.equals("N") || kind.equals("n")) {
				restrict = 0;
				System.out.println("This book will be entered with the full age value.");
				break;
			}
				
			else
				System.out.println("Error! Please Enter Y or N");
		}
	}
	
	public void printInfo() {
		String bkind = getKindString();
		System.out.println("-----------------------------");
		System.out.println("Kind: " + bkind);
		System.out.println("Title: " + title);
		System.out.println("Writer: " + writer);
		System.out.println("Code: " + code);
		switch(restrict) {
		case 0:
			System.out.println("Age restrictions: Available for all ages");
			break;
		default:
			System.out.println("Age restrictions: " + restrict);
			break;
		}
		
		System.out.println("Manager's name: " + manager);
		System.out.println();
	}	
}