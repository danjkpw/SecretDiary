package Tool;

import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import javax.swing.JFrame;

public class Cat extends JPanel{
	JFrame f = new JFrame();
	JLabel lb = new JLabel();
	Cat(){
	super();
		smile p = new smile();
		f.add(lb);
		f.add(p);
		f.setSize(400,270);
		f.setLocation(300,300);
		f.setTitle("SecretDiary");
		f.setVisible(true);

	}
}
