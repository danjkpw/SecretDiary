package Tool;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class smile extends JPanel{
	public void paintComponent(Graphics g) {

		 g.setColor(new Color(255,205,42));
	        g.fillOval(119, 55, 150, 150);
	        g.setColor(Color.BLACK);
	        g.fillOval(155, 100, 20, 20);
	        g.setColor(Color.BLACK);
	        g.fillOval(210, 100, 20, 20);
	        g.setColor(Color.WHITE);
	        g.fillArc(144, 100, 100,80, 180, 180);

	}
}
