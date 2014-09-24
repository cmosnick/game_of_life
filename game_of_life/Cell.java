package game_of_life;

import javax.swing.JPanel;


public class Cell extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//atrributes
	Boolean alive = new Boolean(false);
	Boolean visible = new Boolean(false);
	
	
	//Constructors
	public Cell(Boolean start_alive)  //init as specified
	{
		initCell(start_alive);
	}
	public Cell() //init as default: dead
	{
			initCell(false);
	}
	
	
	//Methods
	public void kill()
	{
		this.alive = false;
		this.visible = false;
	}
	
	public void spawn()
	{
		this.alive = true;
		this.visible = true;
	}
	
	private void initCell(Boolean is_alive)
	{
		//init alive
		this.alive = is_alive;
		//init color
		if(this.alive);
		else ;
	}
}
