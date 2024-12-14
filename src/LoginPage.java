import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.HashMap;
import javax.swing.*;
import Tool.WelcomePage;
import Tool.Terms;
import Tool.*;

public class LoginPage extends JPanel implements ActionListener,ItemListener{
	
	JPanel panel_center = new JPanel();
	JPanel panel_north = new JPanel();
	JPanel panel_south = new JPanel();
	JPanel panel_east = new JPanel();
	JPanel panel_west = new JPanel();
	
	public static JTextField username_tf = new JTextField("");
	public static String username_st = username_tf.getText();
	JPasswordField password_tf = new JPasswordField("");
	
	JLabel username_lb = new JLabel("Username");
	JLabel password_lb = new JLabel("Password");
	JLabel title_lb = new JLabel("Secret Diary Login Page");
	JLabel pin_lb1 = new JLabel("-");
	JLabel pin_lb2 = new JLabel("-");
	JLabel pin_lb3 = new JLabel("-");
	JLabel success_lb = new JLabel("");
	
	JButton pat_one = new JButton("");
	JButton pat_two = new JButton("");
	JButton pat_three = new JButton("");
	JButton pat_four = new JButton("");
	JButton pat_five = new JButton("");
	JButton pat_six = new JButton("");
	JButton pat_seven = new JButton("");
	JButton pat_eight = new JButton("");
	JButton pat_nine = new JButton("");
	
	JButton zero = new JButton("0");
	JButton one = new JButton("1");
	JButton two = new JButton("2");
	JButton three = new JButton("3");
	JButton four = new JButton("4");
	JButton five = new JButton("5");
	JButton six = new JButton("6");
	JButton seven = new JButton("7");
	JButton eight = new JButton("8");
	JButton nine = new JButton("9");
	JButton delete = new JButton("");
	JButton space = new JButton("");
	
	JButton confirm_bt = new JButton("CONFIRM");
	JRadioButton agreement_rb = new JRadioButton("I understand");
	JButton agreement_bt = new JButton("Read the agreement");
	JButton reset_bt = new JButton("Reset");
	
	String iconcolor[] = {"white.jpg","blue.jpg","green.jpg","orange.jpg","red.jpg","yellow.jpg"};
	int[] pin_array = new int[4];
	
	int int_color1 = 0;
	int int_color2 = 0;
	int int_color3 = 0;
	int int_color4 = 0;
	int int_color5 = 0;
	int int_color6 = 0;
	int int_color7 = 0;
	int int_color8 = 0;
	int int_color9 = 0;
	int x = 0;
	ImageIcon icon_1 = new ImageIcon(iconcolor[int_color1]);
	ImageIcon icon_2 = new ImageIcon(iconcolor[int_color2]);
	ImageIcon icon_3 = new ImageIcon(iconcolor[int_color3]);
	ImageIcon icon_4 = new ImageIcon(iconcolor[int_color4]);
	ImageIcon icon_5 = new ImageIcon(iconcolor[int_color5]);
	ImageIcon icon_6 = new ImageIcon(iconcolor[int_color6]);
	ImageIcon icon_7 = new ImageIcon(iconcolor[int_color7]);
	ImageIcon icon_8 = new ImageIcon(iconcolor[int_color8]);
	ImageIcon icon_9 = new ImageIcon(iconcolor[int_color9]);
	
	JFrame f = new JFrame();
	HashMap<String,String> logininfo = new HashMap<String,String>();
	LoginPage(HashMap<String,String> loginInfoOriginal){
		super();
		logininfo = loginInfoOriginal;
		
		f.setLayout(new BorderLayout());
		f.add(panel_center,BorderLayout.CENTER);
		f.add(panel_south,BorderLayout.SOUTH);
		f.add(panel_north,BorderLayout.NORTH);
		f.add(panel_east,BorderLayout.EAST);
		f.add(panel_west,BorderLayout.WEST);
		/*panel_west.setBackground(Color.red);
		panel_east.setBackground(Color.yellow);
		panel_south.setBackground(Color.green);
		panel_north.setBackground(Color.blue);
		*/
		//UP
		panel_north.setLayout(null);
		panel_north.setPreferredSize(new Dimension(100,100));
		title_lb.setFont(new Font(null,Font.ITALIC,35));
		title_lb.setBounds(50,5,400,100);
		panel_north.add(title_lb);
		
		//DOWN
		panel_south.setLayout(null);
		panel_south.setPreferredSize(new Dimension(100,100));
		agreement_bt.setBounds(350,35,150,30);
		panel_south.add(agreement_bt);
		agreement_bt.addActionListener(this);
		agreement_rb.setBounds(520,35,120,30);
		confirm_bt.setBounds(650,35,100,30);
		panel_south.add(confirm_bt);
		confirm_bt.addActionListener(this);
		reset_bt.setBounds(770,35,70,30);
		panel_south.add(reset_bt);
		reset_bt.addActionListener(this);
		
		//CENTER
		panel_center.setLayout(new GridLayout(3,3));
		pat_one.setIcon(icon_1);
		panel_center.add(pat_one);
		pat_one.addActionListener(this);
		pat_two.setIcon(icon_2);
		panel_center.add(pat_two);
		pat_two.addActionListener(this);
		pat_three.setIcon(icon_3);
		panel_center.add(pat_three);
		pat_three.addActionListener(this);
		pat_four.setIcon(icon_4);
		panel_center.add(pat_four);
		pat_four.addActionListener(this);
		pat_five.setIcon(icon_5);
		panel_center.add(pat_five);
		pat_five.addActionListener(this);
		pat_six.setIcon(icon_6);
		panel_center.add(pat_six);
		pat_six.addActionListener(this);
		pat_seven.setIcon(icon_7);
		panel_center.add(pat_seven);
		pat_seven.addActionListener(this);
		pat_eight.setIcon(icon_8);
		panel_center.add(pat_eight);
		pat_eight.addActionListener(this);
		pat_nine.setIcon(icon_9);
		panel_center.add(pat_nine);
		pat_nine.addActionListener(this);
		
		//LEFT
		panel_west.setLayout(null);
		panel_west.setPreferredSize(new Dimension(350,100));
		username_lb.setBounds(20,100,300,30);
		panel_west.add(username_lb);
		username_tf.setBounds(20,150,300,30);
		panel_west.add(username_tf);
		password_lb.setBounds(20,200,300,30);
		panel_west.add(password_lb);
		password_tf.setBounds(20,250,300,30);
		panel_west.add(password_tf);
		success_lb.setBounds(25,300,300,30);
		panel_west.add(success_lb);
		
		//RIGHT
		panel_east.setLayout(null);
		panel_east.setPreferredSize(new Dimension(350,100));
		pin_lb1.setBounds(124,100,50,50);
		pin_lb2.setBounds(174,100,50,50);
		pin_lb3.setBounds(224,100,50,50);
		panel_east.add(pin_lb1);
		panel_east.add(pin_lb2);
		panel_east.add(pin_lb3);
		one.setBounds(100,150,50,50);
		one.addActionListener(this);
		panel_east.add(one);
		two.setBounds(150,150,50,50);
		two.addActionListener(this);
		panel_east.add(two);
		three.setBounds(200,150,50,50);
		three.addActionListener(this);
		panel_east.add(three);
		four.setBounds(100,200,50,50);
		four.addActionListener(this);
		panel_east.add(four);
		five.setBounds(150,200,50,50);
		five.addActionListener(this);
		panel_east.add(five);
		six.setBounds(200,200,50,50);
		six.addActionListener(this);
		panel_east.add(six);
		seven.setBounds(100,250,50,50);
		seven.addActionListener(this);
		panel_east.add(seven);
		eight.setBounds(150,250,50,50);
		eight.addActionListener(this);
		panel_east.add(eight);
		nine.setBounds(200,250,50,50);
		nine.addActionListener(this);
		panel_east.add(nine);
		delete.setBounds(100,300,50,50);
		zero.addActionListener(this);
		panel_east.add(delete);
		zero.setBounds(150,300,50,50);
		panel_east.add(zero);
		space.setBounds(200,300,50,50);
		panel_east.add(space);
		
		f.setSize(1200,800);
		f.setLocation(100,100);
		f.setTitle("SecretDiary");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static String getUserId() {
		return username_st;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == agreement_bt) {
			Terms terms = new Terms();
		}
		if(e.getSource() == reset_bt) {
			username_tf.setText("");
			password_tf.setText("");
			pin_lb1.setText("-");
			pin_lb2.setText("-");
			pin_lb3.setText("-");
			success_lb.setText("");
			int_color1 = 0;
			ImageIcon icon_1 = new ImageIcon(iconcolor[int_color1]);
			pat_one.setIcon(icon_1);
			int_color2 = 0;
			ImageIcon icon_2 = new ImageIcon(iconcolor[int_color2]);
			pat_two.setIcon(icon_2);
			int_color3 = 0;
			ImageIcon icon_3 = new ImageIcon(iconcolor[int_color3]);
			pat_three.setIcon(icon_3);
			int_color4 = 0;
			ImageIcon icon_4 = new ImageIcon(iconcolor[int_color4]);
			pat_four.setIcon(icon_4);
			int_color5 = 0;
			ImageIcon icon_5 = new ImageIcon(iconcolor[int_color5]);
			pat_five.setIcon(icon_5);
			int_color6 = 0;
			ImageIcon icon_6 = new ImageIcon(iconcolor[int_color6]);
			pat_six.setIcon(icon_6);
			int_color7 = 0;
			ImageIcon icon_7 = new ImageIcon(iconcolor[int_color7]);
			pat_seven.setIcon(icon_7);
			int_color8 = 0;
			ImageIcon icon_8 = new ImageIcon(iconcolor[int_color8]);
			pat_eight.setIcon(icon_8);
			int_color9 = 0;
			ImageIcon icon_9 = new ImageIcon(iconcolor[int_color9]);
			pat_nine.setIcon(icon_9);
			x = 0;
		}
		if(e.getSource()== confirm_bt) {
			String userID = username_tf.getText();
			String password = String.valueOf(password_tf.getPassword());
			
			if(logininfo.containsKey(userID)) {
				if(logininfo.get(userID).equals(password)) {
					if(int_color1 == 3 && int_color2 == 1 && int_color3 == 3 && int_color4 == 1 && int_color5 == 3 && int_color6 == 1 && int_color7 == 3 && int_color8 == 1 && int_color9 == 3) {
						if(pin_array[0] == 5 && pin_array[1] == 0 && pin_array[2] == 8) {
							success_lb.setForeground(Color.green);
							success_lb.setText("LoginSuccessful");
							f.dispose();
							WelcomePage welcomepage = new WelcomePage(userID);
						}
						else {
							success_lb.setForeground(Color.RED);
							success_lb.setText("Wrong Pin");
						}
					}
					else {
						success_lb.setForeground(Color.RED);
						success_lb.setText("Wrong Color Patterns");
					}
					
					
				}
				else {
					success_lb.setForeground(Color.RED);
					success_lb.setText("Username or Password is Wrong");
				}

			}
			else {
					success_lb.setForeground(Color.RED);
					success_lb.setText("Username or Password is Wrong");
			}
		}
		
		
		
		if(e.getSource() == pat_one) {
			if (int_color1 == 5){
				int_color1 = 0;
				ImageIcon icon_1 = new ImageIcon(iconcolor[int_color1]);
				pat_one.setIcon(icon_1);
				System.out.println(int_color1);
			}
			else {
				int_color1 = int_color1 + 1;
				ImageIcon icon_1 = new ImageIcon(iconcolor[int_color1]);
				pat_one.setIcon(icon_1);
				System.out.println(int_color1);
			}
		}
		if(e.getSource() == pat_two) {
			if (int_color2 == 5){
				int_color2 = 0;
				ImageIcon icon_2 = new ImageIcon(iconcolor[int_color2]);
				pat_two.setIcon(icon_2);
				System.out.println(int_color2);
			}
			else {
				int_color2 = int_color2 + 1;
				ImageIcon icon_2 = new ImageIcon(iconcolor[int_color2]);
				pat_two.setIcon(icon_2);
				System.out.println(int_color2);
			}
		}
		if(e.getSource() == pat_three) {
			if (int_color3 == 5){
				int_color3 = 0;
				ImageIcon icon_3 = new ImageIcon(iconcolor[int_color3]);
				pat_three.setIcon(icon_3);
				System.out.println(int_color3);
			}
			else {
				int_color3 = int_color3 + 1;
				ImageIcon icon_3 = new ImageIcon(iconcolor[int_color3]);
				pat_three.setIcon(icon_3);
		        System.out.println(int_color3);
			}
		}
		if(e.getSource() == pat_four) {
			if (int_color4 == 5){
				int_color4 = 0;
				ImageIcon icon_4 = new ImageIcon(iconcolor[int_color4]);
				pat_four.setIcon(icon_4);
				System.out.println(int_color4);
			}
			else {
				int_color4 = int_color4 + 1;
				ImageIcon icon_4 = new ImageIcon(iconcolor[int_color4]);
				pat_four.setIcon(icon_4);
		        System.out.println(int_color4);
			}
		}
		if(e.getSource() == pat_five) {
			if (int_color5 == 5){
				int_color5 = 0;
				ImageIcon icon_5 = new ImageIcon(iconcolor[int_color5]);
				pat_five.setIcon(icon_5);
				System.out.println(int_color5);
			}
			else {
				int_color5 = int_color5 + 1;
				ImageIcon icon_5 = new ImageIcon(iconcolor[int_color5]);
				pat_five.setIcon(icon_5);
		        System.out.println(int_color5);
			}
		}
		if(e.getSource() == pat_six) {
			if (int_color6 == 5){
				int_color6 = 0;
				ImageIcon icon_6 = new ImageIcon(iconcolor[int_color6]);
				pat_six.setIcon(icon_6);
				System.out.println(int_color6);
			}
			else {
				int_color6 = int_color6 + 1;
				ImageIcon icon_6 = new ImageIcon(iconcolor[int_color6]);
				pat_six.setIcon(icon_6);
		        System.out.println(int_color6);
			}
		}
		if(e.getSource() == pat_seven) {
			if (int_color7 == 5){
				int_color7 = 0;
				ImageIcon icon_7 = new ImageIcon(iconcolor[int_color7]);
				pat_seven.setIcon(icon_7);
				System.out.println(int_color7);
			}
			else {
				int_color7 = int_color7 + 1;
				ImageIcon icon_7 = new ImageIcon(iconcolor[int_color7]);
				pat_seven.setIcon(icon_7);
		        System.out.println(int_color7);
			}
		}
		if(e.getSource() == pat_eight) {
			if (int_color8 == 5){
				int_color8 = 0;
				ImageIcon icon_8 = new ImageIcon(iconcolor[int_color8]);
				pat_eight.setIcon(icon_8);
				System.out.println(int_color8);
			}
			else {
				int_color8 = int_color8 + 1;
				ImageIcon icon_8 = new ImageIcon(iconcolor[int_color8]);
				pat_eight.setIcon(icon_8);
		        System.out.println(int_color8);
			}
		}
		if(e.getSource() == pat_nine) {
			if (int_color9 == 5){
				int_color9 = 0;
				ImageIcon icon_9 = new ImageIcon(iconcolor[int_color9]);
				pat_nine.setIcon(icon_9);
				System.out.println(int_color9);
			}
			else {
				int_color9 = int_color9 + 1;
				ImageIcon icon_9 = new ImageIcon(iconcolor[int_color9]);
				pat_nine.setIcon(icon_9);
		        System.out.println(int_color9);
			}
		}
		
		
		if(e.getSource() == one) {
			pin_array[x] = 1;
			x = x+1;
			if(x == 1) {
				pin_lb1.setText("*");}
				if(x == 2) {
					pin_lb2.setText("*");}
					if(x == 3) {
						pin_lb3.setText("*");}
						
					}
		if(e.getSource() == two) {
			pin_array[x] = 2;
			x = x+1;
			if(x == 1) {
				pin_lb1.setText("*");}
				if(x == 2) {
					pin_lb2.setText("*");}
					if(x == 3) {
						pin_lb3.setText("*");}
						
					}
		if(e.getSource() == three) {
			pin_array[x] = 3;
			x = x+1;
			if(x == 1) {
				pin_lb1.setText("*");}
				if(x == 2) {
					pin_lb2.setText("*");}
					if(x == 3) {
						pin_lb3.setText("*");}
						
					}
		if(e.getSource() == four) {
			pin_array[x] = 4;
			x = x+1;
			if(x == 1) {
				pin_lb1.setText("*");}
				if(x == 2) {
					pin_lb2.setText("*");}
					if(x == 3) {
						pin_lb3.setText("*");}
						
					}
		if(e.getSource() == five) {
			pin_array[x] = 5;
			x = x+1;
			if(x == 1) {
				pin_lb1.setText("*");}
				if(x == 2) {
					pin_lb2.setText("*");}
					if(x == 3) {
						pin_lb3.setText("*");}
						
					}
		if(e.getSource() == six) {
			pin_array[x] = 6;
			x = x+1;
			if(x == 1) {
				pin_lb1.setText("*");}
				if(x == 2) {
					pin_lb2.setText("*");}
					if(x == 3) {
						pin_lb3.setText("*");}
						
					}
		if(e.getSource() == seven) {
			pin_array[x] = 7;
			x = x+1;
			if(x == 1) {
				pin_lb1.setText("*");}
				if(x == 2) {
					pin_lb2.setText("*");}
					if(x == 3) {
						pin_lb3.setText("*");}
						
					}
		if(e.getSource() == eight) {
			pin_array[x] = 8;
			x = x+1;
			if(x == 1) {
				pin_lb1.setText("*");}
				if(x == 2) {
					pin_lb2.setText("*");}
					if(x == 3) {
						pin_lb3.setText("*");}
						
					}
		if(e.getSource() == nine) {
			pin_array[x] = 9;
			x = x+1;
			if(x == 1) {
				pin_lb1.setText("*");}
				if(x == 2) {
					pin_lb2.setText("*");}
					if(x == 3) {
						pin_lb3.setText("*");}
						
					}
		if(e.getSource() == zero) {
			pin_array[x] = 0;
			x = x+1;
			if(x == 1) {
				pin_lb1.setText("*");}
				if(x == 2) {
					pin_lb2.setText("*");}
					if(x == 3) {
						pin_lb3.setText("*");}
	
		}
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
