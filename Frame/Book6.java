package Frame;
import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;

public class Book6 extends JFrame implements ActionListener 
{
		JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,lP;
		JLabel pl1,pl2,Tpl; //for panel image
		JLabel bl1,bl2,bl3,bl4,bl5,bl6,tl1,tl2; //for button and  textfield image
		JTextField t1,t2;
		JButton b1,b2,b3,b4,b5,b6; 
		
        int lineNumber;

		String userName;
        String ISBN="P-0078";


		static Point LP;

	public Book6(String userName)
	{
		this.userName = userName;

        ImageIcon image = new ImageIcon("image\\background\\login_page_L.png");
        l1 = new JLabel();

        this.setTitle("project_BOOK");
		this.setSize(1280,720);
		
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);

        l1.setIcon(image);

        //Book Details
        l2 = new JLabel("Book Details");
		l2.setFont(new Font("Felix Titling",Font.PLAIN,35));
		l2.setForeground(new Color(0x505050));
		l2.setBounds(736,51,260,42);
		l1.add(l2);
        //book name  
		l3 = new JLabel("Book Name");
		l3.setFont(new Font("Arial",Font.PLAIN,32));
		l3.setForeground(new Color(0x00000));
		l3.setBounds(603,215,168,37);
		l1.add(l3);
        //Author
		l4 = new JLabel("Author");
		l4.setFont(new Font("Arial",Font.PLAIN,24));
		l4.setForeground(new Color(0x00000));
		l4.setBounds(603,296,71,28);
		l1.add(l4);
        //Addition
		l5 = new JLabel("Addition");
		l5.setFont(new Font("Arial",Font.PLAIN,24));
		l5.setForeground(new Color(0x00000));
		l5.setBounds(603,368,87,28);
		l1.add(l5);
        //Category
		l6 = new JLabel("Category");
		l6.setFont(new Font("Arial",Font.PLAIN,24));
		l6.setForeground(new Color(0x00000));
		l6.setBounds(603,440,98,28);
		l1.add(l6);
        //BOOK ISBN
		l7 = new JLabel("BOOK ISBN");
		l7.setFont(new Font("Arial",Font.PLAIN,24));
		l7.setForeground(new Color(0x00000));
		l7.setBounds(603,512,133,28);
		l1.add(l7);
        //Book name (Super Nova0
		l8 = new JLabel("Python Basics:A Practical Introduction to Python 3");
		l8.setFont(new Font("Arial",Font.PLAIN,32));
		l8.setForeground(new Color(0x00000));
		l8.setBounds(860,215,329,37);
		l1.add(l8);
        //Author name (okay)
		l9 = new JLabel("David Amos");
		l9.setFont(new Font("Arial",Font.PLAIN,24));
		l9.setForeground(new Color(0x00000));
		l9.setBounds(860,296,329,28);
		l1.add(l9);
        //Addition no( 12th addition )
		l10 = new JLabel("4th Addition");
		l10.setFont(new Font("Arial",Font.PLAIN,24));
		l10.setForeground(new Color(0x00000));
		l10.setBounds(860,368,329,28);
		l1.add(l10);
        //Category-(Si-fi)
		l11 = new JLabel("Programming");
		l11.setFont(new Font("Arial",Font.PLAIN,24));
		l11.setForeground(new Color(0x00000));
		l11.setBounds(860,440,329,28);
		l1.add(l11);
        //ISBN NO- AFT34
		l12 = new JLabel(ISBN);
		l12.setFont(new Font("Arial",Font.PLAIN,24));
		l12.setForeground(new Color(0x00000));
		l12.setBounds(860,512,329,28);
		l1.add(l12);
        
        //Add to my collection Button
		b2 = new JButton("Add to my collection");
		b2.setFont(new Font("Arial",Font.PLAIN,17));
		b2.setForeground(Color.WHITE);
		b2.setOpaque(false);
		b2.setFocusable(false);
		b2.setBackground(Color.green);
		b2.setBounds(739,610,256,49);
		b2.setBorderPainted(false);
		b2.addActionListener(this);
		l1.add(b2);
		bl2 = new JLabel(new ImageIcon("image\\button\\add_collection.png"));
		bl2.setBounds(739,610,256,49);
        l1.add(bl2);
		
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

        //Book image label
		pl1 = new JLabel(new ImageIcon("image\\panel\\Book6.png"));
		pl1.setBounds(26,24,475,670);
        l1.add(pl1);
        //book Details label
		pl2 = new JLabel(new ImageIcon("image\\panel\\bookP2.png"));
		pl2.setBounds(528,24,678,670);
        l1.add(pl2);

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

            if(ae.getSource()==b3) //exit
			{
				System.exit(0);
			}

			else if (ae.getSource()==b2)
			{
				Slot f=new Slot(this.userName,ISBN);
				this.setVisible(true);
				f.setVisible(true);
			}

			else if(ae.getSource()==b4) //minimize
			{
				this.setState(JFrame.ICONIFIED);
			}
            else if(ae.getSource()==b5) //back
			{
				BookS f = new BookS(this.userName);
				this.setVisible(false);
				f.setVisible(true);
			}
            else if(ae.getSource()==b6) //profile
			{
				Profile f = new Profile(userName);
				f.setVisible(true);
			}
		}

    
}
