package Frame;
import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5;
		JLabel pl1,Tpl; //for panel image
		JLabel bl1,bl2,bl3,bl4,bl6,tl1,tl2; //for button and  textfield image
		JTextField t1,t2;
		JButton b1,b2,b3,b4,b5,b6,b7; 


		static Point LP;

	public Login()
	{
        ImageIcon image = new ImageIcon("image\\background\\login_page_L.png");
		ImageIcon Lpanel = new ImageIcon("image\\panel\\loginP.png");
		ImageIcon log_sign = new ImageIcon("image\\button\\Login_Sign.png");
		ImageIcon textF = new ImageIcon("image\\TextField\\email_pass.png");
        l1 = new JLabel();

        this.setTitle("project_BOOK");
		this.setSize(1280,720);
		
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);

        l1.setIcon(image);

        l2 = new JLabel("Welcome");
		l2.setFont(new Font("Felix Titling",Font.BOLD,52));
		l2.setForeground(new Color(0x505050));
		l2.setBounds(753,95,372,64);
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l1.add(l2);

		l3 = new JLabel("Pixelated Book");
		l3.setFont(new Font("Felix Titling",Font.BOLD,43));
		l3.setForeground(new Color(0x505050));
		l3.setBounds(743,180,392,70);
		l3.setHorizontalAlignment(SwingConstants.CENTER);
		l1.add(l3);

		l4 = new JLabel("Enter Your User Name");
		l4.setFont(new Font("Arial",Font.PLAIN,17));
		l4.setForeground(new Color(0x777777));
		l4.setBounds(754,358,185,21);
		l1.add(l4);

		l5 = new JLabel("Enter Password");
		l5.setFont(new Font("Arial",Font.PLAIN,17));
		l5.setForeground(new Color(0x777777));
		l5.setBounds(754,443,126,21);
		l1.add(l5);

		//Enter Email User Name TextField
		t1 = new JTextField(); 
		t1.setBounds(754,379,370,49);
		t1.setFont(new Font("Arial",Font.PLAIN,20));
		t1.setForeground(Color.black);
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setBorder(null);
		t1.setOpaque(false);
		l1.add(t1);
		tl1 = new JLabel(); tl1.setIcon(textF);
		tl1.setBounds(754,379,370,49);
		l1.add(tl1);

		//PasswordField
		t2 = new JPasswordField();
		t2.setBounds(754,464,370,49);
		t2.setFont(new Font("Arial",Font.PLAIN,20));
		t2.setForeground(Color.black);
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setBorder(null);
		t2.setOpaque(false);
		l1.add(t2);
		tl2 = new JLabel(); tl2.setIcon(textF);
		tl2.setBounds(754,464,370,49);
		l1.add(tl2);
		
		//log in button
		b1 = new JButton("Log In");
		b1.setFont(new Font("Arial",Font.PLAIN,25));
		b1.setForeground(Color.WHITE);
		b1.setOpaque(false);
		b1.setFocusable(false);
		b1.setBackground(Color.blue);
		b1.setBounds(754,551,176,49);
		b1.setBorderPainted(false);
		b1.addActionListener(this);
		l1.add(b1);
		bl1 = new JLabel(); bl1.setIcon(log_sign);
		bl1.setBounds(754,551,176,49);
		l1.add(bl1);

		//Sing Up button
		b2 = new JButton("Sign Up");
		b2.setFont(new Font("Arial",Font.PLAIN,25));
		b2.setForeground(Color.WHITE);
		b2.setOpaque(false);
		b2.setFocusable(false);
		b2.setBackground(Color.blue);
		b2.setBounds(948,551,176,49);
		b2.setBorderPainted(false);
		b2.addActionListener(this);
		l1.add(b2);
		bl2 = new JLabel(); bl2.setIcon(log_sign);
		bl2.setBounds(948,551,176,49);
		l1.add(bl2);

		// forgotPassword
		b7 = new JButton("Forgot Password");
		b7.setFont(new Font("Arial",Font.PLAIN,18));
		b7.setForeground(new Color(0x4A4A4A));
		b7.setOpaque(false);
		b7.setFocusable(false);
		b7.setBackground(Color.blue);
		b7.setBounds(853,643,173,25);
		b7.setBorderPainted(false);
		b7.addActionListener(this);
		l1.add(b7);

		//Exit Button
		b3 = new JButton();
		b3.setOpaque(false);
		b3.setFocusable(false);
		b3.setBackground(Color.white);
		b3.setBounds(1234,11,35,35);
		b3.setBorderPainted(false);
		b3.addActionListener(this);
		l1.add(b3);
		bl3 = new JLabel(new ImageIcon("image\\button\\Exit.png"));
		bl3.setBounds(1234,11,35,35);
        l1.add(bl3);

		//Minimize Button
		b4 = new JButton();
		b4.setOpaque(false);
		b4.setFocusable(false);
		b4.setBackground(Color.white);
		b4.setBounds(1234,51,35,35);
		b4.setBorderPainted(false);
		b4.addActionListener(this);
		l1.add(b4);
		bl4 = new JLabel(new ImageIcon("image\\button\\Minimize.png"));
		bl4.setBounds(1234,51,35,35);
        l1.add(bl4);

		//back button
		b5 = new JButton();
		b5.setOpaque(false);
		b5.setFocusable(false);
		b5.setBackground(Color.white);
		b5.setBounds(1234,127,35,35);
		b5.setBorderPainted(false);
		b5.addActionListener(this);
		l1.add(b5);

		//Admin Panel Button
		b6 = new JButton();
		b6.setOpaque(false);
		b6.setFocusable(false);
		b6.setBackground(Color.white);
		b6.setBounds(1234,585,35,35);
		b6.setBorderPainted(false);
		b6.addActionListener(this);
		l1.add(b6);
		bl6 = new JLabel(new ImageIcon("image\\button\\profile.png"));
		bl6.setBounds(1234,585,35,35);
        l1.add(bl6);
		

		//log In panel
		pl1 = new JLabel(); pl1.setIcon(Lpanel);
		pl1.setBounds(671,25,536,669);
        l1.add(pl1);

		//right title bar
		Tpl = new JLabel(new ImageIcon("image\\panel\\titleP.png"));
		Tpl.setBounds(1228,5,46,710);
        l1.add(Tpl);

        //this.add(p1);
        this.add(l1);



//__________________________________________________________________________________________________
        //dragable jframe
		LP = null;
		this.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
				LP = null;
			}

			public void mousePressed(MouseEvent e) {
				LP = e.getPoint();
			}

			public void mouseExited(MouseEvent e) {
			}

			public void mouseEntered(MouseEvent e) {
			}

			public void mouseClicked(MouseEvent e) {
			}
		});
		this.addMouseMotionListener(new MouseMotionListener() {
			public void mouseMoved(MouseEvent e) {
			}

			public void mouseDragged(MouseEvent e) 
			{
				Point currCoords = e.getLocationOnScreen();
				setLocation(currCoords.x - LP.x, currCoords.y - LP.y);
			}

			
		});
//__________________________________________________________________________________________________

        
	}


		public void actionPerformed(ActionEvent ae) 
		{
			if(ae.getSource()==b1)
			{
				String userName =t1.getText();
				String userPassword = t2.getText();
				Account createAccount = new Account();

			 	if(createAccount.getAccount(userName, userPassword))
				{
					Home f = new Home(userName);
					this.setVisible(false);
					f.setVisible(true);
				}

				else{JOptionPane.showMessageDialog(null, "Check UserName/Password");}
			
				
			}

			if(ae.getSource()==b2)
			{
				SignUp f = new SignUp();
				this.setVisible(false);
				f.setVisible(true);
			}
			if(ae.getSource()==b6)
			{
				AdminLogin f = new AdminLogin("mubin");
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b7)
			{
				FPassword f = new FPassword();
				this.setVisible(false);
				f.setVisible(true);
			}

			
			
			else if(ae.getSource()==b3)
			{
				System.exit(0);
			}

			else if(ae.getSource()==b4)
			{
				this.setState(JFrame.ICONIFIED);
			}
		}


}