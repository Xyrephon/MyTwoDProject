package grid.view;

import javax.swing.*;
import grid.controller.GridController;
import javax.swing.table.*;
import java.awt.Dimension;
import java.awt.Color;

public class GridPanel extends JPanel 
{
	private JTextField rowField;
	private JTextField columnField;
	private JTextField inputField;
	private JLabel rowLabel;
	private JLabel columnLabel;
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
		this.rowField = new JTextField(5);
		this.inputField = new JTextField(5);
		
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
		this.add(columnLabel);
		this.add(inputField);
		add(columnField);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, gridPane, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, gridPane, 230, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, gridPane, -33, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, gridPane, -28, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, columnField, 191, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, rowLabel, 162, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, columnLabel, 196, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, columnLabel, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, rowField, -117, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, columnField, 0, SpringLayout.WEST, rowField);
		baseLayout.putConstraint(SpringLayout.WEST, rowField, 69, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, rowLabel, -6, SpringLayout.WEST, rowField);
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, 6, SpringLayout.SOUTH, columnField);
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 0, SpringLayout.WEST, rowField);
	}
	
	private void setupListeners()
	{
		
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
