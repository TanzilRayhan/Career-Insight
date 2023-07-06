import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.event.*;

public class Admin extends JFrame {

    private Container c;
    private ImageIcon icon, logo;
    private JLabel label1, imgLabel;
    private Font f1, f2, f3;
    private JButton btn1, btn2, btn3, btn4, nBtn;
    private Cursor cursor;

    Admin() {
        // Frame Layout
    	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setTitle("Career Insight");
         this.setSize(700, 600);
         this.setLocationRelativeTo(null);
         this.setResizable(false);
         
         c = this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.decode("#861b1b"));
		 
		 
         //Logo
         logo = new ImageIcon(getClass().getResource("/images/logo1.png"));
         imgLabel = new JLabel(logo);
         imgLabel.setBounds(85, 10, logo.getIconWidth(), logo.getIconHeight());
         imgLabel.setIcon(logo);
         c.add(imgLabel);
         
         logo = new ImageIcon(getClass().getResource("/images/admin.png"));
         imgLabel = new JLabel(logo);
         imgLabel.setBounds(250, 95, logo.getIconWidth(), logo.getIconHeight());
         imgLabel.setIcon(logo);
         c.add(imgLabel);


         // Fonts
         f1 = new Font("Trajan Pro", Font.PLAIN, 50);
         f2 = new Font("Calibri", Font.BOLD, 25);
         f3 = new Font("Bell MT", Font.PLAIN, 50);

        // Title
        label1 = new JLabel();
        label1.setText("Admin Panel");
        label1.setForeground(new Color(0xffffff));
        label1.setBounds(210, 300, 500, 65);
        label1.setFont(f3);
        c.add(label1);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons
      

        btn1 = new JButton("Exit");
        btn1.setBounds(10, 500, 170, 50);
        btn1.setFont(f2);
        btn1.setFocusable(false);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#000000"));
        c.add(btn1);

        btn2 = new JButton("Back");
        btn2.setBounds(502, 500, 170, 50);;
        btn2.setFont(f2);
        btn2.setFocusable(false);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#123456"));
        c.add(btn2);
        
        btn3 = new JButton("User Data");
        btn3.setBounds(250, 370, 195, 50);
        btn3.setFont(f2);
        btn3.setFocusable(false);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.BLACK);
        btn3.setBackground(Color.decode("#feddc6"));
        c.add(btn3);
        
        btn4 = new JButton("Admin Password");
        btn4.setBounds(230, 430, 230, 50);
        btn4.setFont(f2);
        btn4.setFocusable(false);
        btn4.setCursor(cursor);
        btn4.setForeground(Color.BLACK);
        btn4.setBackground(Color.decode("#feddc6"));
        c.add(btn4);
        
        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);
        
        // Exit Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        
        // Back
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                setVisible(false);
                Home frame = new Home();
                frame.setVisible(true);
            }
        });


        // User Data
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                UserData frame = new UserData();
                frame.setVisible(true);
            }
        });

        
        // Admin Password
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                AdminPassword frame = new AdminPassword();
                frame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {

        Admin frame = new Admin();
        frame.setVisible(true);
    }
}
