package Frame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Profile extends JFrame implements ActionListener 
{
		JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,lP;
		JLabel pl1,pl2,Tpl; //for panel image
		JLabel bl1,bl2,bl3,bl4,bl5,bl6,tl1,tl2; //for button and  textfield image
		JTextField t1,t2;
		JButton b1,b2,b3,b4,b5,b6; 
		
        int lineNumber;

		String userName;
        String fullName;
        String dateOfBirth;
        String userEmail;
		String projectPath;

		String filePath = "bin/files/Users.txt";
		static Point LP;

	public Profile(String userName)
	{
		this.userName = userName;
		
        String searchString = this.userName;
		try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            for (int lineNumber = 0 ; scanner.hasNextLine() ; lineNumber++) {
                String line = scanner.nextLine();

                if (line.contains(searchString)) {
                    String[] value = line.split("\t");
                    this.fullName = value[3];
                    this.userName = value[0];
                    this.dateOfBirth = value[2];
                    this.userEmail = value[4];
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

		String picpath = "image\\profile\\"+userName+".png";
		
			File file = new File(picpath);
			if (file.exists()){
				lP = new JLabel(new ImageIcon(picpath));
				lP.setBounds(103,245,157,157);
				l1.add(lP);
			}
			else{
				lP = new JLabel(new ImageIcon("image\\profile\\dummy-profile-pic.png"));
				lP.setBounds(103,245,157,157);
				l1.add(lP);
			}
			
        //profile details
        l2 = new JLabel("profile details");
		l2.setFont(new Font("Felix Titling",Font.PLAIN,35));
		l2.setForeground(new Color(0x505050));
		l2.setBounds(674,51,289,42);
		l1.add(l2);

        //full name
		l3 = new JLabel("Full Name");
		l3.setFont(new Font("Arial",Font.PLAIN,32));
		l3.setForeground(new Color(0x505050));
		l3.setBounds(491,234,186,37);
		l1.add(l3);
        //full name er pase
		l4 = new JLabel(fullName);
		l4.setFont(new Font("Arial",Font.PLAIN,32));
		l4.setForeground(new Color(0x505050));
		l4.setBounds(748,234,429,37);
		l1.add(l4);
        //date of birth
        l5 = new JLabel("Date Of Birth");
		l5.setFont(new Font("Arial",Font.PLAIN,24));
		l5.setForeground(new Color(0x505050));
		l5.setBounds(491,339,181,28);
		l1.add(l5);

        //date of birth er paser button
		l6 = new JLabel(dateOfBirth);
		l6.setFont(new Font("Arial",Font.PLAIN,24));
		l6.setForeground(new Color(0x505050));
		l6.setBounds(748,339,429,28);
		l1.add(l6);

        //email
		l7 = new JLabel("Email");
		l7.setFont(new Font("Arial",Font.PLAIN,24));
		l7.setForeground(new Color(0x505050));
		l7.setBounds(491,435,188,28);
		l1.add(l7);

        //email er paser line
		l8 = new JLabel(userEmail);
		l8.setFont(new Font("Arial",Font.PLAIN,24));
		l8.setForeground(new Color(0x505050));
		l8.setBounds(748,435,429,28);
		l1.add(l8);

		//profile link
        l9 = new JLabel("Profile Link");
		l9.setFont(new Font("Arial",Font.PLAIN,24));
		l9.setForeground(new Color(0x505050));
		l9.setBounds(491,531,188,28);
		l1.add(l9);

        //profile er link er paser link
		l10 = new JLabel("https://www.book.com/"+userName+"/");
		l10.setFont(new Font("Arial",Font.PLAIN,24));
		l10.setForeground(new Color(0x505050));
		l10.setBounds(748,531,429,28);
		l1.add(l10);
        
		//username
        l13 = new JLabel(userName);
		l13.setFont(new Font("Arial",Font.PLAIN,32));
		l13.setForeground(new Color(0x505050));
		l13.setHorizontalAlignment(JLabel.CENTER);
		l13.setBounds(47,445,270,37);
		l1.add(l13);

		//Edit profile button
		b2 = new JButton("Update Profile");
		b2.setFont(new Font("Arial",Font.PLAIN,20));
		b2.setForeground(Color.WHITE);
		b2.setOpaque(false);
		b2.setFocusable(false);
		b2.setBackground(Color.white);
		b2.setBounds(698,625,176,49);
		b2.setBorderPainted(false);
		b2.addActionListener(this);
		l1.add(b2);
		bl2 = new JLabel(new ImageIcon("image\\button\\Login_Sign.png"));
		bl2.setBounds(698,625,176,49);
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

		//right profile details er niche
        pl1 = new JLabel(new ImageIcon("image\\panel\\profile2.png"));
		pl1.setBounds(366,24,840,670);
		l1.add(pl1);

		//username er nicher ta
		pl2 = new JLabel(new ImageIcon("image\\panel\\profile1.png"));
		pl2.setBounds(26,24,311,670);
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

			if(ae.getSource()==b2)
			{
				ProfileEdit f = new ProfileEdit(userName);
				this.setVisible(false);
				f.setVisible(true);
			}

            else if(ae.getSource()==b3) //exit
			{
				this.setVisible(false);
			}

			else if(ae.getSource()==b4) //minimize
			{
				this.setState(JFrame.ICONIFIED);
			}

            else if(ae.getSource()==b5) //back
			{
				this.setVisible(false);
			}
		}

    
}
