package game_of_life;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gameboard extends JFrame implements ActionListener
{

	//Attributes
	private int rows = 100, cols=100;
	private JPanel board = new JPanel(new GridLayout(rows, cols));
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		JFrame.setDefaultLookAndFeelDecorated(true);
		//Create array of cells, which is the gameboard
		Cell[][] multi = new Cell[100][100];
		
		
		//pause so I can see what it looks like
		try {
		    Thread.sleep(4000);                 //1000 milliseconds is one second.
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
