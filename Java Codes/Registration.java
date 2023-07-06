import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;

public class Registration extends JFrame {

    private Container c;
    private ImageIcon icon, logo;
    private JLabel label1, imgLabel;
    private Font f1, f2, f3, f4, f5;
    private JTextField tf1, tf2;
    private JButton btn1, btn2, btn3, btn4, nBtn;
    private JPasswordField tf3;
    private Cursor cursor;

    Registration() {
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
        
        //Icon
        ImageIcon image = new ImageIcon(getClass().getResource("/images/gearicon.png"));
        this.setIconImage(image.getImage());
        

        // Fonts
        f1 = new Font("Trajan Pro", Font.PLAIN, 50);
        f2 = new Font("Calibri", Font.BOLD, 25);
        f3 = new Font("Bell MT", Font.PLAIN, 30);
        f4 = new Font("Segoe UI", Font.BOLD, 20);
        f5 = new Font("Segoe UI", Font.PLAIN, 19);

        // Title
        label1 = new JLabel();
        label1.setText("Enter Your Information");
        label1.setForeground(Color.WHITE);
        label1.setBounds(210, 100, 500, 50);
        label1.setFont(f3);
        c.add(label1);

        // User Name
        label1 = new JLabel();
        label1.setText("User Name");
        label1.setForeground(Color.WHITE);
        label1.setBounds(150, 150, 500, 50);
        label1.setFont(f2);
        c.add(label1);

        tf1 = new JTextField();
        tf1.setBounds(300, 160, 260, 30);
        tf1.setFont(f5);
        c.add(tf1);

        // Email
        label1 = new JLabel();
        label1.setText("Email");
        label1.setForeground(Color.WHITE);
        label1.setBounds(150, 200, 500, 50);
        label1.setFont(f2);
        c.add(label1);

        tf2 = new JTextField();
        tf2.setBounds(300, 210, 260, 30);
        tf2.setFont(f5);
        c.add(tf2);

        // Password
        label1 = new JLabel();
        label1.setText("Password");
        label1.setForeground(Color.WHITE);
        label1.setBounds(150, 250, 500, 50);
        label1.setFont(f2);
        c.add(label1);

        tf3 = new JPasswordField();
        tf3.setBounds(300, 260, 260, 30);
        tf3.setFont(f4);
        tf3.setEchoChar('*');
        c.add(tf3);
    
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

        btn3 = new JButton("Reset");
        btn3.setBounds(250, 350, 195, 50);
        btn3.setFont(f2);
        btn3.setFocusable(false);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.BLACK);
        btn3.setBackground(Color.decode("#feddc6"));
        c.add(btn3);

        btn4 = new JButton("Register");
        btn4.setBounds(250, 420, 195, 50);
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

        // Back Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Home frame = new Home();
                frame.setVisible(true);
            }
        });

        // Reset Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Registration frame = new Registration();
                frame.setVisible(true);
            }
        });

        // Register Button
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String textField1 = tf1.getText().toLowerCase(); // User Name
                String textField2 = tf2.getText(); // Email
                String textField3 = tf3.getText(); // Password
                
                int result = 0;

                if (textField3.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    if (textField1.isEmpty() ||textField2.isEmpty() || textField3.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    } 
                     else {

                        try {
                        	File file = new File("./Data/user.txt");

                            if (!file.exists()) {
                                file.createNewFile();
                            }
                            FileWriter fw = new FileWriter(file, true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            PrintWriter pw = new PrintWriter(bw);

                          

                            pw.println("User Name : " + textField1);
                            pw.println("Password : " + textField3);
                            pw.println("Email : " + textField2);
                            pw.println("===============================================");
                            pw.close();

                        } catch (Exception ex) {
                            System.out.print(ex);
                        }

                        JOptionPane.showMessageDialog(null, "Registration Successfully Completed.",
                                "Registration Complete", JOptionPane.WARNING_MESSAGE);
                        setVisible(false);
                        Home frame = new Home();
                        frame.setVisible(true);
                    }
                }
            }
        });
    }

    public static void main(String[] args) {

        Registration frame = new Registration();
        frame.setVisible(true);
    }
}
