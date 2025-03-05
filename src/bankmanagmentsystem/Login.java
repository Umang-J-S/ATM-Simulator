package bankmanagmentsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class Login extends JFrame implements ActionListener {

    JButton Signup, Clear, Login;
    JTextField cardTextField;
    JPasswordField pinTextField;

    Login() {
        setTitle("AUTOMATED TELLER MACHINE BY UMANG");

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/Bank icon.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(20, 10, 100, 100);
        add(label);

        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(150, 40, 350, 40);
        add(text);

        JLabel cardNO = new JLabel("Card No :");
        cardNO.setFont(new Font("Raleway", Font.BOLD, 30));
        cardNO.setBounds(145, 150, 150, 30);
        add(cardNO);

        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 250, 30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 15));
        add(cardTextField);

        JLabel pin = new JLabel("PIN :");
        pin.setFont(new Font("Raleway", Font.BOLD, 30));
        pin.setBounds(212, 220, 250, 30);
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 250, 30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinTextField);

        
        Login = new JButton("LOGIN");
        Login.setBounds(300, 280, 100, 30);
        add(Login);
        Login.addActionListener(this);
        Login.setBackground(Color.darkGray);
        Login.setForeground(Color.white);

        
        Clear = new JButton("CLEAR");
        Clear.setBounds(450, 280, 100, 30);
        add(Clear);
        Clear.addActionListener(this);
        Clear.setBackground(Color.darkGray);
        Clear.setForeground(Color.white);

        Signup = new JButton("SIGN UP");
        Signup.setBounds(300, 330, 250, 30);
        add(Signup);
        Signup.addActionListener(this);
        Signup.setBackground(Color.darkGray);
        Signup.setForeground(Color.white);

        getContentPane().setBackground(Color.white);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(800, 480);
        setResizable(false);
        setVisible(true);
        setLocation(350, 200);
    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Clear) {
            cardTextField.setText("");
            pinTextField.setText("");
        } else if (e.getSource() == Login) {
            @SuppressWarnings("unused")
            conn Conn = new conn();
            String cardnumber = cardTextField.getText();
            @SuppressWarnings("deprecation")
            String pinnumber = pinTextField.getText();
            String query = "select * from login where Card_Number = '" + cardnumber + "' and Pin_Number = '" + pinnumber+ "'";
            try {
                ResultSet rs = conn.s.executeQuery(query);
                if (rs.next()) {
                    setVisible(false);
                    new Transection(pinnumber).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "INCORRECT CARD OR PIN");
                }
            } catch (Exception ae) {
                System.out.println(ae);
            }
        } else if (e.getSource() == Signup) {
            setVisible(false);
            new SingUpOne().setVisible(true);
        }
    }
}
