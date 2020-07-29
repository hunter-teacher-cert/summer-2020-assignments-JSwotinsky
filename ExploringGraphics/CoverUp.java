import javax.swing.*;
import java.awt.*;

class CoverUpPanel extends JPanel{
	
	public CoverUpPanel(){
		setPreferredSize(new Dimension(600, 300));
		setBackground(Color.LIGHT_GRAY);   
	}// end CoverUpPanel

	public void paintComponent(Graphics gr){ 
		int width = getWidth();  
		int height = getHeight();

		// Base the circle on the minimum dimension
		int min;
		if(width <= height){
			min = width;
		} else {
			min = height;
		}// end if else
    
		// draw the rectangle
		gr.setColor(Color.WHITE);
		gr.fillRect(width/4, height/4, width/2, height/2);
		gr.setColor(Color.BLUE);
		gr.drawRect(width/4, height/4, width/2, height/2);

		// draw the circle
		gr.setColor(Color.PINK);
		gr.fillOval(width/2-min/5, height/2-min/5, 2*min/5, 2*min/5);
	}// end paintComponent

}// end OverUpPanel class

public class CoverUp{
  
	public static void main ( String[] args ){
		JFrame frame = new JFrame("Circle on top of Rectangle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new CoverUpPanel());

		frame.pack(); 
		frame.setVisible(true);
	}// end main

}// end CoverUp class