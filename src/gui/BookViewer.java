package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BookViewer extends JPanel {
	
	WindowFrame frame;
	
	public BookViewer(WindowFrame frame) {
		this.frame = frame;
		DefaultTableModel model = new DefaultTableModel();
		
		model.addColumn("Title");
		model.addColumn("Writer");
		model.addColumn("Code");
		model.addColumn("Manager");		
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);

	}
}
