package grid.controller;

import javax.swing.JOptionPane;
import grid.view.GridFrame;

public class GridController 
{
	private GridFrame appFrame;
	
	public GridController()
	{
		//Create Model Objects Here!
		
		appFrame = new GridFrame(this);
	}
	public void start()
	{
		JOptionPane.showMessageDialog(appFrame, "Hey look, it's my 2D creation." );
	}
}
