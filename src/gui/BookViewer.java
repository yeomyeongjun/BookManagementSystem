package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Book.BookInput;
import manager.BookManager;

public class BookViewer extends JPanel {
	
	WindowFrame frame;
	
	BookManager bookManager;
	
	public BookViewer(WindowFrame frame, BookManager bookManager) {
		this.frame = frame;
		this.bookManager = bookManager;
	
		System.out.println(bookManager.size());
		
		
		DefaultTableModel model = new DefaultTableModel();
		
		model.addColumn("Title");
		model.addColumn("Writer");
		model.addColumn("Code");
		model.addColumn("Manager");		
		
		for (int i = 0; i < bookManager.size(); i++) {
			Vector row = new Vector();
			BookInput bi = bookManager.get(i);
			row.add(bi.getCode());
			row.add(bi.getTitle());
			row.add(bi.getWriter());
			row.add(bi.getManager());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		//this.add(sp);

	}
}
