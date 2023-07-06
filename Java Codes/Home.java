import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

public class Home extends JFrame {

    private Container c;
    private ImageIcon icon, logo;
    private JLabel label1, imgLabel;
    private Font f1, f2;
    private JButton btn1, btn2, btn3, btn4, nBtn;
    private Cursor cursor;

    Home() {
        // Frame Layout
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Career Insight");
        this.setSize(700, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#861b1b"));

        //Icon
        ImageIcon image = new ImageIcon(getClass().getResource("/images/gearicon.png"));
        this.setIconImage(image.getImage());
		
        //Logo
        logo = new ImageIcon(getClass().getResource("/images/logo1.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(85, 10, logo.getIconWidth(), logo.getIconHeight());
        imgLabel.setIcon(logo);
        c.add(imgLabel);
        
        logo = new ImageIcon(getClass().getResource("/images/gearlogo.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(180, 100, logo.getIconWidth(), logo.getIconHeight());
        imgLabel.setIcon(logo);
        c.add(imgLabel);
		

        // Fonts
        f1 = new Font("Trajan Pro", Font.PLAIN, 50);
        f2 = new Font("Calibri", Font.BOLD, 25);


        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons
        btn1 = new JButton("Login");
        btn1.setBounds(250, 350, 195, 50);
        btn1.setFont(f2);
        btn1.setFocusable(false);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.BLACK);
        btn1.setBackground(Color.decode("#feddc6"));
        c.add(btn1);

        btn2 = new JButton("Register");
        btn2.setBounds(250, 420, 195, 50);
        btn2.setFont(f2);
        btn2.setFocusable(false);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.BLACK);
        btn2.setBackground(Color.decode("#feddc6"));
        c.add(btn2);

        btn3 = new JButton("Exit");
        btn3.setBounds(10, 500, 170, 50);
        btn3.setFont(f2);
        btn3.setFocusable(false);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#000000"));
        c.add(btn3);

        btn4 = new JButton("Admin Login");
        btn4.setBounds(502, 500, 170, 50);
        btn4.setFont(f2);
        btn4.setFocusable(false);
        btn4.setCursor(cursor);
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.decode("#123456"));
        c.add(btn4);
        
        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        // Login
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Login frame = new Login();
                frame.setVisible(true);
            }
        });

        // Register
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                Registration frame = new Registration();
                frame.setVisible(true);
                setVisible(false);
            }
        });

        // Exit
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        // Admin Login
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                AdminLogin frame = new AdminLogin();
                frame.setVisible(true);
                //JOptionPane.showMessageDialog(null, "By default, Admin Name and Password is : 'admin'", "Information!",
                                //JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {

        Home frame = new Home();
        frame.setVisible(true);
    }
}
