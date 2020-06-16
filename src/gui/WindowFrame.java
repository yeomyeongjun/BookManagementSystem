package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.BookManager;

public class WindowFrame extends JFrame{
	
	ManuSelection menuselection;
	BookAdder bookadder;
	BookViewer bookviewer;
	BookManager bookManager;

	public WindowFrame(BookManager bookManager) {
		
		this.bookManager = bookManager;
		menuselection = new ManuSelection(this);
		bookadder = new BookAdder(this);
		bookviewer = new BookViewer(this, this.bookManager);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setupPanel(menuselection);		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public ManuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(ManuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public BookAdder getBookadder() {
		return bookadder;
	}

	public void setBookadder(BookAdder bookadder) {
		this.bookadder = bookadder;
	}

	public BookViewer getBookviewer() {
		return bookviewer;
	}

	public void setBookviewer(BookViewer bookviewer) {
		this.bookviewer = bookviewer;
	}
}
