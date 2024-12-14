package Tool;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class WelcomePage extends JPanel implements ActionListener{
	JFrame f = new JFrame();
	JLabel welcome = new JLabel("Welcome");
	JTextField diary = new JTextField();
	String note = diary.getText();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JButton start_bt = new JButton();
	JButton reset_bt = new JButton();
	JLabel time_lb = new JLabel();
	JButton smile = new JButton();
	int elapsedTime = 0;
	int seconds = 0;
	int minutes = 0;
	int hours = 0;
	boolean started = false;
	String seconds_st = String.format("%02d", seconds);
	String minutes_st = String.format("%02d", seconds);
	String hours_st = String.format("%02d", seconds);
	
	Timer timer = new Timer(1000,new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			elapsedTime+=1000;
			hours = (elapsedTime/3600000);
			minutes = (elapsedTime/60000) % 60;
			seconds = (elapsedTime/1000) % 60;
			seconds_st = String.format("%02d", seconds);
			minutes_st = String.format("%02d", minutes);
			hours_st = String.format("%02d", hours);
			time_lb.setText(hours_st + ":" + minutes_st + ":" + seconds_st);
		}
	});
	
	public WelcomePage(String userID){
		
		time_lb.setText(hours_st+":"+minutes_st+":"+seconds_st);
		time_lb.setBounds(20,0,100,50);
		time_lb.setFont(new Font("Verdana",Font.PLAIN,20));
		time_lb.setBorder(BorderFactory.createBevelBorder(1));
		time_lb.setOpaque(true);
		time_lb.setHorizontalAlignment(JTextField.CENTER);
		start_bt.setBounds(125,3,80,40);
		start_bt.setFont(new Font("Verdana",Font.PLAIN,10));
		start_bt.setText("Start");
		start_bt.addActionListener(this);
		reset_bt.setBounds(220,3,80,40);
		reset_bt.setFont(new Font("Verdana",Font.PLAIN,10));
		reset_bt.setText("Reset");
		reset_bt.addActionListener(this);
		smile.setBounds(325,3,80,40);
		smile.setFont(new Font("Verdana",Font.PLAIN,10));
		smile.setText("Smile");
		smile.addActionListener(this);
		
		
		
		f.add(start_bt);
		f.add(reset_bt);
		f.add(time_lb);
		f.add(smile);
		f.add(panel1,BorderLayout.NORTH);
		f.add(panel2,BorderLayout.CENTER);
		
		panel2.setLayout(null);
		diary.setBounds(20,20,1150,650);
		panel2.add(diary);
		welcome.setFont(new Font(null,Font.ITALIC,25));
		welcome.setText("Hello!! Welcome back " + userID);
		panel1.add(welcome);
		
		f.setSize(1200,800);
		f.setLocation(100,100);
		f.setTitle("SecretDiary");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== start_bt) {
			if(started == false) {
				started = true;
				start_bt.setText("Stop");
				start();
			}
			else {
				started = false;
				start_bt.setText("Start");
				stop();
				
			}
		}
		if(e.getSource() == reset_bt) {
			started = false;
			start_bt.setText("Start");
			reset();
		}
		if(e.getSource() == smile) {
			Cat cat = new Cat();
		}
	}
	
	void start() {
		timer.start();
	}
	void stop() {
		timer.stop();
	}
	void reset() {
		timer.stop();
		elapsedTime = 0;
		seconds = 0;
		minutes = 0;
		hours = 0;
		seconds_st = String.format("%02d", seconds);
		minutes_st = String.format("%02d", minutes);
		hours_st = String.format("%02d", hours);
		time_lb.setText(hours_st + ":" + minutes_st + ":" + seconds_st);
			
	}
}
