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
		baseLayout.putConstraint(SpringLayout.NORTH, gridPane, 0, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, gridPane, 10, SpringLayout.WEST, columnField);
		baseLayout.putConstraint(SpringLayout.SOUTH, gridPane, 120, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, gridPane, 4, SpringLayout.EAST, this);
		gridPane.setViewportView(gridTable);
		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setMinimumSize(new Dimension(700,700));
		this.setBackground(Color.CYAN);
		this.add(gridPane);
		this.add(columnField);
	}
	
	private void setupLayout()
	{
		
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
