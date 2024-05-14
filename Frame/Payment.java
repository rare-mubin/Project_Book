package Frame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Payment extends JFrame implements ActionListener {
    JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,lP;
    JLabel pl1,pl2,Tpl; //for panel image
    JLabel bl1,bl2,bl3,bl4,bl5,bl6,tl1,tl2,tl3; //for button and  textfield image
    JTextField t1,t2,t3;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9; 
    
    int lineNumber;

    String userName;
	String PaymentDone = "1";
    String filePath = "bin/files/Users.txt";

    static Point LP;
    
    public Payment(String userName){
        

        this.userName = userName;
        ImageIcon image = new ImageIcon("image\\background\\login_page_L.png");
        ImageIcon textF = new ImageIcon("image\\TextField\\email_pass.png");
        l1 = new JLabel();

        this.setTitle("project_BOOK");
		this.setSize(1280,720);
		
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);

        l1.setIcon(image);

        l3 = new JLabel("ENTER YOUR");
		l3.setFont(new Font("Felix Titling",Font.PLAIN,27));
		l3.setForeground(new Color(0x000000));
		l3.setBounds(147,84,233,42);
		l1.add(l3);

		l16 = new JLabel("CREDENTIAL HERE");
		l16.setFont(new Font("Felix Titling",Font.PLAIN,27));
		l16.setForeground(new Color(0x000000));
		l16.setBounds(96,151,335,42);
		l16.setHorizontalAlignment(SwingConstants.CENTER);
		l1.add(l16);


        l4 = new JLabel("Enter Phone Number or Card Number");
		l4.setFont(new Font("Arial",Font.PLAIN,17));
		l4.setForeground(new Color(0x505050));
		l4.setBounds(79,298,301,21);
		l1.add(l4);

        l5 = new JLabel("Enter Security Code");
		l5.setFont(new Font("Arial",Font.PLAIN,17));
		l5.setForeground(new Color(0x505050));
		l5.setBounds(79,383,162,21);
		l1.add(l5);

        l6 = new JLabel("Enter Your Password");
		l6.setFont(new Font("Arial",Font.PLAIN,17));
		l6.setForeground(new Color(0x505050));
		l6.setBounds(79,468,167,21);
		l1.add(l6);

        //Enter Phone Number or Card Number 
        t1 = new JTextField(); 
		t1.setBounds(79,319,370,49);
		t1.setFont(new Font("Arial",Font.PLAIN,20));
		t1.setForeground(Color.black);
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setBorder(null);
		t1.setOpaque(false);
		l1.add(t1);
		tl1 = new JLabel(); tl1.setIcon(textF);
		tl1.setBounds(79,319,370,49);
		l1.add(tl1);

		//Enter Security Code
		t2 = new JTextField(); 
		t2.setBounds(79,404,370,49);
		t2.setFont(new Font("Arial",Font.PLAIN,20));
		t2.setForeground(Color.black);
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setBorder(null);
		t2.setOpaque(false);
		l1.add(t2);
		tl2 = new JLabel(); tl2.setIcon(textF);
		tl2.setBounds(79,404,370,49);
		l1.add(tl2);
        
		//Enter Your Password
		t3 = new JPasswordField(); 
		t3.setBounds(79,489,370,49);
		t3.setFont(new Font("Arial",Font.PLAIN,20));
		t3.setForeground(Color.black);
		t3.setHorizontalAlignment(SwingConstants.CENTER);
		t3.setBorder(null);
		t3.setOpaque(false);
		l1.add(t3);
		tl3 = new JLabel(); tl3.setIcon(textF);
		tl3.setBounds(79,489,370,49);
		l1.add(tl3);
         

        l8 = new JLabel("PAYMENT");
		l8.setFont(new Font("Felix Titling",Font.PLAIN,27));
		l8.setForeground(new Color(0x000000));
		l8.setBounds(786,51,161,42);
		l1.add(l8);

        l9 = new JLabel("Select a Payment Method");
		l9.setFont(new Font("Arial",Font.PLAIN,17));
		l9.setForeground(new Color(0x505050));
		l9.setBounds(763,172,195,20);
		l1.add(l9);

        l10 = new JLabel("Bkash");
		l10.setFont(new Font("Arial",Font.PLAIN,17));
		l10.setForeground(new Color(0x505050));
		l10.setBounds(672,379,49,20);
		l1.add(l10);

        l11 = new JLabel("Nagad");
		l11.setFont(new Font("Arial",Font.PLAIN,17));
		l11.setForeground(new Color(0x505050));
		l11.setBounds(841,379,51,20);
		l1.add(l11);

        l12 = new JLabel("Card");
		l12.setFont(new Font("Arial",Font.PLAIN,17));
		l12.setForeground(new Color(0x505050));
		l12.setBounds(1018,379,37,20);
		l1.add(l12);

        l13 = new JLabel("Payment Details");
		l13.setFont(new Font("Arial",Font.PLAIN,17));
		l13.setForeground(new Color(0x505050));
		l13.setBounds(801,473,130,21);
		l1.add(l13);

        l14 = new JLabel("1 Month Subscription");
		l14.setFont(new Font("Arial",Font.PLAIN,17));
		l14.setForeground(new Color(0x505050));
		l14.setBounds(643,564,160,20);
		l1.add(l14);

		l17 = new JLabel("of Book Store");
		l17.setFont(new Font("Arial",Font.PLAIN,17));
		l17.setForeground(new Color(0x505050));
		l17.setBounds(669,585,104,20);
		l1.add(l17);


        l15 = new JLabel("TOTAL");
		l15.setFont(new Font("Arial",Font.PLAIN,17));
		l15.setForeground(new Color(0x505050));
		l15.setBounds(963,564,54,20);
		l1.add(l15);

		l18 = new JLabel("999 BDT");
		l18.setFont(new Font("Arial",Font.PLAIN,17));
		l18.setForeground(new Color(0x505050));
		l18.setBounds(956,585,68,20);
		l1.add(l18);


        b1 = new JButton("Submit");
        b1.setFont(new Font("Arial",Font.PLAIN,25));
		b1.setForeground(Color.WHITE);
		b1.setOpaque(false);
		b1.setFocusable(false);
		b1.setBackground(Color.green);
		b1.setBounds(176,574,176,49);
		b1.setBorderPainted(false);
		b1.addActionListener(this);
		l1.add(b1);
        bl1 = new JLabel(new ImageIcon("image\\button\\Save.png"));
		bl1.setBounds(176,574,176,49);
		l1.add(bl1);


		b7= new JButton();
        b7.setFont(new Font("Arial",Font.PLAIN,25));
		b7.setForeground(Color.WHITE);
		b7.setOpaque(false);
		b7.setFocusable(false);
		b7.setBackground(Color.green);
		b7.setBounds(640,258,113,159);
		b7.setBorderPainted(false);
		b7.addActionListener(this);
		l1.add(b7);

		b8 = new JButton();
        b8.setFont(new Font("Arial",Font.PLAIN,25));
		b8.setForeground(Color.WHITE);
		b8.setOpaque(false);
		b8.setFocusable(false);
		b8.setBackground(Color.green);
		b8.setBounds(810,258,113,159);
		b8.setBorderPainted(false);
		b8.addActionListener(this);
		l1.add(b8);

		b9 = new JButton();
        b9.setFont(new Font("Arial",Font.PLAIN,25));
		b9.setForeground(Color.WHITE);
		b9.setOpaque(false);
		b9.setFocusable(false);
		b9.setBackground(Color.green);
		b9.setBounds(980,258,113,159);
		b9.setBorderPainted(false);
		b9.addActionListener(this);
		l1.add(b9);

		
		
       


        
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

        //payment layout
		pl2 = new JLabel(new ImageIcon("image\\panel\\bookP2.png"));
		pl2.setBounds(528,24,678,670);
		l1.add(pl2);

        //CREDENTIAL layout
		pl1 = new JLabel(new ImageIcon("image\\panel\\bookP1.png"));
		pl1.setBounds(26,24,475,670);
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
                String Number = t1.getText();
				String Code = t2.getText();
				String Password = t3.getText();
                Account createAccount = new Account();

                if(Number.isEmpty() || Code.isEmpty() || Password.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Full Fill All Box");
                }

                else if(createAccount.getAccount(userName, Password))
                {
                    try {
                        File file = new File(filePath);
                        Scanner scanner = new Scanner(file);

                        StringBuilder fileContent = new StringBuilder();
                        lineNumber = 0;
                        while (scanner.hasNextLine()) {
                            lineNumber++;
                            String line = scanner.nextLine();

                            if (line.contains(userName)) {
                                String[] values = line.split("\t");
                                values[5] = PaymentDone; 
                                line = String.join("\t", values);
                            }

                            fileContent.append(line).append("\n");
                        }

                        scanner.close();

                        FileWriter writer = new FileWriter(file);
                        writer.write(fileContent.toString());
                        writer.close();

                        JOptionPane.showMessageDialog(null, "Payment Successful");
                        
                        Home f = new Home(this.userName);
                        this.setVisible(false);
                        f.setVisible(true);

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else{JOptionPane.showMessageDialog(null, "Password Incorrect");}
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

            else if(ae.getSource()==b5) //back
			{
				Home f = new Home(this.userName);
				this.setVisible(false);
				f.setVisible(true);
			}

    }
}
