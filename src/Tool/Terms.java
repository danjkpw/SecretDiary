 package Tool;
import javax.swing.JPanel;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.*;

public class Terms extends JPanel{
	JFrame f = new JFrame();
	JLabel welcome = new JLabel("Welcome");
	JPanel panel2 = new JPanel();
	
	public Terms(){
		
		f.add(panel2,BorderLayout.CENTER);
		
		welcome.setText("This Diary is Secrert, Do you mind keep this between us???");
		panel2.add(welcome);
		
		f.setSize(400,100);
		f.setLocation(100,100);
		f.setTitle("SecretDiary");
		f.setVisible(true);
	}
}
