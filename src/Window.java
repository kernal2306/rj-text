import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window {
	
	
	public void display(){
		JFrame frame = new JFrame("Realm Jumper");
		frame.setVisible(true);
		frame.setSize(800, 600);
		frame.setLayout(null);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JLabel emptyLabel = new JLabel("");
		frame.getContentPane();
		
		JLabel textArea = new JLabel("Testing to see");
		//textArea.setSize(700, 500);
		textArea.setBounds(0,0,800,500);
		textArea.setVisible(true);
		frame.add(textArea);
		JButton buttonLeft = new JButton("Left");
		//buttonLeft.setSize(100,100);
		buttonLeft.setBounds(200,500,100,40);
		frame.add(buttonLeft);
		JButton buttonRight = new JButton("Right");
		buttonRight.setBounds(500, 500, 100, 40);
		frame.add(buttonRight);
	}
	
}
