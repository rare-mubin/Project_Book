package Frame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class MyFile extends JFrame implements ActionListener {
        JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,lP;
		JLabel pl1,pl2,Tpl; //for panel image
		JLabel B1[] = new JLabel[8],B2[] = new JLabel[8],B3[] = new JLabel[8];//book image lable
		JLabel bl1,bl2,bl3,bl4,bl5,bl6,bl7,bl8,bl9,tl1,tl2; //for button and  textfield image
		JTextField t1,t2;
		JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,ab; 
		
        int lineNumber;

		String BookISBN[] = {"","",""};
		String filePath = "bin/files/Users.txt";
		String Book[] = {"","","","","","","",""};

		String userName;
		static Point LP;

    public MyFile(String userName){

        this.userName = userName;

		String searchString = this.userName;
		try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            for (int lineNumber = 0 ; scanner.hasNextLine() ; lineNumber++) {
                String line = scanner.nextLine();

                if (line.contains(searchString)) {
                    String[] value = line.split("\t");
                    this.BookISBN[0] = value[6];
                    this.BookISBN[1] = value[7];
                    this.BookISBN[2] = value[8];
                    this.lineNumber= lineNumber;
                }
            }
            scanner.close();
        } 
			catch (FileNotFoundException e) {
            e.printStackTrace();
        }

		
		Book[0] = "BookPdf\\Si-2509.pdf";
		Book[1] = "BookPdf\\Si-001G.pdf";
		Book[2] = "BookPdf\\DIC34.pdf";
		Book[3] = "BookPdf\\Si-281X.pdf";
		Book[4] = "BookPdf\\P-0077.pdf";
		Book[5] = "BookPdf\\P-0078.pdf";
		Book[6] = "BookPdf\\P-9729.pdf";
		Book[7] = "BookPdf\\H-R90R.pdf";
		
        ImageIcon image = new ImageIcon("image\\background\\login_page_L.png");
		ImageIcon button1 = new ImageIcon("image\\button\\removeButton.png");
		ImageIcon Bookimg1 = new ImageIcon("image\\Book\\Book1.png");
		ImageIcon Bookimg2 = new ImageIcon("image\\Book\\Book2.png");
		ImageIcon Bookimg3 = new ImageIcon("image\\Book\\Book3.png");
		ImageIcon Bookimg4 = new ImageIcon("image\\Book\\Book4.png");
		ImageIcon Bookimg5 = new ImageIcon("image\\Book\\Book5.png");
		ImageIcon Bookimg6 = new ImageIcon("image\\Book\\Book6.png");
		ImageIcon Bookimg7 = new ImageIcon("image\\Book\\Book7.png");
		ImageIcon Bookimg8 = new ImageIcon("image\\Book\\Book8.png");
        l1 = new JLabel();

        this.setTitle("project_BOOK");
		this.setSize(1280,720);
		
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);

        l1.setIcon(image);

        l4 = new JLabel("My Book Collection");
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

				//Slot1 Image

				//Book 1
				if(BookISBN[0].equals("Si-2509")){
					B1[0] = new JLabel(Bookimg1);
					B1[0].setBounds(91,166,326,460);
					l1.add(B1[0]);
				}
				//Book 2
				else if(BookISBN[0].equals("Si-001G")){
					B1[1] = new JLabel(Bookimg2);
					B1[1].setBounds(91,166,326,460);
					l1.add(B1[1]);
				}
				//Book 3
				else if(BookISBN[0].equals("DIC34")){
					B1[2] = new JLabel(Bookimg3);
					B1[2].setBounds(91,166,326,460);
					l1.add(B1[2]);
				}
				//Book 4
				else if(BookISBN[0].equals("Si-281X")){
					B1[3] = new JLabel(Bookimg4);
					B1[3].setBounds(91,166,326,460);
					l1.add(B1[3]);
				}
				//Book 5
				else if(BookISBN[0].equals("P-0077")){
					B1[4] = new JLabel(Bookimg5);
					B1[4].setBounds(91,166,326,460);
					l1.add(B1[4]);
				}
				//Book 6
				else if(BookISBN[0].equals("P-0078")){
					B1[5] = new JLabel(Bookimg6);
					B1[5].setBounds(91,166,326,460);
					l1.add(B1[5]);
				}
				//Book 7
				else if(BookISBN[0].equals("P-9729")){
					B1[6] = new JLabel(Bookimg7);
					B1[6].setBounds(91,166,326,460);
					l1.add(B1[6]);
				}
				//Book 8
				else if(BookISBN[0].equals("H-R90R")){
					B1[7] = new JLabel(Bookimg8);
					B1[7].setBounds(91,166,326,460);
					l1.add(B1[7]);
				}


				//Slot2 Image

				//Book 1
				if(BookISBN[1].equals("Si-2509")){
					B2[0] = new JLabel(Bookimg1);
					B2[0].setBounds(453,166,326,460);
					l1.add(B2[0]);
				}
				//Book 2
				else if(BookISBN[1].equals("Si-001G")){
					B2[1] = new JLabel(Bookimg2);
					B2[1].setBounds(453,166,326,460);
					l1.add(B2[1]);
				}
				//Book 3
				else if(BookISBN[1].equals("DIC34")){
					B2[2] = new JLabel(Bookimg3);
					B2[2].setBounds(453,166,326,460);
					l1.add(B2[2]);
				}
				//Book 4
				else if(BookISBN[1].equals("Si-281X")){
					B2[3] = new JLabel(Bookimg4);
					B2[3].setBounds(453,166,326,460);
					l1.add(B2[3]);
				}
				//Book 5
				else if(BookISBN[1].equals("P-0077")){
					B2[4] = new JLabel(Bookimg5);
					B2[4].setBounds(453,166,326,460);
					l1.add(B2[4]);
				}
				//Book 6
				else if(BookISBN[1].equals("P-0078")){
					B2[5] = new JLabel(Bookimg6);
					B2[5].setBounds(453,166,326,460);
					l1.add(B2[5]);
				}
				//Book 7
				else if(BookISBN[1].equals("P-9729")){
					B2[6] = new JLabel(Bookimg7);
					B2[6].setBounds(453,166,326,460);
					l1.add(B2[6]);
				}
				//Book 8
				else if(BookISBN[1].equals("H-R90R")){
					B2[7] = new JLabel(Bookimg8);
					B2[7].setBounds(453,166,326,460);
					l1.add(B2[7]);
				}


				//Slot3 Image

				//Book 1
				if(BookISBN[2].equals("Si-2509")){
					B3[0] = new JLabel(Bookimg1);
					B3[0].setBounds(815,166,326,460);
					l1.add(B3[0]);
				}
				//Book 2
				else if(BookISBN[2].equals("Si-001G")){
					B3[1] = new JLabel(Bookimg2);
					B3[1].setBounds(815,166,326,460);
					l1.add(B3[1]);
				}
				//Book 3
				else if(BookISBN[2].equals("DIC34")){
					B3[2] = new JLabel(Bookimg3);
					B3[2].setBounds(815,166,326,460);
					l1.add(B3[2]);
				}
				//Book 4
				else if(BookISBN[2].equals("Si-281X")){
					B3[3] = new JLabel(Bookimg4);
					B3[3].setBounds(815,166,326,460);
					l1.add(B3[3]);
				}
				//Book 5
				else if(BookISBN[2].equals("P-0077")){
					B3[4] = new JLabel(Bookimg5);
					B3[4].setBounds(815,166,326,460);
					l1.add(B3[4]);
				}
				//Book 6
				else if(BookISBN[2].equals("P-0078")){
					B3[5] = new JLabel(Bookimg6);
					B3[5].setBounds(815,166,326,460);
					l1.add(B3[5]);
				}
				//Book 7
				else if(BookISBN[2].equals("P-9729")){
					B3[6] = new JLabel(Bookimg7);
					B3[6].setBounds(815,166,326,460);
					l1.add(B3[6]);
				}
				//Book 8
				else if(BookISBN[2].equals("H-R90R")){
					B3[7] = new JLabel(Bookimg8);
					B3[7].setBounds(815,166,326,460);
					l1.add(B3[7]);
				}

		// remove Button 1
		b8 = new JButton("Remove");
		b8.setFont(new Font("Arial",Font.PLAIN,12));
		b8.setForeground(Color.WHITE);
		b8.setOpaque(false);
		b8.setFocusable(false);
		b8.setBackground(Color.white);
		b8.setBounds(191,646,125,28);
		b8.setBorderPainted(false);
		b8.addActionListener(this);
		l1.add(b8);
		bl7 = new JLabel(button1);
		bl7.setBounds(191,646,125,28);
		l1.add(bl7);

		// remove Button 2
		b9 = new JButton("Remove");
		b9.setFont(new Font("Arial",Font.PLAIN,12));
		b9.setForeground(Color.WHITE);
		b9.setOpaque(false);
		b9.setFocusable(false);
		b9.setBackground(Color.white);
		b9.setBounds(553,646,125,28);
		b9.setBorderPainted(false);
		b9.addActionListener(this);
		l1.add(b9);
		bl8 = new JLabel(button1);
		bl8.setBounds(553,646,125,28);
		l1.add(bl8);

		// remove Button 3
		b10 = new JButton("Remove");
		b10.setFont(new Font("Arial",Font.PLAIN,12));
		b10.setForeground(Color.WHITE);
		b10.setOpaque(false);
		b10.setFocusable(false);
		b10.setBackground(Color.white);
		b10.setBounds(915,646,125,28);
		b10.setBorderPainted(false);
		b10.addActionListener(this);
		l1.add(b10);
		bl9 = new JLabel(button1);
		bl9.setBounds(915,646,125,28);
		l1.add(bl9);
				
        
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
		b7 = new JButton();
		b7.setOpaque(false);
		b7.setFocusable(false);
		b7.setBackground(Color.white);
		b7.setBounds(1234,11,35,35);
		b7.setBorderPainted(false);
		b7.addActionListener(this);
		l1.add(b7);
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

		//about button
		ab = new JButton();
		ab.setOpaque(false);
		ab.setFocusable(false);
		ab.setBackground(Color.white);
		ab.setBounds(1234,673,35,35);
		ab.setBorderPainted(false);
		ab.addActionListener(this);
		l1.add(ab);
		JLabel AB = new JLabel(new ImageIcon("image\\button\\about.png"));
		AB.setBounds(1234,673,35,35);
        l1.add(AB);

		l2 = new JLabel(new ImageIcon("image\\panel\\PanelSlot.png"));
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

			else if(ae.getSource()==b1)//Slot 1 Button
			{
				//Book 1
				if(BookISBN[0].equals("Si-2509")){
					try {
						File myFile = new File(Book[0]);
						Desktop.getDesktop().open(myFile);
					} catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "error");
					}
				}
				//Book 2
				else if(BookISBN[0].equals("Si-001G")){
					try {
						File myFile = new File(Book[1]);
						Desktop.getDesktop().open(myFile);
					} catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "error");
					}
				}
				//Book 3
				else if(BookISBN[0].equals("DIC34")){
					try {
						File myFile = new File(Book[2]);
						Desktop.getDesktop().open(myFile);
					} catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "error");
					}
				}
				//Book 4
				else if(BookISBN[0].equals("Si-281X")){
					try {
						File myFile = new File(Book[3]);
						Desktop.getDesktop().open(myFile);
					} catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "error");
					}
				}
				//Book 5
				else if(BookISBN[0].equals("P-0077")){
					try {
						File myFile = new File(Book[4]);
						Desktop.getDesktop().open(myFile);
					} catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "error");
					}
				}
				//Book 6
				else if(BookISBN[0].equals("P-0078")){
					try {
						File myFile = new File(Book[5]);
						Desktop.getDesktop().open(myFile);
					} catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "error");
					}
				}
				//Book 7
				else if(BookISBN[0].equals("P-9729")){
					try {
						File myFile = new File(Book[6]);
						Desktop.getDesktop().open(myFile);
					} catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "error");
					}
				}
				//Book 8
				else if(BookISBN[0].equals("H-R90R")){
					try {
						File myFile = new File(Book[7]);
						Desktop.getDesktop().open(myFile);
					} catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "error");
					}
				}
			}
			else if(ae.getSource()==b2)//Slot 2 Button
			{
				//Book 1
				if(BookISBN[1].equals("Si-2509")){
					try {
						File myFile = new File(Book[0]);
						Desktop.getDesktop().open(myFile);
					} catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "error");
					}
				}
				//Book 2
				else if(BookISBN[1].equals("Si-001G")){
					try {
						File myFile = new File(Book[1]);
						Desktop.getDesktop().open(myFile);
					} catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "error");
					}
				}
				//Book 3
				else if(BookISBN[1].equals("DIC34")){
					try {
						File myFile = new File(Book[2]);
						Desktop.getDesktop().open(myFile);
					} catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "error");
					}
				}
				//Book 4
				else if(BookISBN[1].equals("Si-281X")){
					try {
						File myFile = new File(Book[3]);
						Desktop.getDesktop().open(myFile);
					} catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "error");
					}
				}
				//Book 5
				else if(BookISBN[1].equals("P-0077")){
					try {
						File myFile = new File(Book[4]);
						Desktop.getDesktop().open(myFile);
					} catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "error");
					}
				}
				//Book 6
				else if(BookISBN[1].equals("P-0078")){
					try {
						File myFile = new File(Book[5]);
						Desktop.getDesktop().open(myFile);
					} catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "error");
					}
				}
				//Book 7
				else if(BookISBN[1].equals("P-9729")){
					try {
						File myFile = new File(Book[6]);
						Desktop.getDesktop().open(myFile);
					} catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "error");
					}
				}
				//Book 8
				else if(BookISBN[1].equals("H-R90R")){
					try {
						File myFile = new File(Book[7]);
						Desktop.getDesktop().open(myFile);
					} catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "error");
					}
				}
			}
			else if(ae.getSource()==b3)//Slot 3 Button
			{
				//Book 1
				if(BookISBN[2].equals("Si-2509")){
					try {
						File myFile = new File(Book[0]);
						Desktop.getDesktop().open(myFile);
					} catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "error");
					}
				}
				//Book 2
				else if(BookISBN[2].equals("Si-001G")){
					try {
						File myFile = new File(Book[1]);
						Desktop.getDesktop().open(myFile);
					} catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "error");
					}
				}
				//Book 3
				else if(BookISBN[2].equals("DIC34")){
					try {
						File myFile = new File(Book[2]);
						Desktop.getDesktop().open(myFile);
					} catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "error");
					}
				}
				//Book 4
				else if(BookISBN[2].equals("Si-281X")){
					try {
						File myFile = new File(Book[3]);
						Desktop.getDesktop().open(myFile);
					} catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "error");
					}
				}
				//Book 5
				else if(BookISBN[2].equals("P-0077")){
					try {
						File myFile = new File(Book[4]);
						Desktop.getDesktop().open(myFile);
					} catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "error");
					}
				}
				//Book 6
				else if(BookISBN[2].equals("P-0078")){
					try {
						File myFile = new File(Book[5]);
						Desktop.getDesktop().open(myFile);
					} catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "error");
					}
				}
				//Book 7
				else if(BookISBN[2].equals("P-9729")){
					try {
						File myFile = new File(Book[6]);
						Desktop.getDesktop().open(myFile);
					} catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "error");
					}
				}
				//Book 8
				else if(BookISBN[2].equals("H-R90R")){
					try {
						File myFile = new File(Book[7]);
						Desktop.getDesktop().open(myFile);
					} catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "error");
					}
				}
			}

			else if(ae.getSource()==b8)
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
									values[6] = "aa"; 
									line = String.join("\t", values);
								}
	
								fileContent.append(line).append("\n");
							}
	
							scanner.close();
	
							FileWriter writer = new FileWriter(file);
							writer.write(fileContent.toString());
							writer.close();
	
						JOptionPane.showMessageDialog(null, "Book Remove Successful");
	
						} catch (FileNotFoundException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						}
						MyFile f = new MyFile(this.userName);
						this.setVisible(false);
						f.setVisible(true);
			}

			else if(ae.getSource()==b9)
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
									values[7] = "aa"; 
									line = String.join("\t", values);
								}
	
								fileContent.append(line).append("\n");
							}
	
							scanner.close();
	
							FileWriter writer = new FileWriter(file);
							writer.write(fileContent.toString());
							writer.close();
	
						JOptionPane.showMessageDialog(null, "Book Remove Successful");
	
						} catch (FileNotFoundException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						}
						MyFile f = new MyFile(this.userName);
						this.setVisible(false);
						f.setVisible(true);
			}

			else if(ae.getSource()==b10)
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
									values[8] = "aa"; 
									line = String.join("\t", values);
								}
	
								fileContent.append(line).append("\n");
							}
	
							scanner.close();
	
							FileWriter writer = new FileWriter(file);
							writer.write(fileContent.toString());
							writer.close();
	
						JOptionPane.showMessageDialog(null, "Book Remove Successful");
	
						} catch (FileNotFoundException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						}
						MyFile f = new MyFile(this.userName);
						this.setVisible(false);
						f.setVisible(true);
			}
			else if(ae.getSource()==ab) //about
			{
				About c=new About();
				c.setVisible(true);
			}
			
            else if(ae.getSource()==b7) //exit
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
