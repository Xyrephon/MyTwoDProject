package grid.controller;

import javax.swing.JOptionPane;
import grid.view.GridFrame;
import grid.model.Computer;

public class GridController 
{
	private GridFrame appFrame;
	private Computer [][] grid;
	
	public GridController()
	{
		//Create Model Objects Here!
		
		grid = new Computer [6][5];
		fillGrid();
		appFrame = new GridFrame(this);
	}
	
	private void fillGrid()
	{
		for (int row = 0; row < grid.length; row++)
		{
			for (int col = 0; col < grid[0].length; col ++)
			{
				grid[row][col] = new Computer();
			}
		}
	}
	public void start()
	{
		JOptionPane.showMessageDialog(appFrame, "Hey look, it's my 2D creation." );
	}
	
	public GridFrame getFrame() {
		return appFrame;
	}
	public void setFrame(GridFrame appFrame) {
		this.appFrame = appFrame;
	}
	public Computer[][] getGrid() {
		return grid;
	}
	public void setGrid(Computer[][] grid) {
		this.grid = grid;
	}
	
}
