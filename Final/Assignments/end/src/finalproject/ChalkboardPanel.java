package finalproject;

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;

public class ChalkboardPanel extends JPanel {

	private TitleSlide ts;
	private Chalkboard cb;
	private int mouseX, mouseY;
	//private boolean mouseClicked;
	private int mouseButton;
	private int total;
	private int correct;
	private Timer timer;
	String output = "";

		public ChalkboardPanel(){
			
			setBackground(Color.WHITE);
			ts = new TitleSlide();
			cb = new Chalkboard();
			setVisible(true);
			
			
			
			//mouseClicked = false;
			mouseX = mouseY = 0;
			mouseButton = 0;
			
			
			addMouseListener(new MouseClickHandler());
			
		}
		
		
		private class MouseClickHandler extends MouseAdapter implements MouseListener {

			public void mouseClicked(MouseEvent e){
			//	mouseClicked = true;
				mouseX = e.getX();
				mouseY = e.getY();
				mouseButton = e.getButton();
				
				System.out.print("clicked");
				output = "correct";
				if(cb.getPos()%4==0){
								
								if( mouseX>=100 && mouseX<300 && mouseY>=250 &&mouseY<300){
									output = "CORRECT";
								
									correct++;
									total++;
								}
								
								else if( mouseX>=100 && mouseX<=300 && mouseY>=310 &&mouseY<=360){
									output = "INCORRECT";
									total++;

								}
								
								else if( mouseX>=500 && mouseX<=700 && mouseY>=250 &&mouseY<=300 ){
									output = "INCORRECT";
									total++;

								}
						
								else if( mouseX>=500 && mouseX<=700 && mouseY>=310 &&mouseY<=360 ){
									output = "INCORRECT";
									total++;

								}
								
							}
				else if(cb.getPos()%4==3){
					
					if( mouseX>=100 && mouseX<=300 && mouseY>=250 &&mouseY<=300 ){
						output = "INCORRECT";
						total++;

					}
						
					else if( mouseX>=100 && mouseX<=300 && mouseY>=310 &&mouseY<=360 ){
						output = "CORRECT";
						correct++;
						total++;
					}
						
					else if( mouseX>=500 && mouseX<=700 && mouseY>=250 &&mouseY<=300 ){
						output = "INCORRECT";
						total++;
					}
				
					else if( mouseX>=500 && mouseX<=700 && mouseY>=310 &&mouseY<=360 ){
						output = "INCORRECT";
						total++;
					}
				}
				
				else if(cb.getPos()%4==2){
					
					if( mouseX>=100 && mouseX<=300 && mouseY>=250 &&mouseY<=300 ){
						output = "INCORRECT";
						total++;
						

					}
						
					else if( mouseX>=100 && mouseX<=300 && mouseY>=310 &&mouseY<=360 ){
						output = "INCORRECT";
						total++;
					}
						
					else if( mouseX>=500 && mouseX<=700 && mouseY>=250 &&mouseY<=300 ){
						output = "CORRECT";
						total++;
						correct++;
					}
				
					else if( mouseX>=500 && mouseX<=700 && mouseY>=310 &&mouseY<=360 ){
						output = "INCORRECT";
						total++;
					}
				}
				
				else if(cb.getPos()%4==1){
					
					if( mouseX>=100 && mouseX<=300 && mouseY>=250 &&mouseY<=300 ){
						output = "INCORRECT";
						total++;
						

					}
						
					else if( mouseX>=100 && mouseX<=300 && mouseY>=310 &&mouseY<=360 ){
						output = "INCORRECT";
						total++;
					}
						
					else if( mouseX>=500 && mouseX<=700 && mouseY>=250 &&mouseY<=300 ){
						output = "INCORRECT";
						total++;
					}
				
					else if( mouseX>=500 && mouseX<=700 && mouseY>=310 &&mouseY<=360 ){
						output = "CORRECT";
						total++;
						correct++;
					}
				}
					repaint();
					
					if(mouseX>=700 && mouseX<750 && mouseY>=0 && mouseY<50)
						cb = new Chalkboard((int)(Math.random()*22));
					
			}
			
			public void mouseEntered(MouseEvent e) {
				System.out.println(e.getX());
			}
			public void mouseExited(MouseEvent e) { }
			public void mousePressed(MouseEvent e) { }
			public void mouseReleased(MouseEvent e) { }

			
		}

		public void update(Graphics window){
			
			paint(window);
			
		}

		public void paint(Graphics window){
			
		
			cb.draw(window);	
			
			if(cb.getPos()%4==0 && mouseButton==MouseEvent.BUTTON1){
				
				if( mouseX>=100 && mouseX<300 && mouseY>=250 &&mouseY<300){

					window.setColor(Color.BLACK);
					window.fillRect(0, 0, 800, 400);
					window.setColor(Color.green);
					window.fillRect(10, 10, 780, 360);
					window.setColor(Color.white);
					window.setFont(new Font("TAHOMA", Font.BOLD, 20));
					window.drawString(output, 400, 200);
					//next
					Rectangle next = new Rectangle(700, 0, 50, 50, Color.WHITE);
					next.draw(window);
					window.setColor(Color.black);
					window.setFont(new Font("TAHOMA", Font.BOLD, 20));
					window.drawString("NEXT", 700, 25);
					
				}
				
				else if( mouseX>=100 && mouseX<=300 && mouseY>=310 &&mouseY<=360){
					window.setColor(Color.BLACK);
					window.fillRect(0, 0, 800, 400);
					window.setColor(Color.green);
					window.fillRect(10, 10, 780, 360);
					window.setColor(Color.white);
					window.setFont(new Font("TAHOMA", Font.BOLD, 20));
					window.drawString(output, 400, 200);
					//next
					Rectangle next = new Rectangle(700, 0, 50, 50, Color.WHITE);
					next.draw(window);
					window.setColor(Color.black);
					window.setFont(new Font("TAHOMA", Font.BOLD, 20));
					window.drawString("NEXT", 700, 25);
					

				}
				
				else if( mouseX>=500 && mouseX<=700 && mouseY>=250 &&mouseY<=300 ){
					window.setColor(Color.BLACK);
					window.fillRect(0, 0, 800, 400);
					window.setColor(Color.green);
					window.fillRect(10, 10, 780, 360);
					window.setColor(Color.white);
					window.setFont(new Font("TAHOMA", Font.BOLD, 20));
					window.drawString(output, 400, 200);
					//next
					Rectangle next = new Rectangle(700, 0, 50, 50, Color.WHITE);
					next.draw(window);
					window.setColor(Color.black);
					window.setFont(new Font("TAHOMA", Font.BOLD, 20));
					window.drawString("NEXT", 700, 25);
					

				}
		
				else if( mouseX>=500 && mouseX<=700 && mouseY>=310 &&mouseY<=360 ){
					window.setColor(Color.BLACK);
					window.fillRect(0, 0, 800, 400);
					window.setColor(Color.green);
					window.fillRect(10, 10, 780, 360);
					window.setColor(Color.white);
					window.setFont(new Font("TAHOMA", Font.BOLD, 20));
					window.drawString(output, 400, 200);
					//next
					Rectangle next = new Rectangle(700, 0, 50, 50, Color.WHITE);
					next.draw(window);
					window.setColor(Color.black);
					window.setFont(new Font("TAHOMA", Font.BOLD, 20));
					window.drawString("NEXT", 700, 25);
					

				}
				
			}

			else if(cb.getPos()%4==1 && mouseButton==MouseEvent.BUTTON1){
					
				if( mouseX>=100 && mouseX<=300 && mouseY>=250 &&mouseY<=300 ){
					window.setColor(Color.BLACK);
					window.fillRect(0, 0, 800, 400);
					window.setColor(Color.green);
					window.fillRect(10, 10, 780, 360);
					window.setColor(Color.white);
					window.setFont(new Font("TAHOMA", Font.BOLD, 20));
					window.drawString(output, 400, 200);
					//next
					Rectangle next = new Rectangle(700, 0, 50, 50, Color.WHITE);
					next.draw(window);
					window.setColor(Color.black);
					window.setFont(new Font("TAHOMA", Font.BOLD, 20));
					window.drawString("NEXT", 700, 25);
					

				}
					
				else if( mouseX>=100 && mouseX<=300 && mouseY>=310 &&mouseY<=360 ){
					window.setColor(Color.BLACK);
					window.fillRect(0, 0, 800, 400);
					window.setColor(Color.green);
					window.fillRect(10, 10, 780, 360);
					window.setColor(Color.white);
					window.setFont(new Font("TAHOMA", Font.BOLD, 20));
					window.drawString(output, 400, 200);
					//next
					Rectangle next = new Rectangle(700, 0, 50, 50, Color.WHITE);
					next.draw(window);
					window.setColor(Color.black);
					window.setFont(new Font("TAHOMA", Font.BOLD, 20));
					window.drawString("NEXT", 700, 25);
					
				}
					
				else if( mouseX>=500 && mouseX<=700 && mouseY>=250 &&mouseY<=300 ){
					window.setColor(Color.BLACK);
					window.fillRect(0, 0, 800, 400);
					window.setColor(Color.green);
					window.fillRect(10, 10, 780, 360);
					window.setColor(Color.white);					
					window.setFont(new Font("TAHOMA", Font.BOLD, 20));
					window.drawString(output, 400, 200);
					//next
					Rectangle next = new Rectangle(700, 0, 50, 50, Color.WHITE);
					next.draw(window);
					window.setColor(Color.black);
					window.setFont(new Font("TAHOMA", Font.BOLD, 20));
					window.drawString("NEXT", 700, 25);
					
				}
			
				else if( mouseX>=500 && mouseX<=700 && mouseY>=310 &&mouseY<=360 ){
					window.setColor(Color.BLACK);
					window.fillRect(0, 0, 800, 400);
					window.setColor(Color.green);
					window.fillRect(10, 10, 780, 360);
					window.setColor(Color.white);
					window.setFont(new Font("TAHOMA", Font.BOLD, 20));
					window.drawString(output, 400, 200);
					//next
					Rectangle next = new Rectangle(700, 0, 50, 50, Color.WHITE);
					next.draw(window);
					window.setColor(Color.black);
					window.setFont(new Font("TAHOMA", Font.BOLD, 20));
					window.drawString("NEXT", 700, 25);
					
				}
			}

			else if(cb.getPos()%4==2 && mouseButton==MouseEvent.BUTTON1){
				
				if( mouseX>=100 && mouseX<=300 && mouseY>=250 &&mouseY<=300 ){
					window.setColor(Color.BLACK);
					window.fillRect(0, 0, 800, 400);
					window.setColor(Color.green);
					window.fillRect(10, 10, 780, 360);
					window.setColor(Color.white);
					window.setFont(new Font("TAHOMA", Font.BOLD, 20));
					window.drawString(output, 400, 200);
					//next
					Rectangle next = new Rectangle(700, 0, 50, 50, Color.WHITE);
					next.draw(window);
					window.setColor(Color.black);
					window.setFont(new Font("TAHOMA", Font.BOLD, 20));
					window.drawString("NEXT", 700, 25);
				
				}
					
				else if( mouseX>=100 && mouseX<=300 && mouseY>=310 &&mouseY<=360 ){
					window.setColor(Color.BLACK);
					window.fillRect(0, 0, 800, 400);
					window.setColor(Color.green);
					window.fillRect(10, 10, 780, 360);
					window.setColor(Color.white);
					window.setFont(new Font("TAHOMA", Font.BOLD, 20));
					window.drawString(output, 400, 200);
					//next
					Rectangle next = new Rectangle(700, 0, 50, 50, Color.WHITE);
					next.draw(window);
					window.setColor(Color.black);
					window.setFont(new Font("TAHOMA", Font.BOLD, 20));
					window.drawString("NEXT", 700, 25);
					
				}
					
				else if( mouseX>=500 && mouseX<=700 && mouseY>=250 &&mouseY<=300 ){
					window.setColor(Color.BLACK);
					window.fillRect(0, 0, 800, 400);
					window.setColor(Color.green);
					window.fillRect(10, 10, 780, 360);
					window.setColor(Color.white);					
					window.setFont(new Font("TAHOMA", Font.BOLD, 20));
					window.drawString(output, 400, 200);
					//next
					Rectangle next = new Rectangle(700, 0, 50, 50, Color.WHITE);
					next.draw(window);
					window.setColor(Color.black);
					window.setFont(new Font("TAHOMA", Font.BOLD, 20));
					window.drawString("NEXT", 700, 25);
					
				}
			
				else if( mouseX>=500 && mouseX<=700 && mouseY>=310 &&mouseY<=360 ){
					window.setColor(Color.BLACK);
					window.fillRect(0, 0, 800, 400);
					window.setColor(Color.green);
					window.fillRect(10, 10, 780, 360);
					window.setColor(Color.white);
					window.setFont(new Font("TAHOMA", Font.BOLD, 20));
					window.drawString(output, 400, 200);
					//next
					Rectangle next = new Rectangle(700, 0, 50, 50, Color.WHITE);
					next.draw(window);
					window.setColor(Color.black);
					window.setFont(new Font("TAHOMA", Font.BOLD, 20));
					window.drawString("NEXT", 700, 25);
					
				}
			}
			
			else if(cb.getPos()%4==3 && mouseButton==MouseEvent.BUTTON1){
				
				if( mouseX>=100 && mouseX<=300 && mouseY>=250 &&mouseY<=300 ){
					window.setColor(Color.BLACK);
					window.fillRect(0, 0, 800, 400);
					window.setColor(Color.green);
					window.fillRect(10, 10, 780, 360);
					window.setColor(Color.white);
					window.setFont(new Font("TAHOMA", Font.BOLD, 20));
					window.drawString(output, 400, 200);
					//next
					Rectangle next = new Rectangle(700, 0, 50, 50, Color.WHITE);
					next.draw(window);
					window.setColor(Color.black);
					window.setFont(new Font("TAHOMA", Font.BOLD, 20));
					window.drawString("NEXT", 700, 25);
					
				}
					
				else if( mouseX>=100 && mouseX<=300 && mouseY>=310 &&mouseY<=360 ){
					window.setColor(Color.BLACK);
					window.fillRect(0, 0, 800, 400);
					window.setColor(Color.green);
					window.fillRect(10, 10, 780, 360);
					window.setColor(Color.white);
					window.setFont(new Font("TAHOMA", Font.BOLD, 20));
					window.drawString(output, 400, 200);
					//next
					Rectangle next = new Rectangle(700, 0, 50, 50, Color.WHITE);
					next.draw(window);
					window.setColor(Color.black);
					window.setFont(new Font("TAHOMA", Font.BOLD, 20));
					window.drawString("NEXT", 700, 25);
					
				}
					
				else if( mouseX>=500 && mouseX<=700 && mouseY>=250 &&mouseY<=300 ){
					window.setColor(Color.BLACK);
					window.fillRect(0, 0, 800, 400);
					window.setColor(Color.green);
					window.fillRect(10, 10, 780, 360);
					window.setColor(Color.white);					
					window.setFont(new Font("TAHOMA", Font.BOLD, 20));
					window.drawString(output, 400, 200);
					//next
					Rectangle next = new Rectangle(700, 0, 50, 50, Color.WHITE);
					next.draw(window);
					window.setColor(Color.black);
					window.setFont(new Font("TAHOMA", Font.BOLD, 20));
					window.drawString("NEXT", 700, 25);
					
				}
			
				else if( mouseX>=500 && mouseX<=700 && mouseY>=310 &&mouseY<=360 ){
					window.setColor(Color.BLACK);
					window.fillRect(0, 0, 800, 400);
					window.setColor(Color.green);
					window.fillRect(10, 10, 780, 360);
					window.setColor(Color.white);
					window.setFont(new Font("TAHOMA", Font.BOLD, 20));
					window.drawString(output, 400, 200);
					//next
					Rectangle next = new Rectangle(700, 0, 50, 50, Color.WHITE);
					next.draw(window);
					window.setColor(Color.black);
					window.setFont(new Font("TAHOMA", Font.BOLD, 20));
					window.drawString("NEXT", 700, 25);
					
				}

			}
			
			
			
				
		}
		


}
	

