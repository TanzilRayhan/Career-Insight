import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class FST extends JFrame {

    private Container c;
    private ImageIcon icon, logo;
    private JLabel label1, label2, label3, imgLabel;
    private Font f1, f2, f3, f4, f5;
    private JButton btn1, btn2, btn3, nBtn;
    private Cursor cursor;
    private ButtonGroup radioButtonGroup;
    private JRadioButton p1, p2;
    private int p = 0;

    FST() {
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
        imgLabel.setBounds(85, 03, logo.getIconWidth(), logo.getIconHeight());
        imgLabel.setIcon(logo);
        c.add(imgLabel);
       
    
        // Fonts
        f1 = new Font("Calibri", Font.BOLD, 25);
        f2 = new Font("Bell MT", Font.PLAIN, 40);
        f3 = new Font("Calibri", Font.BOLD, 30);
        


        // Cursor for JButtons and Radio Buttons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // Title
        label1 = new JLabel();
        label1.setText("Programs");
        label1.setForeground(Color.WHITE);
        label1.setBounds(265, 75, 600, 50);
        label1.setFont(f2);
        c.add(label1);

    

       
        // Program 1 Details
        p1 = new JRadioButton("Undergraduate Program");
        p1.setBounds(50, 125, 350, 50);
        p1.setFont(f3);
        p1.setForeground(Color.WHITE);
        p1.setBackground(Color.decode("#861b1b"));
        p1.setCursor(cursor);
        c.add(p1);

        label3 = new JLabel();
        label3.setText("Bachelor of Science in Computer Science & Engineering");
        label3.setForeground(Color.WHITE);
        label3.setBounds(50, 165, 600, 50);
        label3.setFont(f1);
        c.add(label3);
        
        label3 = new JLabel();
        label3.setText("(BSc in CSE)");
        label3.setForeground(Color.WHITE);
        label3.setBounds(50, 200, 600, 50);
        label3.setFont(f1);
        c.add(label3);


        // Program 2 Details
        p2 = new JRadioButton("Graduate Program");
        p2.setBounds(50, 270, 300, 50);
        p2.setFont(f3);
        p2.setForeground(Color.WHITE);
        p2.setBackground(Color.decode("#861b1b"));
        p2.setCursor(cursor);
        c.add(p2);

        label3 = new JLabel();
        label3.setText("Master of Science in Computer Science");
        label3.setForeground(Color.WHITE);
        label3.setBounds(50, 320, 600, 50);
        label3.setFont(f1);
        c.add(label3);
        
        label3 = new JLabel();
        label3.setText("(MSc in CS)");
        label3.setForeground(Color.WHITE);
        label3.setBounds(50, 350, 600, 50);
        label3.setFont(f1);
        c.add(label3);

        
       

        // To group the radio buttons.
        radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(p1);
        radioButtonGroup.add(p2);
  

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
        p1.addActionListener(handler);
        p2.addActionListener(handler);
       

        // Action Listener for JButtons
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
                AIUB frame = new AIUB();
                frame.setVisible(true);
            }
        });

        // Next Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (p == 1) {
                	setVisible(false);
                	Programs1 frame = new Programs1();
                	frame.setVisible(true);
                   
                } 
                else if (p == 2) {
                    setVisible(false);
                    Programs2 frame = new Programs2();
                    frame.setVisible(true);
                }
                
                else {
                	 JOptionPane.showMessageDialog(null, "You did not select any program.", "Warning!!!",
                             JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }
    


 class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == p1) {
                p = 1;
            } else if (e.getSource() == p2) {
                p = 2;
            } 
        }
    }

    public static void main(String[] args) {

        FST frame = new FST();
        frame.setVisible(true);
    }
}
