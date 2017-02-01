package grid.view;

import javax.swing.JFrame;
import grid.controller.GridController;
import java.awt.Dimension;

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
		this.setSize(new Dimension(700,700));
		this.setVisible(true);
	}

	public GridController getBaseController() 
	{
		return baseController;
	}

	public void setBaseController(GridController baseController) 
	{
		this.baseController = baseController;
	}

	public GridPanel getAppPanel() 
	{
		return appPanel;
	}

	public void setAppPanel(GridPanel appPanel) 
	{
		this.appPanel = appPanel;
	}

}
