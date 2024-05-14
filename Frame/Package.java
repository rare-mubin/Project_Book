package Frame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Package extends JFrame implements ActionListener {
        JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,lP;
		JLabel pl1,pl2,Tpl; //for panel image
		JLabel bl1,bl2,bl3,bl4,bl5,bl6,tl1,tl2; //for button and  textfield image
		JTextField t1,t2;
		JButton b1,b2,b3,b4,b5,b6; 
		
        int lineNumber;

		String userName;
		static Point LP;

    public Package(String userName){

        this.userName = userName;

		
        ImageIcon image = new ImageIcon("image\\background\\FP1.png");
        l1 = new JLabel();

        this.setTitle("project_BOOK");
		this.setSize(1280,720);
		
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);

        l1.setIcon(image);

        l4 = new JLabel("SELECT A SUBSCRIPTION PACKAGE");
		l4.setFont(new Font("Felix Titling",Font.BOLD,34));
		l4.setForeground(new Color(0x505050));
		l4.setBounds(321,59,589,42);
		l4.setHorizontalAlignment(SwingConstants.CENTER);
		l1.add(l4);

        b1 = new JButton();//slot 1
		b1.setFont(new Font("Arial",Font.PLAIN,25));
		b1.setForeground(Color.WHITE);
		b1.setOpaque(false);
		b1.setFocusable(false);
		b1.setBackground(Color.blue);
		b1.setBounds(91,166,326,460);
		b1.setBorderPainted(false);
		b1.addActionListener(this);
		l1.add(b1);
		bl1 = new JLabel();
		bl1.setBounds(91,166,326,460);
		l1.add(bl1);

        b2 = new JButton();//slot 2
		b2.setFont(new Font("Arial",Font.PLAIN,25));
		b2.setForeground(Color.WHITE);
		b2.setOpaque(false);
		b2.setFocusable(false);
		b2.setBackground(Color.blue);
		b2.setBounds(453,166,326,460);
		b2.setBorderPainted(false);
		b2.addActionListener(this);
		l1.add(b2);
		bl2 = new JLabel();
		bl2.setBounds(453,166,326,460);
		l1.add(bl2);

        b3 = new JButton();//slot 3
		b3.setFont(new Font("Arial",Font.PLAIN,25));
		b3.setForeground(Color.WHITE);
		b3.setOpaque(false);
		b3.setFocusable(false);
		b3.setBackground(Color.blue);
		b3.setBounds(815,166,326,460);
		b3.setBorderPainted(false);
		b3.addActionListener(this);
		l1.add(b3);
		bl3 = new JLabel();
		bl3.setBounds(815,166,326,460);
		l1.add(bl3);
        
        //profile button
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

		l2 = new JLabel();
		l2.setBounds(26,24,1180,670);
		l1.add(l2);

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

			if(ae.getSource()==b6) //profile
			{
				Profile f = new Profile(userName);
				f.setVisible(true);
			}

			else if(ae.getSource()==b2)
			{
				Payment f = new Payment(userName);
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

            else if(ae.getSource()==b5) //back
			{
				Home f = new Home(this.userName);
				this.setVisible(false);
				f.setVisible(true);
			}
		}
    
}
