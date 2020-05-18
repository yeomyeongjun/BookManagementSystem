package Book;

import java.util.Scanner;

public interface BookInput {
	public void getUserInput(Scanner input);
	
	public int getCode();

	public void setCode(int code);
	
	public String getTitle();
	
	public void setTitle(String title);
	
	public void printInfo();
	
	public void setBookCode(BookInput book, Scanner input);
}
