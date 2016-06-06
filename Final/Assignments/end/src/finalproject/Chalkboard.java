package finalproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;



//import java.awt.Canvas;

public class Chalkboard {

	/*private int mouseX, mouseY;
	private boolean mouseClicked;
	//private int mouseButton;
	
	*/
	
	
	
	private questions qs;
	
	public Chalkboard(){
	
		qs = new questions();
		
		/*mouseClicked = false;
		mouseX = mouseY = 0;
		//mouseButton = 0;
		addMouseListener(this);*/
				
	}
	
	public Chalkboard(int p){
		qs = new questions(p);
	}
	
	/*public void mouseClicked(MouseEvent e){
		mouseClicked = true;
		mouseX = e.getX();
		mouseY = e.getY();
		//mouseButton = e.getButton();

	}*/
	
	public void draw(Graphics window){
		
		//board
		window.setColor(Color.BLACK);
		window.fillRect(0, 0, 800, 400);
		window.setColor(Color.green);
		window.fillRect(10, 10, 780, 360);
		
		//option 1
		Rectangle first = new Rectangle(100, 250, 200, 50, Color.RED);
		first.draw(window);
		//window.setColor(Color.RED);
		//window.fillRect(100, 250, 200, 50);
		window.setColor(Color.white);
		window.setFont(new Font("TAHOMA", Font.BOLD, 20));
		window.drawString(qs.getAnswerOne(), 125, 275);
		
		//option 2
		Rectangle second = new Rectangle(100, 310, 200, 50, Color.BLUE);
		second.draw(window);
		//window.setColor(Color.BLUE);
		//window.fillRect(100, 310, 200, 50);
		window.setColor(Color.white);
		window.setFont(new Font("TAHOMA", Font.BOLD, 20));
		window.drawString(qs.getAnswerTwo(), 125, 345);
		
		//option 3
		Rectangle third = new Rectangle(500, 250, 200, 50, Color.MAGENTA);
		third.draw(window);
		//window.setColor(Color.MAGENTA);
		//window.fillRect(500, 250, 200, 50);
		window.setColor(Color.white);
		window.setFont(new Font("TAHOMA", Font.BOLD, 20));
		window.drawString(qs.getAnswerThree(), 525, 275);
		
		//option 4
		Rectangle fourth = new Rectangle(500, 310, 200, 50, Color.ORANGE);
		fourth.draw(window);
		//window.setColor(Color.ORANGE);
		//window.fillRect(500, 310, 200, 50);
		window.setColor(Color.white);
		window.setFont(new Font("TAHOMA", Font.BOLD, 20));
		window.drawString(qs.getAnswerFour(), 525, 345);
		
		
		
		//question
		window.setFont(new Font("TAHOMA", Font.BOLD, 20));
		window.drawString(qs.getQuestion(), 50, 100);
		
	}
	
	public int getPos(){
		return qs.getPosition();
	}
		
		/*if(qs.getPosition()%4==1){
		
			if(mouseClicked && mouseX>=100 && mouseX<=300 && mouseY>=250 &&mouseY<=300 ){
				window.setColor(Color.BLACK);
				window.fillRect(0, 0, 800, 400);
				window.setColor(Color.green);
				window.fillRect(10, 10, 780, 360);
				window.setColor(Color.white);
				window.setFont(new Font("TAHOMA", Font.BOLD, 20));
				window.drawString("CORRECT", 400, 200);
				mouseClicked = false;
			}
			
			if(mouseClicked && mouseX>=100 && mouseX<=300 && mouseY>=310 &&mouseY<=360 ){
				window.setColor(Color.BLACK);
				window.fillRect(0, 0, 800, 400);
				window.setColor(Color.green);
				window.fillRect(10, 10, 780, 360);
				window.setColor(Color.white);
				window.setFont(new Font("TAHOMA", Font.BOLD, 20));
				window.drawString("INCORRECT", 400, 200);
				mouseClicked = false;
			}
			
			if(mouseClicked && mouseX>=500 && mouseX<=700 && mouseY>=250 &&mouseY<=300 ){
				window.setColor(Color.BLACK);
				window.fillRect(0, 0, 800, 400);
				window.setColor(Color.green);
				window.fillRect(10, 10, 780, 360);
				window.setColor(Color.white);
				window.setFont(new Font("TAHOMA", Font.BOLD, 20));
				window.drawString("INCORRECT", 400, 200);
				mouseClicked = false;
			}
	
			if(mouseClicked && mouseX>=500 && mouseX<=700 && mouseY>=310 &&mouseY<=360 ){
				window.setColor(Color.BLACK);
				window.fillRect(0, 0, 800, 400);
				window.setColor(Color.green);
				window.fillRect(10, 10, 780, 360);
				window.setColor(Color.white);
				window.setFont(new Font("TAHOMA", Font.BOLD, 20));
				window.drawString("INCORRECT", 400, 200);
				mouseClicked = false;
			}
			
		}
			
		if(qs.getPosition()%4==2){
				
			if(mouseClicked && mouseX>=100 && mouseX<=300 && mouseY>=250 &&mouseY<=300 ){
				window.setColor(Color.BLACK);
				window.fillRect(0, 0, 800, 400);
				window.setColor(Color.green);
				window.fillRect(10, 10, 780, 360);
				window.setColor(Color.white);
				window.setFont(new Font("TAHOMA", Font.BOLD, 20));
				window.drawString("INCORRECT", 400, 200);
				mouseClicked = false;
			}
				
			if(mouseClicked && mouseX>=100 && mouseX<=300 && mouseY>=310 &&mouseY<=360 ){
				window.setColor(Color.BLACK);
				window.fillRect(0, 0, 800, 400);
				window.setColor(Color.green);
				window.fillRect(10, 10, 780, 360);
				window.setColor(Color.white);
				window.setFont(new Font("TAHOMA", Font.BOLD, 20));
				window.drawString("CORRECT", 400, 200);
				mouseClicked = false;
			}
				
			if(mouseClicked && mouseX>=500 && mouseX<=700 && mouseY>=250 &&mouseY<=300 ){
				window.setColor(Color.BLACK);
				window.fillRect(0, 0, 800, 400);
				window.setColor(Color.green);
				window.fillRect(10, 10, 780, 360);
				window.setColor(Color.white);					
				window.setFont(new Font("TAHOMA", Font.BOLD, 20));
				window.drawString("INCORRECT", 400, 200);
				mouseClicked = false;
			}
		
			if(mouseClicked && mouseX>=500 && mouseX<=700 && mouseY>=310 &&mouseY<=360 ){
				window.setColor(Color.BLACK);
				window.fillRect(0, 0, 800, 400);
				window.setColor(Color.green);
				window.fillRect(10, 10, 780, 360);
				window.setColor(Color.white);
				window.setFont(new Font("TAHOMA", Font.BOLD, 20));
				window.drawString("INCORRECT", 400, 200);
				mouseClicked = false;
			}
		}

		if(qs.getPosition()%4==3){
			
			if(mouseClicked && mouseX>=100 && mouseX<=300 && mouseY>=250 &&mouseY<=300 ){
				window.setColor(Color.BLACK);
				window.fillRect(0, 0, 800, 400);
				window.setColor(Color.green);
				window.fillRect(10, 10, 780, 360);
				window.setColor(Color.white);
				window.setFont(new Font("TAHOMA", Font.BOLD, 20));
				window.drawString("INCORRECT", 400, 200);
				mouseClicked = false;
			}
				
			if(mouseClicked && mouseX>=100 && mouseX<=300 && mouseY>=310 &&mouseY<=360 ){
				window.setColor(Color.BLACK);
				window.fillRect(0, 0, 800, 400);
				window.setColor(Color.green);
				window.fillRect(10, 10, 780, 360);
				window.setColor(Color.white);
				window.setFont(new Font("TAHOMA", Font.BOLD, 20));
				window.drawString("INCORRECT", 400, 200);
				mouseClicked = false;
			}
				
			if(mouseClicked && mouseX>=500 && mouseX<=700 && mouseY>=250 &&mouseY<=300 ){
				window.setColor(Color.BLACK);
				window.fillRect(0, 0, 800, 400);
				window.setColor(Color.green);
				window.fillRect(10, 10, 780, 360);
				window.setColor(Color.white);					
				window.setFont(new Font("TAHOMA", Font.BOLD, 20));
				window.drawString("CORRECT", 400, 200);
				mouseClicked = false;
			}
		
			if(mouseClicked && mouseX>=500 && mouseX<=700 && mouseY>=310 &&mouseY<=360 ){
				window.setColor(Color.BLACK);
				window.fillRect(0, 0, 800, 400);
				window.setColor(Color.green);
				window.fillRect(10, 10, 780, 360);
				window.setColor(Color.white);
				window.setFont(new Font("TAHOMA", Font.BOLD, 20));
				window.drawString("INCORRECT", 400, 200);
				mouseClicked = false;
			}
		}
		
		if(qs.getPosition()%4==0){
			
			if(mouseClicked && mouseX>=100 && mouseX<=300 && mouseY>=250 &&mouseY<=300 ){
				window.setColor(Color.BLACK);
				window.fillRect(0, 0, 800, 400);
				window.setColor(Color.green);
				window.fillRect(10, 10, 780, 360);
				window.setColor(Color.white);
				window.setFont(new Font("TAHOMA", Font.BOLD, 20));
				window.drawString("INCORRECT", 400, 200);
				mouseClicked = false;
			}
				
			if(mouseClicked && mouseX>=100 && mouseX<=300 && mouseY>=310 &&mouseY<=360 ){
				window.setColor(Color.BLACK);
				window.fillRect(0, 0, 800, 400);
				window.setColor(Color.green);
				window.fillRect(10, 10, 780, 360);
				window.setColor(Color.white);
				window.setFont(new Font("TAHOMA", Font.BOLD, 20));
				window.drawString("INCORRECT", 400, 200);
				mouseClicked = false;
			}
				
			if(mouseClicked && mouseX>=500 && mouseX<=700 && mouseY>=250 &&mouseY<=300 ){
				window.setColor(Color.BLACK);
				window.fillRect(0, 0, 800, 400);
				window.setColor(Color.green);
				window.fillRect(10, 10, 780, 360);
				window.setColor(Color.white);					
				window.setFont(new Font("TAHOMA", Font.BOLD, 20));
				window.drawString("INCORRECT", 400, 200);
				mouseClicked = false;
			}
		
			if(mouseClicked && mouseX>=500 && mouseX<=700 && mouseY>=310 &&mouseY<=360 ){
				window.setColor(Color.BLACK);
				window.fillRect(0, 0, 800, 400);
				window.setColor(Color.green);
				window.fillRect(10, 10, 780, 360);
				window.setColor(Color.white);
				window.setFont(new Font("TAHOMA", Font.BOLD, 20));
				window.drawString("CORRECT", 400, 200);
				mouseClicked = false;
			}
		}
		
	}
	
	public void mouseEntered(MouseEvent e) {
		mouseX = e.getX();
	}
	public void mouseExited(MouseEvent e) { }
	public void mousePressed(MouseEvent e) { }
	public void mouseReleased(MouseEvent e) { }*/
}
