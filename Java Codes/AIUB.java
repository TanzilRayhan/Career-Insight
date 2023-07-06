import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AIUB extends JFrame {

    private Container c;
    private ImageIcon icon, logo;
    private JLabel label1, imgLabel;
    private Font f1, f2, f3;
    private JButton btn1, btn2, btn3, nBtn;
    private Cursor cursor;
    private JRadioButton faculty1, faculty2;
    private ButtonGroup jButtonGroup;
    private int faculty = 0;

    AIUB() {
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
        

        logo = new ImageIcon(getClass().getResource("/images/FST.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(110, 180, logo.getIconWidth(), logo.getIconHeight());
        imgLabel.setIcon(logo);
        c.add(imgLabel);
        
        logo = new ImageIcon(getClass().getResource("/images/FE.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(480, 180, logo.getIconWidth(), logo.getIconHeight());
        imgLabel.setIcon(logo);
        c.add(imgLabel);

        // Fonts
        f1 = new Font("Calibri", Font.BOLD, 25);
        f2 = new Font("Bell MT", Font.PLAIN, 40);
        f3 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Cursor for JButtons and Radio Buttons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // Title
        label1 = new JLabel();
        label1.setText("Choose Faculty");
        label1.setForeground(Color.WHITE);
        label1.setBounds(210, 100, 500, 50);
        label1.setFont(f2);
        c.add(label1);
        
      

        // FACULTY JButtons
        faculty1 = new JRadioButton("Faculty of Science and Technology");
        faculty1.setBounds(10, 350, 400, 50);
        faculty1.setFont(f1);
        faculty1.setForeground(new Color(0xffffff));
        faculty1.setBackground(Color.decode("#861b1b"));
        faculty1.setCursor(cursor);
        c.add(faculty1);
        

        faculty2 = new JRadioButton("Faculty of Engineering");
        faculty2.setBounds(420, 350, 300, 50);
        faculty2.setFont(f1);
        faculty2.setForeground(new Color(0xffffff));
        faculty2.setBackground(Color.decode("#861b1b"));
        faculty2.setCursor(cursor);
        c.add(faculty2);

       


        // To Group JButtons
        jButtonGroup = new ButtonGroup();
        jButtonGroup.add(faculty1);
        jButtonGroup.add(faculty2);

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
        faculty1.addActionListener(handler);
        faculty2.addActionListener(handler);


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
                Engineering frame = new Engineering();
                frame.setVisible(true);
                setVisible(false);
            }
        });

        // Next Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (faculty == 1) {
                    setVisible(false);
                    FST frame = new FST();
                    frame.setVisible(true);
                } 
                 else if (faculty == 2) {
                    setVisible(false);
                   FE  frame = new FE();
                    frame.setVisible(true);
                    
                 }
                else {
                    JOptionPane.showMessageDialog(null, "Please select Faculty !!!", "Warning!!!",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == faculty1) {
            	faculty = 1;
            } else if (e.getSource() == faculty2) {
            	faculty = 2;
            }
        }
    }

    public static void main(String[] args) {

        AIUB frame = new AIUB();
        frame.setVisible(true);
    }
}
