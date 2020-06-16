package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class BookAdder extends JPanel {
	
	WindowFrame frame;
	
	public BookAdder(WindowFrame frame) {
		this.frame = frame;
		
		JPanel panel = new JPanel(new SpringLayout());
		panel.setLayout(new SpringLayout());

		JLabel labelTitle = new JLabel("Title: ", JLabel.TRAILING);
		JTextField fieldTitle = new JTextField(10);
		labelTitle.setLabelFor(fieldTitle);
		panel.add(labelTitle);
		panel.add(fieldTitle);	
	
		JLabel labelCode = new JLabel("Code: ", JLabel.TRAILING);
		JTextField fieldCode = new JTextField(10);
		labelCode.setLabelFor(fieldCode);
		panel.add(labelCode);
		panel.add(fieldCode);

		JLabel labelWriter = new JLabel("Writer: ", JLabel.TRAILING);
		JTextField fieldWriter = new JTextField(10);
		labelWriter.setLabelFor(fieldWriter);
		panel.add(labelWriter);
		panel.add(fieldWriter);	

		JLabel labelManager = new JLabel("Manager: ", JLabel.TRAILING);
		JTextField fieldManager = new JTextField(10);
		labelManager.setLabelFor(fieldManager);
		panel.add(labelManager);
		panel.add(fieldManager);	
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));	
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);

		this.add(panel);
		this.setVisible(true);
	}
}
