import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;

public class myfile extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5,l6,l7;
		JLabel pl1,Tpl; //for panel image
		JLabel bl1,bl2,bl3,bl4,bl5,tl1,tl2; //for button and  textfield image
		JTextField t1,t2;
		JButton b1,b2,b3,b4,b5; 

		String name;
		static Point LP;
		
	public myfile(String name)
	{
		this.name = name;
        
		//ImageIcon Lpanel = new ImageIcon("image\\panel\\loginP.png");
		//ImageIcon log_sign = new ImageIcon("image\\button\\Login_Sign.png");
		//ImageIcon textF = new ImageIcon("image\\TextField\\email_pass.png");
        l1 = new JLabel();

        this.setTitle("project_BOOK");
		this.setSize(1280,720);
		
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);
        
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
					/*if(ae.getSource()==b1)
					{
						String userName =t1.getText();
						String userPassword = t2.getText();
						Account createAccount = new Account();
					
						 if(createAccount.getAccount(userName, userPassword))
						{
							JOptionPane.showMessageDialog(null,"Login Successful");
							Home f = new Home();
							this.setVisible(false);
							f.setVisible(true);
			
						}
						else{JOptionPane.showMessageDialog(null, "Check UserName/Password");}
					
						
					}*/
		
					if(ae.getSource()==b5) //back
					{
						Home f = new Home(this.name);
						this.setVisible(false);
						f.setVisible(true);
					}
		
					
					
					 if(ae.getSource()==b3) //exit
					{
						System.exit(0);
					}
		
					else if(ae.getSource()==b4) //minimize
					{
						this.setState(JFrame.ICONIFIED);
					}
				}
		
		
		}
		