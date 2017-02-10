package grid.view;

import javax.swing.*;
import grid.model.Computer;
import grid.controller.GridController;
import javax.swing.table.*;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridPanel extends JPanel 
{
	private JTextField rowField;
	private JTextField columnField;
	private JTextField inputField;
	private JLabel rowLabel;
	private JLabel columnLabel;
	private JLabel title;
	private JLabel change;
	private JButton submitButton;
	private SpringLayout baseLayout;
	private GridController baseController;
	
	private JTable gridTable;
	private JScrollPane gridPane;
	
	public GridPanel(GridController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.columnField = new JTextField(5);
		this.rowLabel = new JLabel("Row: ");
		this.columnLabel = new JLabel("Column: ");
		this.title = new JLabel("2D Project!");
		this.change = new JLabel("Change Value: ");
		this.rowField = new JTextField(5);
		this.inputField = new JTextField(5);
		this.submitButton = new JButton("Submit");
		
	setupTable();
	setupPanel();
	setupLayout();
	setupListeners();
		
	}
	
	private void setupTable()
	{
		//Load model
		DefaultTableModel data = new DefaultTableModel(baseController.getGrid(), new String []{"one","two","three","four","five"});
		gridTable = new JTable();
		gridTable.setModel(data);
		gridPane = new JScrollPane();
		gridPane.setViewportView(gridTable);
		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setMinimumSize(new Dimension(700,700));
		this.setBackground(Color.CYAN);
		this.add(gridPane);
		this.add(rowField);
		this.add(rowLabel);
		this.add(title);
		this.add(change);
		this.add(columnLabel);
		this.add(inputField);
		this.add(columnField);
		this.add(submitButton);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, rowField, 130, SpringLayout.SOUTH, title);
		baseLayout.putConstraint(SpringLayout.NORTH, rowLabel, 5, SpringLayout.NORTH, rowField);
		baseLayout.putConstraint(SpringLayout.NORTH, columnField, 6, SpringLayout.SOUTH, rowField);
		baseLayout.putConstraint(SpringLayout.EAST, rowField, 0, SpringLayout.EAST, inputField);
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 125, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, columnField, 0, SpringLayout.EAST, inputField);
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, -5, SpringLayout.NORTH, change);
		baseLayout.putConstraint(SpringLayout.NORTH, title, 1, SpringLayout.NORTH, gridPane);
		baseLayout.putConstraint(SpringLayout.EAST, title, -49, SpringLayout.WEST, gridPane);
		baseLayout.putConstraint(SpringLayout.EAST, rowLabel, 0, SpringLayout.EAST, change);
		baseLayout.putConstraint(SpringLayout.NORTH, change, 21, SpringLayout.SOUTH, columnLabel);
		baseLayout.putConstraint(SpringLayout.EAST, columnLabel, 0, SpringLayout.EAST, change);
		baseLayout.putConstraint(SpringLayout.WEST, change, 23, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, columnLabel, 5, SpringLayout.NORTH, columnField);
		baseLayout.putConstraint(SpringLayout.NORTH, gridPane, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, gridPane, 230, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, gridPane, -33, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, gridPane, -28, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 9, SpringLayout.SOUTH, inputField);
		baseLayout.putConstraint(SpringLayout.EAST, submitButton, 0, SpringLayout.EAST, rowField);
	}
	
	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String input = inputField.getText();
				int row = Integer.parseInt(rowField.getText());
				int col = Integer.parseInt(columnField.getText());
				baseController.getGrid()[row][col] = new Computer(input);
				// grid[row][col] = new Computer(input);
				
				
				
			}
		});
		
	}

	public JTextField getRowField() {
		return rowField;
	}

	public void setRowField(JTextField rowField) {
		this.rowField = rowField;
	}

	public JTextField getColumnField() {
		return columnField;
	}

	public void setColumnField(JTextField columnField) {
		this.columnField = columnField;
	}

	public JTextField getInputField() {
		return inputField;
	}

	public void setInputField(JTextField inputField) {
		this.inputField = inputField;
	}

	public JLabel getRowLabel() {
		return rowLabel;
	}

	public void setRowLabel(JLabel rowLabel) {
		this.rowLabel = rowLabel;
	}

	public JLabel getColumnLabel() {
		return columnLabel;
	}

	public void setColumnLabel(JLabel columnLabel) {
		this.columnLabel = columnLabel;
	}

	public JButton getSubmitButton() {
		return submitButton;
	}

	public void setSubmitButton(JButton submitButton) {
		this.submitButton = submitButton;
	}

	public SpringLayout getBaseLayout() {
		return baseLayout;
	}

	public void setBaseLayout(SpringLayout baseLayout) {
		this.baseLayout = baseLayout;
	}

	public GridController getBaseController() {
		return baseController;
	}

	public void setBaseController(GridController baseController) {
		this.baseController = baseController;
	}
}
