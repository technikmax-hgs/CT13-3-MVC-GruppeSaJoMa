package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class view_schedulerv1 extends JFrame {



private JPanel contentPane;
private JTable table;
private JPanel panel;
private JButton btnNewButton;
private JButton btnNewButton_1;
private JButton btnNewButton_2;
private JButton btnNewButton_3;
private JPanel panel_1;
private JButton btnNewButton_4;
private JPanel panel_2;
private JTextArea textArea;

public view_schedulerv1() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 600, 220);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(new BorderLayout(0, 0));
	
	panel = new JPanel();
	panel.setLayout(new BorderLayout(0,0));
	contentPane.add(panel, BorderLayout.WEST);
	
	table = new JTable();
	panel.add(table, BorderLayout.WEST);
	
	panel_1 = new JPanel();
	panel.add(panel_1, BorderLayout.SOUTH);
	panel_1.setLayout(new GridLayout(1, 2, 0, 0));
	
	btnNewButton_2 = new JButton("Start");
	panel_1.add(btnNewButton_2);
	
	btnNewButton_3 = new JButton("Delete");
	btnNewButton_3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	panel_1.add(btnNewButton_3);
	
	btnNewButton_4 = new JButton("Add");
	panel_1.add(btnNewButton_4);
	
	panel_2 = new JPanel();
	contentPane.add(panel_2, BorderLayout.CENTER);
	
	textArea = new JTextArea();
	panel_2.add(textArea);
	

}
public JButton get_Append() {
	return btnNewButton_2;
}
public JButton get_Delete() {
	return btnNewButton_3;
}
public JTable getTable(){
	return table;
}
}
