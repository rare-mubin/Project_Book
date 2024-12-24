package Frame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class About extends JFrame implements ActionListener {
        JLabel l1,l2;
		JLabel Tpl; //for panel image
		JLabel bl3; //for button
		JButton b3; 

    public About(){

		
        ImageIcon image = new ImageIcon("image/background/login_page_L.png");
        l1 = new JLabel();

        this.setTitle("project_BOOK");
		this.setSize(1280,720);
		
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);

        l1.setIcon(image);

        l2 = new JLabel(new ImageIcon("image/panel/about.png"));
		l2.setFont(new Font("Felix Titling",Font.BOLD,32));
		l2.setForeground(new Color(0x505050));
		l2.setBounds(78,68,1075,626);
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l1.add(l2);

		//Exit Button
		b3 = new JButton();
		b3.setOpaque(false);
		b3.setFocusable(false);
		b3.setBackground(Color.white);
		b3.setBounds(1234,11,35,35);
		b3.setBorderPainted(false);
		b3.addActionListener(this);
		l1.add(b3);
		bl3 = new JLabel(new ImageIcon("image/button/Exit.png"));
		bl3.setBounds(1234,11,35,35);
        l1.add(bl3);


		l2 = new JLabel(new ImageIcon("image/panel/aboutB.png"));
		l2.setBounds(26,24,1180,670);
		l1.add(l2);

		//right title bar
		Tpl = new JLabel(new ImageIcon("image/panel/titleP.png"));
		Tpl.setBounds(1228,5,46,710);
        l1.add(Tpl);

        //this.add(p1);
        this.add(l1);

        
	}

		public void actionPerformed(ActionEvent ae) 
		{


            if(ae.getSource()==b3) //exit
			{
				this.setVisible(false);
			}

		}
    
}
