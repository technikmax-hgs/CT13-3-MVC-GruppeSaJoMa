package gui;


import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import gui.view_schedulerv1;

import java.awt.Event;

public class controller {
	private model model;
	private view_schedulerv1 view;
	
	public controller (model m, view_schedulerv1 v) {
		this.model = m;
		this.view = v;
		initView();
	}
	public void initView() {
		view.getTable().setModel(this.model);
	}
	public void initController() {
		view.get_Append().addActionListener(e -> appendEmptyRow(e));
		view.get_Delete().addActionListener(e -> deleteRow(e));
		view.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
			
			}
		});
	}
	
	private void appendEmptyRow(ActionEvent e) {
		// TODO Auto-generated method stub
		this.model.appendEmptyRow();
		int row = view.getTable().getRowCount();
		view.getTable().setRowSelectionInterval(row-1, row-1);
		view.getTable().editCellAt(row-1, 0);
		view.getTable().setSurrendersFocusOnKeystroke(true);
		view.getTable().getEditorComponent().requestFocus();
	}

	private void deleteRow(ActionEvent e) {
		int row = view.getTable().getSelectedRow();
		this.model.deleteRow(row);
	}

}