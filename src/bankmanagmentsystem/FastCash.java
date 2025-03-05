package bankmanagmentsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// import java.sql.Date;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    JButton deposite,
            widroal,
            fastcash,
            minstatement,
            pinchange,
            blanceenquiry,
            exit;
    String pinnumber;

    FastCash(String pinnumber) {

        this.pinnumber = pinnumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("SELECT WITHDROWAL AMOUNT");
        text.setBounds(210, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.BOLD, 16));
        image.add(text);

        deposite = new JButton("Rs 100");
        deposite.setBounds(170, 415, 150, 30);
        deposite.addActionListener(this);
        image.add(deposite);

        widroal = new JButton("Rs 500");
        widroal.setBounds(355, 415, 150, 30);
        widroal.addActionListener(this);
        image.add(widroal);

        fastcash = new JButton("Rs 1000");
        fastcash.setBounds(170, 450, 150, 30);
        fastcash.addActionListener(this);
        image.add(fastcash);

        minstatement = new JButton("Rs 2000");
        minstatement.setBounds(355, 450, 150, 30);
        minstatement.addActionListener(this);
        image.add(minstatement);

        pinchange = new JButton("Rs 5000");
        pinchange.setBounds(170, 485, 150, 30);
        pinchange.addActionListener(this);
        image.add(pinchange);

        blanceenquiry = new JButton("Rs 10000");
        blanceenquiry.setBounds(355, 485, 150, 30);
        blanceenquiry.addActionListener(this);
        image.add(blanceenquiry);

        exit = new JButton("BACK");
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
        new FastCash("");
    }

    @SuppressWarnings({ "static-access" })
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exit) {
            // System.exit(0);
            setVisible(false);
            new Transection(pinnumber).setVisible(true);
        } else {
            String amount = ((JButton) e.getSource()).getText().substring(3);
            try {
                conn c = new conn();
                ResultSet rs = c.s.executeQuery("select * from bank where Pin_Number ='" + pinnumber + "'");
                int balance = 0;
                while (rs.next()) {
                    if (rs.getString("type").equals("Deposite")) {
                        balance += Integer.parseInt(rs.getString("amount"));
                    } else {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }

                if (e.getSource() == exit && balance < Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }

                Date date = new Date();
                String query = "insert into bank values('" + pinnumber + "','" + date + "','Withdrowal','" + amount
                        + "')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs " + amount + " Debited Successfull");

                setVisible(false);
                new Transection(pinnumber).setVisible(true);
            } catch (Exception ae) {
                System.out.println(ae);
            }

        }
    }
}
