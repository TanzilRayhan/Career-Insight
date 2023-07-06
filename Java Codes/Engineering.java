import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Engineering extends JFrame {

    private Container c;
    private ImageIcon icon, logo;
    private JLabel label1, imgLabel;
    private Font f1, f2, f3;
    private JButton btn1, btn2, btn3, nBtn;
    private Cursor cursor;
    private JRadioButton aiub, brac;
    private ButtonGroup radioButtonGroup;
    private int engineering = 0;

    Engineering () {
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
        
        logo = new ImageIcon(getClass().getResource("/images/AIUB.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(100, 170, logo.getIconWidth(), logo.getIconHeight());
        imgLabel.setIcon(logo);
        c.add(imgLabel);
		
		logo = new ImageIcon(getClass().getResource("/images/brac.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(420, 170, logo.getIconWidth(), logo.getIconHeight());
        imgLabel.setIcon(logo);
        c.add(imgLabel);

 
        c.add(imgLabel);

        // Fonts
        f1 = new Font("Calibri", Font.BOLD, 25);
        f2 = new Font("Bell MT", Font.PLAIN, 40);
        f3 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Cursor for JButtons and Radio Buttons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // Title
        label1 = new JLabel();
        label1.setText("Choose University");
        label1.setForeground(Color.WHITE);
        label1.setBounds(190, 100, 500, 50);
        label1.setFont(f2);
        c.add(label1);

        // AIUB Radio Button
        aiub = new JRadioButton("AIUB");
        aiub.setBounds(130, 330, 300, 50);
        aiub.setFont(f1);
        aiub.setCursor(cursor);
        aiub.setForeground(new Color(0xffffff));
        aiub.setBackground(Color.decode("#861b1b"));
        c.add(aiub);
        
   

        // BRAC Radio Button
        brac = new JRadioButton("BRAC");
        brac.setBounds(450, 330, 300, 50);
        brac.setFont(f1);
        brac.setCursor(cursor);
		brac.setForeground(new Color(0xffffff));
        brac.setBackground(Color.decode("#861b1b"));
        c.add(brac);

        // group radio buttons
        radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(aiub);
        radioButtonGroup.add(brac);

        // Jbuttons
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


        btn3 = new JButton("Next");
        btn3.setBounds(240, 420, 195, 50);
        btn3.setFont(f1);
        btn3.setFocusable(false);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.BLACK);
        btn3.setBackground(Color.decode("#feddc6"));
        c.add(btn3);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        Handler handler = new Handler();
        aiub.addActionListener(handler);
        brac.addActionListener(handler);

        // Exit Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
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

        // Next Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (engineering == 1) {
                    AIUB frame = new AIUB();
                    frame.setVisible(true);
                    setVisible(false);
                    dispose();
                } 
                else if (engineering == 2) {
                    BRAC frame = new BRAC();
                    frame.setVisible(true);
                    setVisible(false);
                    dispose();
                }  
                else {
                    JOptionPane.showMessageDialog(null, "Please select University", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == aiub) {
                engineering = 1;
            } 
            else if (e.getSource() == brac) {
                engineering = 2; 
            }
        }
    }

    public static void main(String[] args) {

    	Engineering  frame = new Engineering ();
        frame.setVisible(true);
    }
}