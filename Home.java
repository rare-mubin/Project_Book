import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Home extends JFrame implements ActionListener
{
		JLabel l,l1,l2,l3,l4,l5,l6,l7,lP;
		JLabel pl1,Tpl; //for panel image
		JLabel bl1,bl2,bl3,bl4,bl5,bl6,tl1,tl2; //for button and  textfield image
		JTextField t1,t2;
		JButton b1,b2,b3,b4,b5,b6,b7; 
		int lineNumber;

		String userName;
        String fullName;


		static Point LP;

	public Home(String userName)
	{
		this.userName = userName;
		String filePath = "bin/files/Users.txt";
        String searchString = this.userName;
		try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            for (int lineNumber = 0 ; scanner.hasNextLine() ; lineNumber++) {
                String line = scanner.nextLine();

                if (line.contains(searchString)) {
                    String[] value = line.split("\t");
                    this.fullName = value[3];
					this.lineNumber= lineNumber;
                }
            }
            scanner.close();
        } 
			catch (FileNotFoundException e) {
            e.printStackTrace();
        }

		
        ImageIcon image = new ImageIcon("image\\background\\login_page_L.png");
        l1 = new JLabel();

        this.setTitle("project_BOOK");
		this.setSize(1280,720);
		
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);

        l1.setIcon(image);

		l = new JLabel(fullName);
		l.setFont(new Font("Felix Titling",Font.BOLD,36));
		l.setForeground(new Color(0x505050));
		l.setBounds(369,78,713,42);
		l1.add(l);

		l4 = new JLabel("Welcome To The Online Book Store");
		l4.setFont(new Font("Felix Titling",Font.BOLD,32));
		l4.setForeground(new Color(0x505050));
		l4.setBounds(369,137,713,42);
		l1.add(l4);

		//profile button 1
		b7 = new JButton();
		b7.setOpaque(false);
		b7.setFocusable(false);
		b7.setBackground(Color.white);
		b7.setBounds(170,53,157,157);
		b7.setBorderPainted(false);
		b7.addActionListener(this);
		l1.add(b7);
		lP = new JLabel(new ImageIcon("image\\profile\\dummy-profile-pic.png"));
		lP.setBounds(170,53,157,157);
        l1.add(lP);


        l6 = new JLabel("BOOK Store");
		l6.setFont(new Font("Felix Titling",Font.PLAIN,32));
		l6.setForeground(new Color(0x505050));
		l6.setBounds(219,620,209,37);
		l1.add(l6);

        l7 = new JLabel("MY Collection");
		l7.setFont(new Font("Felix Titling",Font.PLAIN,32));
		l7.setForeground(new Color(0x505050));
		l7.setBounds(772,620,263,37);
		l1.add(l7);
        
		//BookShop Button
		b1 = new JButton();
		b1.setOpaque(false);
		b1.setFocusable(false);
		b1.setBackground(Color.white);
		b1.setBounds(53,290,542,377);
		b1.setBorderPainted(false);
		b1.addActionListener(this);
		l1.add(b1);
		bl1 = new JLabel(new ImageIcon("image\\button\\BookShop.png"));
		bl1.setBounds(53,290,542,377);
		l1.add(bl1);
        
		//MyCollection Button
        b2 = new JButton();
		b2.setOpaque(false);
		b2.setFocusable(false);
		b2.setBackground(Color.white);
		b2.setBounds(633,290,542,377);
		b2.setBorderPainted(false);
		b2.addActionListener(this);
		l1.add(b2);
		bl2 = new JLabel(new ImageIcon("image\\button\\MyCollection.png"));
		bl2.setBounds(633,290,542,377);
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

		//profile image
		l3 = new JLabel();
		l3.setBounds(170,53,157,157);
		l1.add(l3);
		
		//uper panel
		l2 = new JLabel(new ImageIcon("image\\panel\\HomeU.png"));
		l2.setBounds(26,25,1179,213);
		l1.add(l2);

		//Lower panel
		l5 = new JLabel(new ImageIcon("image\\panel\\HomeB.png"));
		l5.setBounds(26,264,1179,430);
		l1.add(l5);

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

			if(ae.getSource()==b2) 
			{
				myfile d=new myfile(this.userName);
				this.setVisible(false);
				d.setVisible(true);
			}
			else if(ae.getSource()==b1) 
			{
				BookS b=new BookS(this.userName);
				this.setVisible(false);
				b.setVisible(true);
			}

			else if(ae.getSource()==b1) //back
			{
				BookS f = new BookS(this.userName);
				this.setVisible(false);
				f.setVisible(true);
			}

			 else if(ae.getSource()==b5) //back
			{
				Login f = new Login();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b7) //profile1
			{
				Profile f = new Profile(userName);
				f.setVisible(true);
			}
			else if(ae.getSource()==b6) //profile2
			{
				Profile f = new Profile(userName);
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