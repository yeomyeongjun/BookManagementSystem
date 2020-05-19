package Book;

import java.util.Scanner;

import Exception.CodeFormatException;

public interface BookInput {
	public void getUserInput(Scanner input);
	
	public int getCode();

	public void setCode(int code) throws CodeFormatException;
	
	public String getTitle();
	
	public void setTitle(String title);
	
	public String getManager();
	
	public void setManager(String manager);
	
	public void printInfo();
	
	public void setBookCode(BookInput book, Scanner input);
}
