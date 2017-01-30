package grid.view;

import javax.swing.*;
import grid.controller.GridController;

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
	
	public GridPanel(GridController baseController)
	{
		super();
		this.baseController = baseController;
		
		
		
	}
	
	private void setupPanel()
	{
		this.add(rowField);
		this.add(columnField);
		this.add(inputField);
		this.add(rowLabel);
		this.add(columnLabel);
		this.add(submitButton);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
