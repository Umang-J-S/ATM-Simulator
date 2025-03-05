package bankmanagmentsystem;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class MiniStatement extends JFrame implements ActionListener {

    String pinnumber;

    @SuppressWarnings({ "static-access"})
    MiniStatement(String pinnumber) {
        this.pinnumber = pinnumber;
        setTitle("Mini Statement");
        setLayout(null);

        JLabel mini = new JLabel();
        add(mini);

        // Wrap the mini JLabel in a JScrollPane
        JScrollPane scrollPane = new JScrollPane(mini);
        scrollPane.setBounds(20, 140, 360, 200);
        add(scrollPane);

        JLabel bank = new JLabel("Indian Bank");
        bank.setBounds(150, 20, 100, 20);
        // bank.setFont(Color.LIGHT_GRAY);
        add(bank);

        JLabel card = new JLabel();
        card.setBounds(20, 80, 300, 20);
        add(card);

        JLabel balance = new JLabel();
        balance.setBounds(20, 400, 300, 20);
        add(balance);

        try {
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from login where Pin_Number ='" + pinnumber + "'");
            while (rs.next()) {
                card.setText("Card Number : " + rs.getString("Card_Number").substring(0, 4) + "XXXXXXXX"
                        + rs.getString("Card_Number").substring(12));
            }
        } catch (Exception e) {
            
            System.out.println(e);
        }

        try {
            conn c = new conn();
            int bal = 0;
            ResultSet rs = c.s.executeQuery("select * from bank where Pin_Number = '" + pinnumber + "'");
            while (rs.next()) {
                mini.setText(mini.getText() + "<html>" + rs.getString("Date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                        + rs.getString("Type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                        + rs.getString("Amount") + "<br><br><html>");
                if (rs.getString("type").equals("Deposite")) {
                    bal += Integer.parseInt(rs.getString("amount"));
                } else {
                    bal -= Integer.parseInt(rs.getString("amount"));
                }
            }

            balance.setText("Your current acount balance is Rs " + bal);
        } catch (Exception e) {
            System.out.println(e);
        }
        mini.setBounds(20, 140, 400, 200);

        setSize(400, 600);
        setLocation(20, 20);
        setResizable(false);
        getContentPane().setBackground(Color.white);
        setVisible(true);
    }

    // public static void main(String[] args) {
    //     new MiniStatement("");
    // }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
