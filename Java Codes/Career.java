import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Career extends JFrame {

    private Container c;
    private ImageIcon icon, logo;
    private JLabel label1, imgLabel;
    private Font f1, f2, f3;
    private JButton btn1, btn2, btn3, nBtn;
    private Cursor cursor;
    private JRadioButton engineering, medical;
    private ButtonGroup jButtonGroup;
    private int career = 0;

    Career() {
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
        
        
        logo = new ImageIcon(getClass().getResource("/images/engineering.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(110, 200, logo.getIconWidth(), logo.getIconHeight());
        imgLabel.setIcon(logo);
        c.add(imgLabel);
        
        logo = new ImageIcon(getClass().getResource("/images/Medical1.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(430, 200, logo.getIconWidth(), logo.getIconHeight());
        imgLabel.setIcon(logo);
        c.add(imgLabel);

       

        // Fonts
        f1 = new Font("Trajan Pro", Font.PLAIN, 50);
        f2 = new Font("Calibri", Font.BOLD, 25);
        f3 = new Font("Bell MT", Font.PLAIN, 40);

        // Cursor for JButtons and Radio Buttons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // Title

        
        label1 = new JLabel();
        label1.setText("Choose Your Career");
        label1.setForeground(new Color(0xffffff));
        label1.setBounds(180, 110, 500, 65);
        label1.setFont(f3);
        c.add(label1);

        engineering = new JRadioButton("Engineering");
        engineering.setBounds(110, 350, 300, 50);
        engineering.setFont(f2);
        engineering.setCursor(cursor);
        engineering.setForeground(new Color(0xffffff));
        engineering.setBackground(Color.decode("#861b1b"));
        c.add(engineering);

        medical = new JRadioButton("Medical");
        medical.setBounds(450, 350, 300, 50);
        medical.setFont(f2);
        medical.setForeground(new Color(0xffffff));
        medical.setBackground(Color.decode("#861b1b"));
        c.add(medical);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);
        jButtonGroup = new ButtonGroup();
        jButtonGroup.add(engineering);
        jButtonGroup.add(medical);

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


        btn3 = new JButton("Next");
        btn3.setBounds(240, 420, 195, 50);
        btn3.setFont(f2);
        btn3.setFocusable(false);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.BLACK);
        btn3.setBackground(Color.decode("#feddc6"));
        c.add(btn3);
        
        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        Handler handler = new Handler();
        engineering.addActionListener(handler);
        medical.addActionListener(handler);

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
                Login frame = new Login();
                frame.setVisible(true);
            }
        });

        // Next Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (career == 1) {
                    setVisible(false);
                    Engineering frame = new Engineering();
                    frame.setVisible(true);
                }
                else if (career == 2) {
                    setVisible(false);
                    Medical frame = new Medical();
                    frame.setVisible(true);
                } 
                else {
                    JOptionPane.showMessageDialog(null, "Please Select Your Career !!!", "Warning!!!",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == engineering) {
                career = 1;
            } else if (e.getSource() == medical) {
                career = 2;
            }
        }
    }

    public static void main(String[] args) {

        Career frame = new Career();
        frame.setVisible(true);
    }
}