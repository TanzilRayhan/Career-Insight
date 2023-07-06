import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;

public class Login extends JFrame {

    private Container c;
    private ImageIcon icon, logo;
    private JLabel label1, imgLabel;
    private Font f1, f2, f3, f4, f5, f6;
    private JTextField tf1;
    private JButton btn1, btn2, btn3, nBtn;
    private JPasswordField tf2;
    private Cursor cursor;

    Login() {
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


        // Fonts
         f1 = new Font("Trajan Pro", Font.PLAIN, 50);
         f2 = new Font("Calibri", Font.BOLD, 25);
         f3 = new Font("Bell MT", Font.PLAIN, 40);
         f4 = new Font("Segoe UI", Font.BOLD, 20);
         f5 = new Font("Segoe UI", Font.PLAIN, 19);
        
        label1 = new JLabel();
        label1.setText("Choose Your Career Precisely");
        label1.setForeground(new Color(0xffffff));
        label1.setBounds(110, 110, 500, 65);
        label1.setFont(f3);
        c.add(label1);

        // User Name
        label1 = new JLabel();
        label1.setText("User Name");
        label1.setForeground(Color.WHITE);
        label1.setBounds(160, 190, 500, 50);
        label1.setFont(f2);
        c.add(label1);

        tf1 = new JTextField();
        tf1.setBounds(300, 200, 260, 30);
        tf1.setFont(f5);
        c.add(tf1);


        // Password
        label1 = new JLabel();
        label1.setText("Password");
        label1.setForeground(Color.WHITE);
        label1.setBounds(160, 250, 500, 50);
        label1.setFont(f2);
        c.add(label1);

        tf2 = new JPasswordField();
        tf2.setBounds(300, 260, 260, 30);
        tf2.setFont(f4);
        tf2.setEchoChar('*');
        c.add(tf2);

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
        btn2.setBounds(502, 500, 170, 50);
        btn2.setFont(f2);
        btn2.setFocusable(false);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#123456"));
        c.add(btn2);

        btn3 = new JButton("Login");
        btn3.setBounds(250, 350, 195, 50);
        btn3.setFont(f2);
        btn3.setFocusable(false);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.BLACK);
        btn3.setBackground(Color.decode("#feddc6"));
        c.add(btn3);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        // Exit Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        // Back Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Home frame = new Home();
                frame.setVisible(true);
            }
        });

       // Login Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String textField1 = tf1.getText().toLowerCase(); // User Name 
                String textField2 = tf2.getText(); // Password

                if (textField1.isEmpty() || textField2.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {

                    try {
                        String userNameS = "User Name : " + textField1;
                        String passwordS = "Password : " + textField2;
                        BufferedReader reader = new BufferedReader(new FileReader("./Data/user.txt"));

                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i <= totalLines; i++) {
                            String line = Files.readAllLines(Paths.get("./Data/user.txt")).get(i);
                            if (line.equals(userNameS)) {
                                String line2 = Files.readAllLines(Paths.get("./Data/user.txt")).get((i + 1));
                                if (line2.equals(passwordS)) {
                                    JOptionPane.showMessageDialog(null, "Login Successful.", "Career Insight",
                                            JOptionPane.WARNING_MESSAGE);

                                    setVisible(false);
                                    Career frame = new Career();
                                    frame.setVisible(true);
                                    break;
                                }
                            }
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Invalid User Name or Password!", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    }

                }

            }
        });
    }

    public static void main(String[] args) {

        Login frame = new Login();
        frame.setVisible(true);
    }
}
