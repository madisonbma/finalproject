package finalproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class TitleSlide {

	public void draw(Graphics window){
		window.setColor(Color.BLACK);
		window.fillRect(0, 0, 800, 400);
		window.setColor(Color.green);
		window.fillRect(10, 10, 780, 360);
		window.setColor(Color.white);
		window.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 30));
		window.drawString("ARE YOU SMARTER THAN A FIFTH GRADER?", 50, 50);
		window.drawString("Madison Ma", 325, 100);
		window.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 20));
		window.drawString("You'll be given 10 questions. Click on the answer that best fits the question.", 50, 150);
		window.drawString("Your final score will be tallied at the end.", 50, 200);		
		window.drawString("Press space to continue.", 300, 300);

	}
	
	
}
