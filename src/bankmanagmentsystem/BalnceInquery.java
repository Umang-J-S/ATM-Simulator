package bankmanagmentsystem;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BalnceInquery extends JFrame implements java.awt.event.ActionListener {

    String pinnumber;
    JButton back;

    @SuppressWarnings("static-access")
    BalnceInquery(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);

        int balance = 0;
        try {
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from bank where Pin_Number ='" + pinnumber + "'");
            while (rs.next()) {
                if (rs.getString("type").equals("Deposite")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        } catch (Exception ae) {
            System.out.println(ae);
        }

        JLabel text = new JLabel("Your Current Accouunt blance is Rs " + balance);
        text.setForeground(Color.lightGray);
        text.setBounds(170, 300, 400, 30);
        image.add(text);

        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BalnceInquery("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            setVisible(false);
            new Transection(pinnumber).setVisible(true);
        }
    }
}