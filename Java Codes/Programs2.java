import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Programs2 extends JFrame {

    private Container c;
    private ImageIcon icon, logo, welcome;
    private JLabel imgLabel;
    private Font f1;
    private JButton btn1, btn2, nBtn;
    private Cursor cursor;

    Programs2() {
        // Frame Layout
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Career Insight");
        this.setSize(600, 700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#861b1b"));




        // Logo and Images
        
        logo = new ImageIcon(getClass().getResource("/images/logo1.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(30, 03, logo.getIconWidth(), logo.getIconHeight());
        imgLabel.setIcon(logo);
        c.add(imgLabel);
        
        logo = new ImageIcon(getClass().getResource("/images/cs.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(45, 80, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);
        
        // Fonts
        f1 = new Font("Calibri", Font.BOLD, 25);
        //f2 = new Font("Bell MT", Font.PLAIN, 40);
       // f3 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons
        btn1 = new JButton("Exit");
        btn1.setBounds(10, 600, 170, 50);
        btn1.setFont(f1);
        btn1.setFocusable(false);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#000000"));
        c.add(btn1);

        btn2 = new JButton("Back");
        btn2.setBounds(400, 600, 170, 50);
        btn2.setFont(f1);
        btn2.setFocusable(false);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#123456"));
        c.add(btn2);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        // Action Listener for JButtons
        // Exit Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
            }
        });
        
        // Back Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                FST frame = new FST();
                frame.setVisible(true);
                setVisible(false);
            }
        });
    }

    public static void main(String[] args) {

    	Programs2 frame = new Programs2();
        frame.setVisible(true);
    }
}
