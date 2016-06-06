//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package finalproject; 

import javax.swing.JButton;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class GraphicsRunner extends JFrame 
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 400;


	
	public GraphicsRunner()
	{
		super("ARE YOU SMARTER THAN A FIFTH GRADER");

		setSize(WIDTH,HEIGHT);

		//calls image
		getContentPane().add(new ChalkboardPanel());
		
		setVisible(true);
		
		
		
		
	}

	public static void main( String args[] )
	{
		GraphicsRunner run = new GraphicsRunner();
	}

	
	

}