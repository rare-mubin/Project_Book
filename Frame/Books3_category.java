package Frame;
import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Books3_category extends JFrame implements ActionListener
{
		JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
		JLabel pl1,pl2,Tpl; //for panel image
		JLabel bl1,bl2,bl3,bl4,bl5,bl6,tl1,tl2; //for button and  textfield image
		JTextField t1,t2;
		JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16; 

		static Point LP;
		String payment;
		String userName;
		String filePath = "bin/files/Users.txt";
		int lineNumber;

	public Books3_category(String userName,String payment)
	{
		this.payment = payment;
		this.userName = userName;
        ImageIcon image = new ImageIcon("image\\background\\f4.png");
        l1 = new JLabel();

        this.setTitle("project_BOOK");
		this.setSize(1280,720);
		
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);

        l1.setIcon(image);
		//Catagory1
		b1 = new JButton("Science Fiction");
		b1.setFont(new Font("Arial",Font.PLAIN,25));
		b1.setOpaque(false);
		b1.setFocusable(false);
		b1.setBackground(Color.white);
		b1.setBounds(54,56,246,45);
		b1.setBorderPainted(false);
		b1.addActionListener(this);
		l1.add(b1);
		l2 = new JLabel();
		l2.setBounds(54,56,246,45);
		l1.add(l2);
        //Catagory 2
		b2 = new JButton("Academic");
		b2.setFont(new Font("Arial",Font.PLAIN,25));
		b2.setOpaque(false);
		b2.setFocusable(false);
		b2.setBackground(Color.white);
		b2.setBounds(54,128,246,45);
		b2.setBorderPainted(false);
		b2.addActionListener(this);
		l1.add(b2);
		l3 = new JLabel();
		l3.setBounds(54,128,246,45);
		l1.add(l3);
        //Catagory 3
		b7 = new JButton("Horror");
		b7.setFont(new Font("Arial",Font.PLAIN,25));
		b7.setOpaque(false);
		b7.setFocusable(false);
		b7.setBackground(Color.white);
		b7.setBounds(54,200,246,45);
		b7.setBorderPainted(false);
		b7.addActionListener(this);
		l1.add(b7);
		l4 = new JLabel();
		l4.setBounds(54,200,246,45);
		l1.add(l4);
        //Catagory 4
		b8 = new JButton("Programming");
		b8.setFont(new Font("Arial",Font.PLAIN,25));
		b8.setOpaque(false);
		b8.setFocusable(false);
		b8.setBackground(Color.white);
		b8.setBounds(54,272,246,45);
		b8.setBorderPainted(false);
		b8.addActionListener(this);
		l1.add(b8);
		l5 = new JLabel("");
		l5.setBounds(54,272,246,45);
		l1.add(l5);


		//Book1
		b9 = new JButton();
		b9.setOpaque(false);
		b9.setFocusable(false);
		b9.setBackground(Color.white);
		b9.setBounds(377,55,169,279);
		b9.setBorderPainted(false);
		b9.addActionListener(this);
		l1.add(b9);
		l7 = new JLabel(new ImageIcon("image\\Book\\Book7.2.png"));
		l7.setBounds(377,55,169,279);
		l1.add(l7);
        //Book 2
		b10 = new JButton();
		b10.setOpaque(false);
		b10.setFocusable(false);
		b10.setBackground(Color.white);
		b10.setBounds(588,55,169,279);
		b10.setBorderPainted(false);
		b10.addActionListener(this);
		l1.add(b10);
		l8 = new JLabel(new ImageIcon("image\\Book\\Book8.2.png"));
		l8.setBounds(588,55,169,279);
		l1.add(l8);
        //Book3
		b11 = new JButton();
		b11.setOpaque(false);
		b11.setFocusable(false);
		b11.setBackground(Color.white);
		b11.setBounds(799,55,169,279);
		b11.setBorderPainted(false);
		b11.addActionListener(this);
		l1.add(b11);
		l9 = new JLabel();
		l9.setBounds(799,55,169,279);
		l1.add(l9);
        //Book4
		b12 = new JButton();
		b12.setOpaque(false);
		b12.setFocusable(false);
		b12.setBackground(Color.white);
		b12.setBounds(1010,55,169,279);
		b12.setBorderPainted(false);
		b12.addActionListener(this);
		l1.add(b12);
		l10 = new JLabel();
		l10.setBounds(1010,55,169,279);
		l1.add(l10);
        //Book 5
		b13 = new JButton();
		b13.setOpaque(false);
		b13.setFocusable(false);
		b13.setBackground(Color.white);
		b13.setBounds(377,386,169,279);
		b13.setBorderPainted(false);
		b13.addActionListener(this);
		l1.add(b13);
		l11 = new JLabel();
		l11.setBounds(377,386,169,279);
		l1.add(l11);
        //Book6
		b14 = new JButton();
		b14.setOpaque(false);
		b14.setFocusable(false);
		b14.setBackground(Color.white);
		b14.setBounds(588,386,169,279);
		b14.setBorderPainted(false);
		b14.addActionListener(this);
		l1.add(b14);
		l12 = new JLabel();
		l12.setBounds(588,386,169,279);
		l1.add(l12);
		//Book 7
		b15 = new JButton();
		b15.setOpaque(false);
		b15.setFocusable(false);
		b15.setBackground(Color.white);
		b15.setBounds(799,386,169,279);
		b15.setBorderPainted(false);
		b15.addActionListener(this);
		l1.add(b15);
		l13 = new JLabel();
		l13.setBounds(799,386,169,279);
		l1.add(l13);
        //Book8
		b16 = new JButton();
		b16.setOpaque(false);
		b16.setFocusable(false);
		b16.setBackground(Color.white);
		b16.setBounds(1010,386,169,279);
		b16.setBorderPainted(false);
		b16.addActionListener(this);
		l1.add(b16);
		l14 = new JLabel();
		l14.setBounds(1010,386,169,279);
		l1.add(l14);

		if(payment.equals("1"))
		{
			l15 = new JLabel("You Have 30 days Subscription");
			l15.setFont(new Font("Arial",Font.BOLD,12));
			l15.setForeground(new Color(0x850000));
			l15.setBounds(92,618,178,14);
			l1.add(l15);
	
			b6 = new JButton("Cancel Sub");
			b6.setFont(new Font("Arial",Font.PLAIN,12));
			b6.setForeground(Color.WHITE);
			b6.setOpaque(false);
			b6.setFocusable(false);
			b6.setBackground(Color.white);
			b6.setBounds(119,642,125,28);
			b6.setBorderPainted(false);
			b6.addActionListener(this);
			l1.add(b6);
			bl6 = new JLabel(new ImageIcon("image\\button\\Cancelsubmission.png"));
			bl6.setBounds(119,642,125,28);
			l1.add(bl6);
		}

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

		pl1 = new JLabel("");
		pl1.setBounds(26,25,301,669);
		l1.add(pl1);

		pl2 = new JLabel("");
		pl2.setBounds(350,25,855,669);
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



			if(ae.getSource()==b5) //back
			{
				Home f = new Home(this.userName);
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b1)//category1
			{
				Books1_category f = new Books1_category(this.userName,this.payment);
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b2)//category2
			{
				Books2_category f = new Books2_category(this.userName,this.payment);
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b7)//category3
			{
				Books3_category f = new Books3_category(this.userName,this.payment);
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b8)//category4
			{
				Books4_category f = new Books4_category(this.userName,this.payment);
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b9)//Book1
			{
				Book7 f = new Book7(this.userName);
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b10)//Book2
			{
				Book8 f = new Book8(this.userName);
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b11)//Book3
			{
				
			}
			else if(ae.getSource()==b12)//Book4
			{
				
			}
			else if(ae.getSource()==b13)//Book5
			{
				
			}
			else if(ae.getSource()==b14)//Book6
			{
				
			}
			else if(ae.getSource()==b15)//Book7
			{
				
			}
			else if(ae.getSource()==b16)//Book8
			{
				
			}
			else if(ae.getSource()==b6)
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
                                values[5] = "0"; 
                                line = String.join("\t", values);
                            }

                            fileContent.append(line).append("\n");
                        }

                        scanner.close();

                        FileWriter writer = new FileWriter(file);
                        writer.write(fileContent.toString());
                        writer.close();

                        JOptionPane.showMessageDialog(null, "Subscription Cancel Successful");

                        Home f = new Home(this.userName);
                        this.setVisible(false);
                        f.setVisible(true);

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
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