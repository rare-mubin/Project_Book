package Frame;
import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class AdminLogin extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5,l6,lP;
		JLabel pl1,Tpl; //for panel image
		JLabel bl1,bl2,bl3,bl4,bl5,tl1,tl2; //for button and  textfield image
		JTextField t1,t2;
		JButton b1,b2,b3,b4,b5; 

		String userName;
		static Point LP;

	public AdminLogin(String userName)
	{
		this.userName = userName;

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

		String picpath = "image\\profile\\mubin.png";
		
			File file = new File(picpath);
			if (file.exists()){
				lP = new JLabel(new ImageIcon(picpath));
				lP.setBounds(860,148,157,157);
				l1.add(lP);
			}
			else{
				lP = new JLabel(new ImageIcon("image\\profile\\dummy-profile-pic.png"));
				lP.setBounds(860,148,157,157);
				l1.add(lP);
			}

        l2 = new JLabel("ADMIN LOGIN");
		l2.setFont(new Font("Felix Titling",Font.BOLD,32));
		l2.setForeground(new Color(0x505050));
		l2.setBounds(824,94,231,37);
		l1.add(l2);

		l6 = new JLabel();
		l6.setFont(new Font("Felix Titling",Font.BOLD,32));
		l6.setForeground(new Color(0x000000));
		l6.setBounds(870,158,137,137);
		l1.add(l6);

		l3 = new JLabel("MUBIN HASAN");
		l3.setFont(new Font("Felix Titling",Font.BOLD,30));
		l3.setForeground(new Color(0x505050));
		l3.setBounds(828,313,223,37);
		l1.add(l3);

		l4 = new JLabel("Enter Email User Name");
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
		b1.setBounds(851,551,176,49);
		b1.setBorderPainted(false);
		b1.addActionListener(this);
		l1.add(b1);
		bl1 = new JLabel(); bl1.setIcon(log_sign);
		bl1.setBounds(851,551,176,49);
		l1.add(bl1);


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

		//Back button
		b5 = new JButton();
		b5.setOpaque(false);
		b5.setFocusable(false);
		b5.setBackground(Color.white);
		b5.setBounds(1234,127,35,35);
		b5.setBorderPainted(false);
		b5.addActionListener(this);
		l1.add(b5);
		bl5 = new JLabel(new ImageIcon("image\\button\\Back.png"));
		bl5.setBounds(1234,127,35,35);
        l1.add(bl5);
		

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
				String UserName =t1.getText();
				String userPassword = t2.getText();
				Account createAccount = new Account();

			 	if((UserName.equals(this.userName))&&(createAccount.getAccount(this.userName, userPassword)))
				{
					JOptionPane.showMessageDialog(null,"Login Successful");
					AdminHome f = new AdminHome(userName);
					this.setVisible(false);
					f.setVisible(true);
	
				}

				else{JOptionPane.showMessageDialog(null, "Check UserName/Password");}
			
				
			}

			else if(ae.getSource()==b5) //back
			{
				Login f = new Login();
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