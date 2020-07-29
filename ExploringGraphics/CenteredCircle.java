import javax.swing.*;
import java.awt.*;

class CirclePanel extends JPanel{

	public CirclePanel(){
		setPreferredSize(new Dimension(400, 400));
		setBackground(Color.WHITE);   
	}// end CirclePanel
  
	public void paintComponent ( Graphics gr ){ 
		super.paintComponent(gr);

		// Determine the center of the panel
		int cntrX = getWidth()/2;
		int cntrY = getHeight()/2;
    
		// Calculate the radius
		int radius = getWidth()/4;
    
		// Draw the Circle
		gr.setColor(Color.YELLOW);
		gr.fillOval(cntrX-radius, cntrY-radius, radius*2, radius*2);
		gr.setColor(Color.GREEN);
		gr.drawOval(cntrX-radius, cntrY-radius, radius*2, radius*2);
	}// end paintComponent
	
}// end CirclePanel class


public class CenteredCircle{
	
	public static void main(String[] args){
		JFrame frame = new JFrame("Centered Circle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
		frame.getContentPane().add(new CirclePanel());
      
		frame.pack();
		frame.setVisible(true);
	}// end main
	
}// end CenteredCircle class