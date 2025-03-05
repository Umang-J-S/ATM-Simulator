package bankmanagmentsystem;

import java.awt.Font;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Transection extends JFrame implements ActionListener {
    JButton deposite,
            widroal,
            fastcash,
            minstatement,
            pinchange,
            blanceenquiry,
            exit;
    String pinnumber;

    Transection(String pinnumber) {

        this.pinnumber = pinnumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("Please select your Transaction");
        text.setBounds(210, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.BOLD, 16));
        image.add(text);

        deposite = new JButton("Deposite");
        deposite.setBounds(170, 415, 150, 30);
        deposite.addActionListener(this);
        image.add(deposite);

        widroal = new JButton("Cash Widroal");
        widroal.setBounds(355, 415, 150, 30);
        widroal.addActionListener(this);
        image.add(widroal);

        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(170, 450, 150, 30);
        fastcash.addActionListener(this);
        image.add(fastcash);

        minstatement = new JButton("MinStatement");
        minstatement.setBounds(355, 450, 150, 30);
        minstatement.addActionListener(this);
        image.add(minstatement);

        pinchange = new JButton("Pin Change");
        pinchange.setBounds(170, 485, 150, 30);
        pinchange.addActionListener(this);
        image.add(pinchange);

        blanceenquiry = new JButton("Blance Enquiry");
        blanceenquiry.setBounds(355, 485, 150, 30);
        blanceenquiry.addActionListener(this);
        image.add(blanceenquiry);

        exit = new JButton("Exit");
        exit.setBounds(355, 520, 150, 30);
        exit.addActionListener(this);
        image.add(exit);

        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Transection("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exit) {
            System.exit(0);
        } else if (e.getSource() == deposite) {
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        } else if (e.getSource() == widroal) {
            setVisible(false);
            new Withdrowal(pinnumber).setVisible(true);
        } else if (e.getSource() == fastcash) {
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        } else if (e.getSource() == pinchange) {
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        } else if (e.getSource() == blanceenquiry) {
            setVisible(false);
            new BalnceInquery(pinnumber).setVisible(true);
        } else if (e.getSource() == minstatement) {
            // setVisible(false);
            new MiniStatement(pinnumber).setVisible(true);
        }
    }
}
