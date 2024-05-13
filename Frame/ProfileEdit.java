package Frame;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ProfileEdit extends JFrame implements ActionListener 
{
		JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,lP;
		JLabel pl1,pl2,Tpl; //for panel image
		JLabel bl1,bl2,bl3,bl4,bl5,bl6,tl1,tl2,tl3,tl4,tl5; //for button and  textfield image
		JTextField t1,t2,t3,t4,t5;
		JButton b1,b2,b3,b4,b5,b6,b7,b8; 
		
        int lineNumber;

		String userName;
        String fullName;
        String dateOfBirth;
        String userEmail;
		String userPassword;
		String projectPath;

		String filePath = "bin/files/Users.txt";
		static Point LP;

	public ProfileEdit(String userName)
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
					this.userPassword = value[1];
                    this.lineNumber= lineNumber;
                }
            }
            scanner.close();
        } 
			catch (FileNotFoundException e) {
            e.printStackTrace();
        }

		
        ImageIcon image = new ImageIcon("image\\background\\login_page_L.png");
		ImageIcon textF = new ImageIcon("image\\TextField\\profiletextfield.png");
		ImageIcon textf = new ImageIcon("image\\TextField\\profiletextfield2.png");
		ImageIcon button = new ImageIcon("image\\button\\button.png");
		ImageIcon button1 = new ImageIcon("image\\button\\profilebutton.png");
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
      
		// full name textfield
		t1 = new JTextField(); 
		t1.setBounds(748,239,223,36);
		t1.setFont(new Font("Arial",Font.PLAIN,20));
		t1.setForeground(Color.black);
		t1.setText(fullName);
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setBorder(null);
		t1.setOpaque(false);
		l1.add(t1);
		tl1 = new JLabel(textF);
		tl1.setBounds(748,239,223,36);
		l1.add(tl1);
        //Change name Button
		b1 = new JButton("Change Name");
		b1.setFont(new Font("Arial",Font.PLAIN,14));
		b1.setForeground(Color.WHITE);
		b1.setOpaque(false);
		b1.setFocusable(false);
		b1.setBackground(Color.blue);
		b1.setBounds(978,239,125,36);
		b1.setBorderPainted(false);
		b1.addActionListener(this);
		l1.add(b1);
		bl1 = new JLabel(button);
		bl1.setBounds(978,239,125,36);
		l1.add(bl1);
        
        //date of birth
        l5 = new JLabel("Date Of Birth");
		l5.setFont(new Font("Arial",Font.PLAIN,24));
		l5.setForeground(new Color(0x505050));
		l5.setBounds(491,339,181,28);
		l1.add(l5);

		//change DateofBirth
		t2 = new JTextField(); 
		t2.setBounds(748,335,223,36);
		t2.setFont(new Font("Arial",Font.PLAIN,20));
		t2.setForeground(Color.black);
		t2.setText(dateOfBirth);
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setBorder(null);
		t2.setOpaque(false);
		l1.add(t2);
		tl2 = new JLabel(textF);
		tl2.setBounds(748,335,223,36);
		l1.add(tl2);
        //Change DOB
		b2 = new JButton("Change DOB");
		b2.setFont(new Font("Arial",Font.PLAIN,14));
		b2.setForeground(Color.WHITE);
		b2.setOpaque(false);
		b2.setFocusable(false);
		b2.setBackground(Color.blue);
		b2.setBounds(978,335,125,36);
		b2.setBorderPainted(false);
		b2.addActionListener(this);
		l1.add(b2);
		bl2 = new JLabel(button);
		bl2.setBounds(978,335,125,36);
		l1.add(bl2);
		
		//email
		l7 = new JLabel("Email");
		l7.setFont(new Font("Arial",Font.PLAIN,24));
		l7.setForeground(new Color(0x505050));
		l7.setBounds(491,435,188,28);
		l1.add(l7);

        //change email
		t3 = new JTextField(); 
		t3.setBounds(748,431,223,36);
		t3.setFont(new Font("Arial",Font.PLAIN,20));
		t3.setForeground(Color.black);
		t3.setText(userEmail);
		t3.setHorizontalAlignment(SwingConstants.CENTER);
		t3.setBorder(null);
		t3.setOpaque(false);
		l1.add(t3);
		tl3 = new JLabel(textF);
		tl3.setBounds(748,431,223,36);
		l1.add(tl3);
        //Change Email
		b7 = new JButton("Change Email");
		b7.setFont(new Font("Arial",Font.PLAIN,14));
		b7.setForeground(Color.WHITE);
		b7.setOpaque(false);
		b7.setFocusable(false);
		b7.setBackground(Color.blue);
		b7.setBounds(978,431,125,36);
		b7.setBorderPainted(false);
		b7.addActionListener(this);
		l1.add(b7);
		bl3 = new JLabel(button);
		bl3.setBounds(978,431,125,36);
		l1.add(bl3);

		//profile link
        l9 = new JLabel("Profile Link");
		l9.setFont(new Font("Arial",Font.PLAIN,24));
		l9.setForeground(new Color(0x505050));
		l9.setBounds(491,531,188,28);
		l1.add(l9);

        //profile Link
		l10 = new JLabel("https://www.book.com/"+userName+"/");
		l10.setFont(new Font("Arial",Font.PLAIN,24));
		l10.setForeground(new Color(0x505050));
		l10.setBounds(748,531,429,28);
		l1.add(l10);
        //Enter your old pass
		l11 = new JLabel("Enter Your Old Password");
		l11.setFont(new Font("Arial",Font.PLAIN,15));
		l11.setForeground(new Color(0x777777));
		l11.setBounds(504,606,176,18);
		l1.add(l11);
        //pld pass text field
		t4 = new JPasswordField(); 
		t4.setBounds(480,627,223,28);
		t4.setFont(new Font("Arial",Font.PLAIN,20));
		t4.setForeground(Color.black);
		t4.setHorizontalAlignment(SwingConstants.CENTER);
		t4.setBorder(null);
		t4.setOpaque(false);
		l1.add(t4);
		tl4 = new JLabel(textf);
		tl4.setBounds(480,627,223,28);
		l1.add(tl4);
        //Enter new pass
		l12 = new JLabel("Enter Your New Password");
		l12.setFont(new Font("Arial",Font.PLAIN,15));
		l12.setForeground(new Color(0x777777));
		l12.setBounds(743,606,184,18);
		l1.add(l12);
        //new pass textfield
		t5 = new JTextField(); 
		t5.setBounds(723,627,223,28);
		t5.setFont(new Font("Arial",Font.PLAIN,20));
		t5.setForeground(Color.black);
		t5.setHorizontalAlignment(SwingConstants.CENTER);
		t5.setBorder(null);
		t5.setOpaque(false);
		l1.add(t5);
		tl5 = new JLabel(textf);
		tl5.setBounds(723,627,223,28);
		l1.add(tl5);
        //update pass
		b8 = new JButton();
		b8.setFont(new Font("Arial",Font.PLAIN,12));
		b8.setForeground(Color.WHITE);
		b8.setOpaque(false);
		b8.setFocusable(false);
		b8.setBackground(Color.white);
		b8.setBounds(966,627,125,28);
		b8.setBorderPainted(false);
		b8.addActionListener(this);
		l1.add(b8);
		bl4 = new JLabel(button1);
		bl4.setBounds(966,627,125,28);
        l1.add(bl4);
        
		//username
        l13 = new JLabel(userName);
		l13.setFont(new Font("Arial",Font.PLAIN,32));
		l13.setForeground(new Color(0x505050));
		l13.setHorizontalAlignment(JLabel.CENTER);
		l13.setBounds(47,445,270,37);
		l1.add(l13);

		//upload pic 
		b6 = new JButton("Upload Picture");
		b6.setFont(new Font("Arial",Font.PLAIN,13));
		b6.setForeground(Color.WHITE);
		b6.setOpaque(false);
		b6.setFocusable(false);
		b6.setBackground(Color.white);
		b6.setBounds(119,624,125,36);
		b6.setBorderPainted(false);
		b6.addActionListener(this);
		l1.add(b6);
		bl4 = new JLabel(new ImageIcon("image\\button\\button.png"));
		bl4.setBounds(119,624,125,36);
        l1.add(bl4);
        
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

			if(ae.getSource()==b6)//profile pic uplod
			{
				JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
				int result = fileChooser.showOpenDialog(null);

				if (result == JFileChooser.APPROVE_OPTION) {
					File selectedFile = fileChooser.getSelectedFile();
					projectPath = System.getProperty("user.dir");
					Path sourcePath = Paths.get(selectedFile.getAbsolutePath());
					Path destinationPath = Paths.get("image\\profile\\", selectedFile.getName());

					try {
						Files.copy(sourcePath, destinationPath);
						JOptionPane.showMessageDialog(null,"Profile Picture Upload Successful");
					} catch (IOException e) {
						JOptionPane.showMessageDialog(null,"Error Uploading file: " + e.getMessage());
					}
				}
				ProfileEdit f = new ProfileEdit(userName);
				this.setVisible(false);
				f.setVisible(true);
				
			}

			//Change name Button
			else if(ae.getSource()==b1)
			{
				String name = t1.getText();
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
                                values[3] = name; 
                                line = String.join("\t", values);
                            }

                            fileContent.append(line).append("\n");
                        }

                        scanner.close();

                        FileWriter writer = new FileWriter(file);
                        writer.write(fileContent.toString());
                        writer.close();

                        JOptionPane.showMessageDialog(null, "Name Change Successful");
                        

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
			}

			else if(ae.getSource()==b2)
			{
				String DOB = t2.getText();
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
                                values[2] = DOB; 
                                line = String.join("\t", values);
                            }

                            fileContent.append(line).append("\n");
                        }

                        scanner.close();

                        FileWriter writer = new FileWriter(file);
                        writer.write(fileContent.toString());
                        writer.close();

                        JOptionPane.showMessageDialog(null, "Date of Birth Change Successful");
                        

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
			}

			else if(ae.getSource()==b7)
			{
				String email = t3.getText();
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
                                values[4] = email; 
                                line = String.join("\t", values);
                            }

                            fileContent.append(line).append("\n");
                        }

                        scanner.close();

                        FileWriter writer = new FileWriter(file);
                        writer.write(fileContent.toString());
                        writer.close();

                        JOptionPane.showMessageDialog(null, "Email Change Successful");
                        

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
			}
			else if(ae.getSource()==b8)
			{
				String oldPassword = t4.getText();
				String newPassword = t5.getText();
				
				if(oldPassword.isEmpty() || newPassword.isEmpty()){
					JOptionPane.showMessageDialog(null, "Full Fill Old Password And New Password Box");
				}
				else if(oldPassword.equals(this.userPassword))
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
                                values[1] = newPassword; 
                                line = String.join("\t", values);
                            }

                            fileContent.append(line).append("\n");
                        }

                        scanner.close();

                        FileWriter writer = new FileWriter(file);
                        writer.write(fileContent.toString());
                        writer.close();

                        JOptionPane.showMessageDialog(null, "Password Change Successful");
                        

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Your old password is wrong");
				}
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
				Profile f = new Profile(userName);
				this.setVisible(false);
				f.setVisible(true);
			}
		}

    
}
