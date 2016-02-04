import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window {
	
	
	public void display(){
		JFrame frame = new JFrame("Realm Jumper");
		frame.setVisible(true);
		frame.setSize(800, 600);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel emptyLabel = new JLabel("");
		frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
	}
	
}
