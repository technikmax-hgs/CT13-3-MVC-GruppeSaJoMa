package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;

public class view extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JPanel panel_1;
	private JButton btnNewButton_4;

	public view() {
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
		
		btnNewButton_2 = new JButton("Append");
		panel_1.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Delete");
		panel_1.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Add");
		panel_1.add(btnNewButton_4);
		
	
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

	
