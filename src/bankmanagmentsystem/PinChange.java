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
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class PinChange extends JFrame implements ActionListener {

    String pinnumber;

    JButton change, back;
    JPasswordField pin, repin;

    PinChange(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setForeground(Color.lightGray);
        text.setFont(new Font("Raleway", Font.BOLD, 16));
        text.setBounds(250, 280, 500, 35);
        image.add(text);

        JLabel pintext = new JLabel("NEW PIN :");
        pintext.setForeground(Color.lightGray);
        pintext.setFont(new Font("Raleway", Font.BOLD, 16));
        pintext.setBounds(165, 320, 180, 25);
        image.add(pintext);

        pin = new JPasswordField();
        pin.setFont(new Font("Raleway", Font.BOLD, 25));
        pin.setBounds(330, 320, 180, 25);
        image.add(pin);

        JLabel repintext = new JLabel("Re-Enter NEW PIN :");
        repintext.setForeground(Color.lightGray);
        repintext.setFont(new Font("Raleway", Font.BOLD, 16));
        repintext.setBounds(165, 360, 180, 25);
        image.add(repintext);

        repin = new JPasswordField();
        repin.setFont(new Font("Raleway", Font.BOLD, 25));
        repin.setBounds(330, 360, 180, 25);
        image.add(repin);

        change = new JButton("CHANGE");
        change.setBounds(355, 485, 150, 30);
        change.addActionListener(this);
        image.add(change);

        back = new JButton("BACK");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);

        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setResizable(false);
        setVisible(true);

    }

    public static void main(String[] args) {
        new PinChange("");
    }

    @SuppressWarnings({ "static-access", "deprecation" })
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            setVisible(false);
            new Transection(pinnumber).setVisible(true);
        } else if (e.getSource() == change) {

            try {
                String npin = pin.getText();
                String rpin = repin.getText();

                if (!npin.equals(rpin)) {
                    JOptionPane.showMessageDialog(null, "Enter PIN does not match");
                    return;
                }

                if (npin.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter NEW PIN");
                    return;
                }
                if (rpin.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter NEW RE-PIN");
                    return;
                }

                conn c = new conn();
                c.s.executeUpdate(
                        "update bank set Pin_Number = '" + rpin + "' where Pin_Number = '" + pinnumber + "' ");

                c.s.executeUpdate(
                        "update login set Pin_Number = '" + rpin + "' where Pin_Number = '" + pinnumber + "' ");

                c.s.executeUpdate(
                        "update signupthree set Pin_Number = '" + rpin + "' where Pin_Number = '" + pinnumber + "' ");

                JOptionPane.showMessageDialog(null, "PIN Change Successfully");

                setVisible(false);
                new Login().setVisible(true);

            } catch (Exception ae) {
                
                System.out.println(ae);
            }
        }
    }

}
