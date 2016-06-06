package finalproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Rectangle {

	private int xPos;
	private int yPos;
	private int wid;
	private int ht;
	private Color color;
	
	public Rectangle(int x, int y, int w, int h, Color c){
		xPos = x;
		yPos = y;
		wid = w;
		ht = h;
		color = c;
	}
	
	public void draw(Graphics window){
		window.setColor(color);
		window.fillRect(xPos, yPos, wid, ht);
		
	}
}
