import javax.swing.*;
import java.awt.* ;

class DemoPanel extends JPanel{
	
	public DemoPanel(){
		setPreferredSize(new Dimension(400, 300));
		setBackground(Color.WHITE);    
	}// end DemoPanel  
 
	public void paintComponent(Graphics gr){ 
		int width  = getWidth();
		int height = getHeight();
 
		super.paintComponent(gr);
		gr.setColor(Color.BLUE);
		gr.drawLine(0,0,width-1, height-1);
	}// end paintComponent
	
}// end DemoPanel class

public class TestPanel{
	
	public static void main(String[] args){
		JFrame frame = new JFrame("Test Panel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
		frame.getContentPane().add(new DemoPanel());
      
		frame.pack();
		frame.setVisible(true);
	}// end main
	
}// end TestPanel class