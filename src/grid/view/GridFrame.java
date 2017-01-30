package grid.view;

import javax.swing.JFrame;
import grid.controller.GridController;

public class GridFrame extends JFrame 
{
	private GridController baseController;
	private GridPanel appPanel;
	
	public GridFrame(GridController baseController)
	{
		this.baseController = baseController;
		appPanel = new GridPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("2D Project");
		this.setVisible(true);
	}

}
