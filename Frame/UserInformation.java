package Frame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;


public class UserInformation extends JFrame implements ActionListener {
        JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34,l35,l36,l37,l38,l39,l40,l41,l42,l43,l44,l45,l46,l47,l48,l49,l50,lP;
		JLabel pl1,pl2,Tpl; //for panel image
		JLabel bl1,bl2,bl3,bl4,bl5,bl6,tl1,tl2; //for button and  textfield image
		JTextField t1,t2;
		JButton b1,b2,b3,b4,b5,b6; 
		
        int lineNumber;

		String userName;


		String[] UserName = {"__","__","__","__","__","__","__","__"};
		String[] fullName = {"__","__","__","__","__","__","__","__"};
		String[] dateOfBirth = {"__","__","__","__","__","__","__","__"};
		String[] userEmail = {"__","__","__","__","__","__","__","__"};

		String filePath = "bin/files/Users.txt";
		Path path = Paths.get("bin/files/Users.txt");
		static Point LP;

    public UserInformation(String userName){
		this.userName = userName;
		try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            for (int lineNumber = 0 ; scanner.hasNextLine() ; lineNumber++) {
                String line = scanner.nextLine();
				String[] value = line.split("\t");

                    this.fullName[lineNumber] = value[3];
                    this.UserName[lineNumber] = value[0];
                    this.dateOfBirth[lineNumber] = value[2];
                    this.userEmail[lineNumber] = value[4];
                    this.lineNumber = lineNumber;
                
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

        l4 = new JLabel("USERS INFORMATION");
		l4.setFont(new Font("Felix Titling",Font.PLAIN,34));
		l4.setForeground(new Color(0x505050));
		l4.setBounds(427,53,377,42);
		l4.setHorizontalAlignment(SwingConstants.CENTER);
		l1.add(l4);

		l = new JLabel("User Name");
		l.setFont(new Font("Arial",Font.PLAIN,15));
		l.setForeground(new Color(0x00000));
		l.setBounds(173,118,76,17);
		l1.add(l);

		l2 = new JLabel("Full Name");
		l2.setFont(new Font("Arial",Font.PLAIN,15));
		l2.setForeground(new Color(0x00000));
		l2.setBounds(447,118,69,17);
		l1.add(l2);

		l3 = new JLabel("Date of Birth");
		l3.setFont(new Font("Arial",Font.PLAIN,15));
		l3.setForeground(new Color(0x00000));
		l3.setBounds(707,118,87,17);
		l1.add(l3);

		l5 = new JLabel("Email Address");
		l5.setFont(new Font("Arial",Font.PLAIN,15));
		l5.setForeground(new Color(0x00000));
		l5.setBounds(972,118,96,17);
		l1.add(l5);

		l6 = new JLabel("1");
		l6.setFont(new Font("Arial",Font.PLAIN,16));
		l6.setForeground(new Color(0x00000));
		l6.setBounds(62,155,9,18);
		l1.add(l6);
        //username1
		l7 = new JLabel(UserName[0]);
		l7.setFont(new Font("Arial",Font.PLAIN,15));
		l7.setHorizontalAlignment(SwingConstants.CENTER);
		l7.setForeground(new Color(0x00000));
		l7.setBounds(88,141,246,45);
		l1.add(l7);
        
		//fulname1
		l8 = new JLabel(fullName[0]);
		l8.setFont(new Font("Arial",Font.PLAIN,15));
		l8.setHorizontalAlignment(SwingConstants.CENTER);
		l8.setForeground(new Color(0x00000));
		l8.setBounds(358,141,246,45);
		l1.add(l8);

        //dateofbirth1
		l9 = new JLabel(dateOfBirth[0]);
		l9.setFont(new Font("Arial",Font.PLAIN,15));
		l9.setHorizontalAlignment(SwingConstants.CENTER);
		l9.setForeground(new Color(0x00000));
		l9.setBounds(628,141,246,45);
		l1.add(l9);

        //emailadrees1
		l10 = new JLabel(userEmail[0]);
		l10.setFont(new Font("Arial",Font.PLAIN,15));
		l10.setHorizontalAlignment(SwingConstants.CENTER);
		l10.setForeground(new Color(0x00000));
		l10.setBounds(898,141,246,45);
		l1.add(l10);

		l11 = new JLabel("2");
		l11.setFont(new Font("Arial",Font.PLAIN,16));
		l11.setForeground(new Color(0x00000));
		l11.setBounds(62,206,9,18);
		l1.add(l11);
        
		//username2
		l12 = new JLabel(UserName[1]);
		l12.setFont(new Font("Arial",Font.PLAIN,15));
		l12.setHorizontalAlignment(SwingConstants.CENTER);
		l12.setForeground(new Color(0x00000));
		l12.setBounds(88,192,246,45);
		l1.add(l12);

        //fulname2
		l13 = new JLabel(fullName[1]);
		l13.setFont(new Font("Arial",Font.PLAIN,15));
		l13.setHorizontalAlignment(SwingConstants.CENTER);
		l13.setForeground(new Color(0x00000));
		l13.setBounds(358,192,246,45);
		l1.add(l13);

        //dateofbirth2
		l14 = new JLabel(dateOfBirth[1]);
		l14.setFont(new Font("Arial",Font.PLAIN,15));
		l14.setHorizontalAlignment(SwingConstants.CENTER);
		l14.setForeground(new Color(0x00000));
		l14.setBounds(628,192,246,45);
		l1.add(l14);

        //eamiladress2
		l15 = new JLabel(userEmail[1]);
		l15.setFont(new Font("Arial",Font.PLAIN,15));
		l15.setHorizontalAlignment(SwingConstants.CENTER);
		l15.setForeground(new Color(0x00000));
		l15.setBounds(898,192,246,45);
		l1.add(l15);

		l16 = new JLabel("3");
		l16.setFont(new Font("Arial",Font.PLAIN,15));
		l16.setForeground(new Color(0x00000));
		l16.setBounds(62,257,9,18);
		l1.add(l16);

		//username3
		l17 = new JLabel(UserName[2]);
		l17.setFont(new Font("Arial",Font.PLAIN,15));
		l17.setHorizontalAlignment(SwingConstants.CENTER);
		l17.setForeground(new Color(0x00000));
		l17.setBounds(88,243,246,45);
		l1.add(l17);

		//fullname3
		l18 = new JLabel(fullName[2]);
		l18.setFont(new Font("Arial",Font.PLAIN,15));
		l18.setHorizontalAlignment(SwingConstants.CENTER);
		l18.setForeground(new Color(0x00000));
		l18.setBounds(358,243,246,45);
		l1.add(l18);

		//dateofbirth3
		l19 = new JLabel(dateOfBirth[2]);
		l19.setFont(new Font("Arial",Font.PLAIN,15));
		l19.setHorizontalAlignment(SwingConstants.CENTER);
		l19.setForeground(new Color(0x00000));
		l19.setBounds(628,243,246,45);
		l1.add(l19);

		//emaileadress3
		l20 = new JLabel(userEmail[2]);
		l20.setFont(new Font("Arial",Font.PLAIN,15));
		l20.setHorizontalAlignment(SwingConstants.CENTER);
		l20.setForeground(new Color(0x00000));
		l20.setBounds(898,243,246,45);
		l1.add(l20);

		l21 = new JLabel("4");
		l21.setFont(new Font("Arial",Font.PLAIN,15));
		l21.setForeground(new Color(0x00000));
		l21.setBounds(62,308,9,18);
		l1.add(l21);

        //username4
		l22 = new JLabel(UserName[3]);
		l22.setFont(new Font("Arial",Font.PLAIN,15));
		l22.setHorizontalAlignment(SwingConstants.CENTER);
		l22.setForeground(new Color(0x00000));
		l22.setBounds(88,294,246,45);
		l1.add(l22);

		//fullname4
		l23 = new JLabel(fullName[3]);
		l23.setFont(new Font("Arial",Font.PLAIN,15));
		l23.setHorizontalAlignment(SwingConstants.CENTER);
		l23.setForeground(new Color(0x00000));
		l23.setBounds(358,294,246,45);
		l1.add(l23);

		//dateofbirth4
		l24 = new JLabel(dateOfBirth[3]);
		l24.setFont(new Font("Arial",Font.PLAIN,15));
		l24.setHorizontalAlignment(SwingConstants.CENTER);
		l24.setForeground(new Color(0x00000));
		l24.setBounds(628,294,246,45);
		l1.add(l24);

		//emailadress4
		l25 = new JLabel(userEmail[3]);
		l25.setFont(new Font("Arial",Font.PLAIN,15));
		l25.setHorizontalAlignment(SwingConstants.CENTER);
		l25.setForeground(new Color(0x00000));
		l25.setBounds(898,294,246,45);
		l1.add(l25);

		l26 = new JLabel("5");
		l26.setFont(new Font("Arial",Font.PLAIN,15));
		l26.setForeground(new Color(0x00000));
		l26.setBounds(62,359,9,18);
		l1.add(l26);

		//username5
		l27 = new JLabel(UserName[4]);
		l27.setFont(new Font("Arial",Font.PLAIN,15));
		l27.setHorizontalAlignment(SwingConstants.CENTER);
		l27.setForeground(new Color(0x00000));
		l27.setBounds(88,345,246,45);
		l1.add(l27);

		//fullname5
		l28 = new JLabel(fullName[4]);
		l28.setFont(new Font("Arial",Font.PLAIN,15));
		l28.setHorizontalAlignment(SwingConstants.CENTER);
		l28.setForeground(new Color(0x00000));
		l28.setBounds(358,345,246,45);
		l1.add(l28);

		//dateofbirth5
		l29 = new JLabel(dateOfBirth[4]);
		l29.setFont(new Font("Arial",Font.PLAIN,15));
		l29.setHorizontalAlignment(SwingConstants.CENTER);
		l29.setForeground(new Color(0x00000));
		l29.setBounds(628,345,246,45);
		l1.add(l29);

		//emailaddress5
		l30 = new JLabel(userEmail[4]);
		l30.setFont(new Font("Arial",Font.PLAIN,15));
		l30.setHorizontalAlignment(SwingConstants.CENTER);
		l30.setForeground(new Color(0x00000));
		l30.setBounds(898,345,246,45);
		l1.add(l30);

		l31 = new JLabel("6");
		l31.setFont(new Font("Arial",Font.PLAIN,16));
		l31.setForeground(new Color(0x00000));
		l31.setBounds(62,410,9,18);
		l1.add(l31);

		//username6
		l32 = new JLabel(UserName[5]);
		l32.setFont(new Font("Arial",Font.PLAIN,15));
		l32.setHorizontalAlignment(SwingConstants.CENTER);
		l32.setForeground(new Color(0x00000));
		l32.setBounds(88,396,246,45);
		l1.add(l32);

		//fullname6
		l33 = new JLabel(fullName[5]);
		l33.setFont(new Font("Arial",Font.PLAIN,15));
		l33.setHorizontalAlignment(SwingConstants.CENTER);
		l33.setForeground(new Color(0x00000));
		l33.setBounds(358,396,246,45);
		l1.add(l33);

		//dateofbirth6
		l34 = new JLabel(dateOfBirth[5]);
		l34.setFont(new Font("Arial",Font.PLAIN,15));
		l34.setHorizontalAlignment(SwingConstants.CENTER);
		l34.setForeground(new Color(0x00000));
		l34.setBounds(628,396,246,45);
		l1.add(l34);

		//emailadress6
		l35 = new JLabel(userEmail[5]);
		l35.setFont(new Font("Arial",Font.PLAIN,15));
		l35.setHorizontalAlignment(SwingConstants.CENTER);
		l35.setForeground(new Color(0x00000));
		l35.setBounds(898,396,246,45);
		l1.add(l35);

		l36 = new JLabel("7");
		l36.setFont(new Font("Arial",Font.PLAIN,16));
		l36.setForeground(new Color(0x00000));
		l36.setBounds(62,469,9,18);
		l1.add(l36);

		//username7
		l37 = new JLabel(UserName[6]);
		l37.setFont(new Font("Arial",Font.PLAIN,15));
		l37.setHorizontalAlignment(SwingConstants.CENTER);
		l37.setForeground(new Color(0x00000));
		l37.setBounds(88,455,246,45);
		l1.add(l37);

		//fullname7
		l38 = new JLabel(fullName[6]);
		l38.setFont(new Font("Arial",Font.PLAIN,15));
		l38.setHorizontalAlignment(SwingConstants.CENTER);
		l38.setForeground(new Color(0x00000));
		l38.setBounds(358,455,246,45);
		l1.add(l38);

		//dateofbirth7
		l39 = new JLabel(dateOfBirth[6]);
		l39.setFont(new Font("Arial",Font.PLAIN,15));
		l39.setHorizontalAlignment(SwingConstants.CENTER);
		l39.setForeground(new Color(0x00000));
		l39.setBounds(628,455,246,45);
		l1.add(l39);

		//emailadress7
		l40 = new JLabel(userEmail[6]);
		l40.setFont(new Font("Arial",Font.PLAIN,15));
		l40.setHorizontalAlignment(SwingConstants.CENTER);
		l40.setForeground(new Color(0x00000));
		l40.setBounds(898,455,246,45);
		l1.add(l40);

		l41 = new JLabel("8");
		l41.setFont(new Font("Arial",Font.PLAIN,16));
		l41.setForeground(new Color(0x00000));
		l41.setBounds(62,526,9,18);
		l1.add(l41);
    
		//username8
		l42 = new JLabel(userEmail[7]);
		l42.setFont(new Font("Arial",Font.PLAIN,15));
		l42.setHorizontalAlignment(SwingConstants.CENTER);
		l42.setForeground(new Color(0x00000));
		l42.setBounds(88,514,246,45);
		l1.add(l42);

		//fullname8
		l43 = new JLabel(fullName[7]);
		l43.setFont(new Font("Arial",Font.PLAIN,15));
		l43.setHorizontalAlignment(SwingConstants.CENTER);
		l43.setForeground(new Color(0x00000));
		l43.setBounds(358,514,246,45);
		l1.add(l43);

		//dateofbirth8
		l44 = new JLabel(dateOfBirth[7]);
		l44.setFont(new Font("Arial",Font.PLAIN,15));
		l44.setHorizontalAlignment(SwingConstants.CENTER);
		l44.setForeground(new Color(0x00000));
		l44.setBounds(628,514,246,45);
		l1.add(l44);

			if(userName.equals("mubin"))
			{
				//emailadress8
				l45 = new JLabel(userEmail[7]);
				l45.setFont(new Font("Arial",Font.PLAIN,15));
				l45.setHorizontalAlignment(SwingConstants.CENTER);
				l45.setForeground(new Color(0x00000));
				l45.setBounds(898,514,246,45);
				l1.add(l45);

				l46 = new JLabel("User Serial");
				l46.setFont(new Font("Arial",Font.PLAIN,15));
				l46.setForeground(new Color(0x00000));
				l46.setBounds(273,582,75,17);
				l1.add(l46);

				//userserial textfile
				t1 = new JTextField(); 
				t1.setBounds(249,604,124,49);
				t1.setFont(new Font("Arial",Font.PLAIN,20));
				t1.setForeground(Color.black);
				t1.setHorizontalAlignment(SwingConstants.CENTER);
				t1.setBorder(null);
				t1.setOpaque(false);
				l1.add(t1);
				tl1 = new JLabel(new ImageIcon("image\\TextField\\user.png"));
				tl1.setBounds(249,604,124,49);
				l1.add(tl1);

				l47 = new JLabel("Admin Password");
				l47.setFont(new Font("Arial",Font.PLAIN,15));
				l47.setForeground(new Color(0x00000));
				l47.setBounds(533,582,113,17);
				l1.add(l47);

				//adminpassword textfield
				t2 = new JPasswordField(); 
				t2.setBounds(405,604,370,49);
				t2.setFont(new Font("Arial",Font.PLAIN,20));
				t2.setForeground(Color.black);
				t2.setHorizontalAlignment(SwingConstants.CENTER);
				t2.setBorder(null);
				t2.setOpaque(false);
				l1.add(t2);
				tl2 = new JLabel(new ImageIcon("image\\TextField\\email_pass.png"));
				tl2.setBounds(405,604,370,49);
				l1.add(tl2);

				//remove
				b1= new JButton("REMOVE");
				b1.setFont(new Font("Arial",Font.PLAIN,15));
				b1.setForeground(Color.WHITE);
				b1.setOpaque(false);
				b1.setFocusable(false);
				b1.setBackground(Color.blue);
				b1.setBounds(807,604,176,49);
				b1.setBorderPainted(false);
				b1.addActionListener(this);
				l1.add(b1);
				bl1 = new JLabel(new ImageIcon("image\\button\\Save.png"));
				bl1.setBounds(807,604,176,49);
				l1.add(bl1);
			}
        


        
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

		l48 = new JLabel(new ImageIcon("image\\panel\\userdata.png"));
		l48.setBounds(26,24,1180,670);
		l1.add(l48);

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
				Profile f = new Profile(this.userName);
				this.setVisible(true);
				f.setVisible(true);
			}

			else if(ae.getSource()==b1)
			{
				String userSerial = t1.getText();
				String num = t1.getText();
				String adminPassword = t2.getText();

				int LineNumber = Integer.parseInt(userSerial);
				LineNumber -= 1;

				if(num.isEmpty() || adminPassword.isEmpty()){
					JOptionPane.showMessageDialog(null,"Full Fill User Serial and Admin Password");
				}

				else if(adminPassword.equals("1234"))
				{
					try {
					List<String> lines = Files.readAllLines(path);
					lines.remove(LineNumber);
					Files.write(path, lines);
					JOptionPane.showMessageDialog(null,"User Remove Successful");
					} catch (IOException e) {
					JOptionPane.showMessageDialog(null,"ERROR");
					}
				}
				else{JOptionPane.showMessageDialog(null,"User Password is Wrong");}

				UserInformation f = new UserInformation("mubin");
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
				if(userName.equals("dipon"))
				{
					Home f = new Home(this.userName);
					this.setVisible(false);
					f.setVisible(true);
				}
				else if(userName.equals("mubin"))
				{
					AdminHome f = new AdminHome(this.userName);
					this.setVisible(false);
					f.setVisible(true);
				}
				
			}
		}
    
}
