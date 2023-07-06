import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Medical extends JFrame {

    private Container c;
    private ImageIcon icon, logo, welcome;
    private JLabel label1, imgLabel;
    private Font f1, f2, f3;
    private JButton btn1, btn2, nBtn;
    private Cursor cursor;

    Medical() {
        // Frame Layout
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Career Insight");
        this.setSize(700, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#861b1b"));

        // Icon
       // icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        //this.setIconImage(icon.getImage());

        // Logo and Images
        
        logo = new ImageIcon(getClass().getResource("/images/logo1.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(85, 05, logo.getIconWidth(), logo.getIconHeight());
        imgLabel.setIcon(logo);
        c.add(imgLabel);
        
        logo = new ImageIcon(getClass().getResource("/images/Medical2.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(230, 90, logo.getIconWidth(), logo.getIconHeight());
        imgLabel.setIcon(logo);
        c.add(imgLabel);
        
        
        
        // Fonts
        f1 = new Font("Calibri", Font.BOLD, 25);
        f2 = new Font("Bell MT", Font.PLAIN, 40);
        f3 = new Font("Segoe UI Black", Font.PLAIN, 25);
        
        // Title
        label1 = new JLabel();
        label1.setText("Work in Progress");
        label1.setForeground(Color.WHITE);
        label1.setBounds(200, 350, 500, 50);
        label1.setFont(f2);
        c.add(label1);
        
        label1 = new JLabel();
        label1.setText("Update Coming Soon ");
        label1.setForeground(Color.WHITE);
        label1.setBounds(170, 410, 500, 50);
        label1.setFont(f2);
        c.add(label1);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons
        btn1 = new JButton("Exit");
        btn1.setBounds(10, 500, 170, 50);
        btn1.setFont(f1);
        btn1.setFocusable(false);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#000000"));
        c.add(btn1);

        btn2 = new JButton("Back");
        btn2.setBounds(502, 500, 170, 50);
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
                Career frame = new Career();
                frame.setVisible(true);
                setVisible(false);
            }
        });
    }

    public static void main(String[] args) {

    	Medical frame = new Medical();
        frame.setVisible(true);
    }
}
