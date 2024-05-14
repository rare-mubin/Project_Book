package Frame;
import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SignUp extends JFrame implements ActionListener
{
	

		JLabel l,l1,l2,l3,l4,l5,l6,l7;
		JTextField t1,t2,t3,t4,t5,t6;
		JButton b1,b2,b3,b4,b5; 
		JLabel pl1,Tpl; //for panel image
		JLabel bl1,bl2,bl3,bl4,bl5,tl1,tl2,tl3,tl4,tl5,tl6; //for button and  textfield image

		int lineNumber;
		String user;

		static Point LP;
		
	public SignUp()
	{
		super(" SignUp ");

        ImageIcon image = new ImageIcon("image\\background\\login_page_L.png");
		ImageIcon Lpanel = new ImageIcon("image\\panel\\loginP.png");
		ImageIcon textF = new ImageIcon("image\\TextField\\email_pass.png");
        l = new JLabel();

        this.setTitle("project_BOOK");
		this.setSize(1280,720);
		
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);

        l.setIcon(image);

        l1 = new JLabel("Create An Account");
		l1.setFont(new Font("Felix Titling",Font.BOLD,31));
		l1.setForeground(new Color(0x505050));
		l1.setBounds(753,67,370,42);
		l.add(l1);
		
		l2 = new JLabel("Enter Your Name");
		l2.setFont(new Font("Arial",Font.PLAIN,17));
		l2.setForeground(new Color(0x777777));
		l2.setBounds(754,140,136,21);
		l.add(l2);
		
		l3 = new JLabel("Enter Your Date of Birth (dd/mm/yyyy)");
		l3.setFont(new Font("Arial",Font.PLAIN,17));
		l3.setForeground(new Color(0x777777));
		l3.setBounds(754,215,308,21);
		l.add(l3);
		
		l4 = new JLabel("Enter Your Email");
		l4.setFont(new Font("Arial",Font.PLAIN,17));
		l4.setForeground(new Color(0x777777));
		l4.setBounds(754,290,131,21);
		l.add(l4);
		
		l5 = new JLabel("Choose a Username");
		l5.setFont(new Font("Arial",Font.PLAIN,17));
		l5.setForeground(new Color(0x777777));
		l5.setBounds(754,365,163,21);
		l.add(l5);
		
		l6 = new JLabel("Create Password");
		l6.setFont(new Font("Arial",Font.PLAIN,17));
		l6.setForeground(new Color(0x777777));
		l6.setBounds(754,440,138,21);
		l.add(l6);
		
		l7 = new JLabel("Confirm Password");
		l7.setFont(new Font("Arial",Font.PLAIN,17));
		l7.setForeground(new Color(0x777777));
		l7.setBounds(754,515,147,21);
		l.add(l7);
		
		
		//Enter Your Name TextField
		t1 = new JTextField(); 
		t1.setBounds(754,161,370,49);
		t1.setFont(new Font("Arial",Font.PLAIN,20));
		t1.setForeground(Color.black);
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setBorder(null);
		t1.setOpaque(false);
		l.add(t1);
		tl1 = new JLabel(); tl1.setIcon(textF);
		tl1.setBounds(754,161,370,49);
		l.add(tl1);

		//Enter Your Date of Birth (dd/mm/yyyy) TextField
		t2 = new JTextField(); 
		t2.setBounds(754,236,370,49);
		t2.setFont(new Font("Arial",Font.PLAIN,20));
		t2.setForeground(Color.black);
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setBorder(null);
		t2.setOpaque(false);
		l.add(t2);
		tl2 = new JLabel(); tl2.setIcon(textF);
		tl2.setBounds(754,236,370,49);
		l.add(tl2);
        
		//Enter Your Email TextField
		t3 = new JTextField(); 
		t3.setBounds(754,311,370,49);
		t3.setFont(new Font("Arial",Font.PLAIN,20));
		t3.setForeground(Color.black);
		t3.setHorizontalAlignment(SwingConstants.CENTER);
		t3.setBorder(null);
		t3.setOpaque(false);
		l.add(t3);
		tl3 = new JLabel(); tl3.setIcon(textF);
		tl3.setBounds(754,311,370,49);
		l.add(tl3);
        
		//Choose a Username TextField
		t4 = new JTextField(); 
		t4.setBounds(754,386,370,49);
		t4.setFont(new Font("Arial",Font.PLAIN,20));
		t4.setForeground(Color.black);
		t4.setHorizontalAlignment(SwingConstants.CENTER);
		t4.setBorder(null);
		t4.setOpaque(false);
		l.add(t4);
		tl4 = new JLabel(); tl4.setIcon(textF);
		tl4.setBounds(754,386,370,49);
		l.add(tl4);

 		//Create Password TextField       
		t5 = new JTextField(); 
		t5.setBounds(754,461,370,49);
		t5.setFont(new Font("Arial",Font.PLAIN,20));
		t5.setForeground(Color.black);
		t5.setHorizontalAlignment(SwingConstants.CENTER);
		t5.setBorder(null);
		t5.setOpaque(false);
		l.add(t5);
		tl5 = new JLabel(); tl5.setIcon(textF);
		tl5.setBounds(754,461,370,49);
		l.add(tl5);
        
		//Confirm Password TextField
		t6 = new JTextField(); 
		t6.setBounds(754,536,370,49);
		t6.setFont(new Font("Arial",Font.PLAIN,20));
		t6.setForeground(Color.black);
		t6.setHorizontalAlignment(SwingConstants.CENTER);
		t6.setBorder(null);
		t6.setOpaque(false);
		l.add(t6);
		tl6 = new JLabel(); tl6.setIcon(textF);
		tl6.setBounds(754,536,370,49);
		l.add(tl6);

		//Save button
		b2 = new JButton("Save");
		b2.setFont(new Font("Arial",Font.PLAIN,25));
		b2.setForeground(Color.WHITE);
		b2.setOpaque(false);
		b2.setFocusable(false);
		b2.setBackground(Color.blue);
		b2.setBounds(851,611,176,49);
		b2.setBorderPainted(false);
		b2.addActionListener(this);
		l.add(b2);
		bl2 = new JLabel(new ImageIcon("image\\button\\Save.png"));
		bl2.setBounds(851,611,176,49);
		l.add(bl2);

		//Exit Button
		b3 = new JButton();
		b3.setOpaque(false);
		b3.setFocusable(false);
		b3.setBackground(Color.white);
		b3.setBounds(1234,11,35,35);
		b3.setBorderPainted(false);
		b3.addActionListener(this);
		l.add(b3);
		bl3 = new JLabel(new ImageIcon("image\\button\\Exit.png"));
		bl3.setBounds(1234,11,35,35);
        l.add(bl3);

		//Minimize Button
		b4 = new JButton();
		b4.setOpaque(false);
		b4.setFocusable(false);
		b4.setBackground(Color.white);
		b4.setBounds(1234,51,35,35);
		b4.setBorderPainted(false);
		b4.addActionListener(this);
		l.add(b4);
		bl4 = new JLabel(new ImageIcon("image\\button\\Minimize.png"));
		bl4.setBounds(1234,51,35,35);
        l.add(bl4);

		//Back button
		b5 = new JButton();
		b5.setOpaque(false);
		b5.setFocusable(false);
		b5.setBackground(Color.white);
		b5.setBounds(1234,127,35,35);
		b5.setBorderPainted(false);
		b5.addActionListener(this);
		l.add(b5);
		bl5 = new JLabel(new ImageIcon("image\\button\\Back.png"));
		bl5.setBounds(1234,127,35,35);
        l.add(bl5);


		//SignUp panel
		pl1 = new JLabel(); pl1.setIcon(Lpanel);
		pl1.setBounds(671,25,536,669);
        l.add(pl1);

		//Right title bar
		Tpl = new JLabel(new ImageIcon("image\\panel\\titleP.png"));
		Tpl.setBounds(1228,5,46,710);
        l.add(Tpl);

        this.add(l);



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

			public void mouseDragged(MouseEvent e) {
				Point currCoords = e.getLocationOnScreen();
				setLocation(currCoords.x - LP.x, currCoords.y - LP.y);
			}

			
		});
//__________________________________________________________________________________________________

        
	}

		public void actionPerformed(ActionEvent ae) 
		{
			if(ae.getSource()==b2)
			{
				String fullName = t1.getText();
				String nID = t2.getText();
				String userEmail = t3.getText();
				String userName = t4.getText();
				String userPassword = t5.getText();
				String userPasswordConfirm = t6.getText();

				String filePath = "bin/files/Users.txt";
				String searchString = t4.getText();;
				try {
					File file = new File(filePath);
					Scanner scanner = new Scanner(file);

					for (int lineNumber = 0 ; scanner.hasNextLine() ; lineNumber++) {
						String line = scanner.nextLine();

						if (line.contains(searchString)) {
							String[] value = line.split("\t");
							this.user = value[0];
							this.lineNumber = lineNumber;
						}
					}
					scanner.close();
				} 
					catch (FileNotFoundException e) {
					e.printStackTrace();
				}
	

				if(fullName.isEmpty() ||  nID.isEmpty() || userEmail.isEmpty() || userName.isEmpty() || userPassword.isEmpty() || userPasswordConfirm.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Full Fill All Box");
				}
				else if(userName.equals(this.user))
				{
					JOptionPane.showMessageDialog(null, "Try Diffrent Username");
				}
				else if(userPassword.equals(userPasswordConfirm))
				{
					Account createAccount = new Account(fullName, nID, userEmail, userName, userPassword);
					createAccount.addAccount();
					JOptionPane.showMessageDialog(null, "Account Added");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					t6.setText("");
					
					Login f = new Login();
					this.setVisible(false);
					f.setVisible(true);
	
				}
				else{JOptionPane.showMessageDialog(null, "Check Password");}
	
				
			}
			
			else if(ae.getSource()==b5) //back
			{
				Login f = new Login();
				this.setVisible(false);
				f.setVisible(true);
			}

			
			
			
			
			else if(ae.getSource()==b3) //exit
			{
				System.exit(0);
			}
			else if(ae.getSource()==b4) //minimize
			{
				this.setState(JFrame.ICONIFIED);
			}
		}


}