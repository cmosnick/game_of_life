package game_of_life;

import javax.swing.JFrame;

public class Game_of_life extends JFrame
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Create array of cells, which is the gameboard
		Cell[][] multi = new Cell[100][100];
		
		
	}

}


class Cell 
{
	//atrributes
	Boolean alive = new Boolean(false);
	
	
	//Methods
	public String kill()
	{
		
		return "clear";
	}
	
	public String spawn()
	{
		
		return "blue";
	}
	
}
