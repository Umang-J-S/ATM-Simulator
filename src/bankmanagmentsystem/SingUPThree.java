package bankmanagmentsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class SingUPThree extends JFrame implements ActionListener {

    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submite, cancel;
    String formno;

    // private int mouseX, mouseY;

    ButtonGroup groupAccount;

    SingUPThree(String formno) {
        // Remove default decorations
        // setUndecorated(true);

        // // Set layout to BorderLayout
        // setLayout(new BorderLayout());

        // JPanel titleBar = new JPanel();
        // titleBar.setBackground(Color.BLUE); // Set the desired color
        // titleBar.setPreferredSize(new Dimension(800, 30));
        // titleBar.setLayout(new BorderLayout());

        // // Create a label for the title text
        // JLabel titleLabel = new JLabel("Custom Title Bar", SwingConstants.CENTER);
        // titleLabel.setForeground(Color.WHITE); // Set text color
        // titleBar.add(titleLabel, BorderLayout.CENTER);

        // // Add a close button
        // JButton closeButton = new JButton("X");
        // closeButton.setForeground(Color.WHITE);
        // closeButton.setBackground(Color.RED);
        // closeButton.setFocusPainted(false);
        // closeButton.setBorderPainted(false);
        // closeButton.addActionListener(e -> System.exit(0));
        // titleBar.add(closeButton, BorderLayout.EAST);

        // // Add mouse listener for dragging the window
        // titleBar.addMouseListener(new MouseAdapter() {
        // public void mousePressed(MouseEvent e) {
        // mouseX = ((JComponent) e).getX();
        // mouseY = ((JComponent) e).getY();
        // }
        // });

        // // titleBar.addMouseMotionListener(new MouseAdapter() {
        // // public void mouseDragged(MouseEvent e) {
        // // int x = ((Object) e).getXOnScreen() - mouseX;
        // // int y = ((Object) e).getYOnScreen() - mouseY;
        // // setLocation(x, y);
        // // }
        // // });

        // // Add the custom title bar to the frame
        // // add(titleBar, BorderLayout.NORTH);

        this.formno = formno;

        setLayout(null);

        JLabel i1 = new JLabel("Page 3: Account Detail");
        i1.setFont(new Font("Raleway", Font.BOLD, 22));
        i1.setBounds(280, 40, 400, 40);
        add(i1);

        JLabel type = new JLabel("Account Type :");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100, 140, 400, 30);
        add(type);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD * 3, 18));
        r1.setBackground(Color.lightGray);
        r1.setBounds(100, 180, 200, 20);
        add(r1);

        r2 = new JRadioButton("Fixed Deposite Account");
        r2.setFont(new Font("Raleway", Font.BOLD * 3, 18));
        r2.setBackground(Color.lightGray);
        r2.setBounds(350, 180, 250, 20);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD * 3, 18));
        r3.setBackground(Color.lightGray);
        r3.setBounds(100, 220, 250, 20);
        add(r3);

        r4 = new JRadioButton("Recurring Deposite Account");
        r4.setFont(new Font("Raleway", Font.BOLD * 3, 18));
        r4.setBackground(Color.lightGray);
        r4.setBounds(350, 220, 300, 20);
        add(r4);

        groupAccount = new ButtonGroup();
        groupAccount.add(r1);
        groupAccount.add(r2);
        groupAccount.add(r3);
        groupAccount.add(r4);

        JLabel card = new JLabel("Card Number :");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100, 280, 200, 30);
        add(card);

        JLabel number = new JLabel("XXXX-XXXX-XXXX-5120");
        number.setFont(new Font("Raleway", Font.BOLD * 3, 22));
        number.setBounds(330, 280, 400, 30);
        add(number);

        JLabel carddetail = new JLabel("Your 16 Digit card number");
        carddetail.setFont(new Font("Raleway", Font.BOLD, 12));
        carddetail.setBounds(100, 310, 400, 25);
        add(carddetail);

        JLabel pin = new JLabel("PIN :");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100, 350, 200, 30);
        add(pin);

        JLabel pinnumber = new JLabel("XXXX");
        pinnumber.setFont(new Font("Raleway", Font.BOLD * 3, 22));
        pinnumber.setBounds(330, 350, 400, 30);
        add(pinnumber);

        JLabel pindetail = new JLabel("Your 4 Digit PIN number");
        pindetail.setFont(new Font("Raleway", Font.BOLD, 12));
        pindetail.setBounds(100, 380, 400, 25);
        add(pindetail);

        JLabel service = new JLabel("Services Required :");
        service.setFont(new Font("Raleway", Font.BOLD, 22));
        service.setBounds(100, 420, 350, 30);
        add(service);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.lightGray);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100, 460, 200, 30);
        add(c1);

        c2 = new JCheckBox("INTERNET BANKING");
        c2.setBackground(Color.lightGray);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(350, 460, 200, 30);
        add(c2);

        c3 = new JCheckBox("MOBILE BANKING");
        c3.setBackground(Color.lightGray);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100, 500, 200, 30);
        add(c3);

        c4 = new JCheckBox("EMAIL & SMS ALERTA");
        c4.setBackground(Color.lightGray);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(350, 500, 200, 30);
        add(c4);

        c5 = new JCheckBox("CHEQUE BOOK");
        c5.setBackground(Color.lightGray);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100, 540, 200, 30);
        add(c5);

        c6 = new JCheckBox("E-STATEMENT");
        c6.setBackground(Color.lightGray);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(350, 540, 200, 30);
        add(c6);

        c7 = new JCheckBox("I Hereby Decler that the above entered details are correct to rest of my Knoewladge");
        c7.setBackground(Color.lightGray);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100, 600, 600, 30);
        add(c7);

        submite = new JButton("SUBMITE");
        // submite.setBackground(Color.black);
        submite.setForeground(Color.black);
        submite.setFont(new Font("raleway", Font.BOLD, 14));
        submite.addActionListener(this);
        submite.setBounds(420, 680, 100, 30);
        add(submite);

        cancel = new JButton("CANCEL");
        // cancel.setBackground(Color.DARK_GRAY);
        cancel.setForeground(Color.black);
        cancel.addActionListener(this);
        cancel.setFont(new Font("raleway", Font.BOLD, 14));
        cancel.setBounds(250, 680, 100, 30);
        add(cancel);

        setSize(850, 820);
        setLocation(350, 0);
        getContentPane().setBackground(Color.lightGray);
        setResizable(false);
        setVisible(true);

    }

    public static void main(String[] args) {
        new SingUPThree("");
    }

    @SuppressWarnings("static-access")
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submite) {
            String accountType = null;
            if (r1.isSelected()) {
                accountType = "Saving Account";
            } else if (r2.isSelected()) {
                accountType = "Fixed Deposite Account";
            } else if (r3.isSelected()) {
                accountType = "Current Account";
            } else if (r4.isSelected()) {
                accountType = "Recurring Deposite Account";
            }

            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);

            String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);

            String facilites = "";
            if (c1.isSelected()) {
                facilites += " ATM CARD";
            } else if (c2.isSelected()) {
                facilites += " INTERNET BANKING";
            } else if (c3.isSelected()) {
                facilites += " MOBILE BANKING";
            } else if (c4.isSelected()) {
                facilites += " EMAIL & SMS ALERTA";
            } else if (c5.isSelected()) {
                facilites += " CHEQUE BOOK";
            } else if (c6.isSelected()) {
                facilites += " E-STATEMENT";
            }

            String resposiblity = "";
            if (c7.isSelected()) {
                resposiblity += "I Hereby Decler that the above entered details are correct to rest of my Knoewladge";
            }

            try {
                if (accountType.equals("")) {
                    JOptionPane.showMessageDialog(rootPane, "Account Type is required");
                } else if (resposiblity.equals("")) {
                    JOptionPane.showMessageDialog(rootPane, "You have to chose last chake box");
                } else {
                    conn Conn = new conn();

                    String query1 = "insert into signupthree values('" + formno + "', '" + accountType + "','"
                            + cardnumber + "','" + pinnumber + "','" + facilites + "')";

                    String query2 = "insert into login values('" + formno + "', '" + cardnumber + "','" + pinnumber
                            + "')";
                    Conn.s.executeUpdate(query1);
                    Conn.s.executeUpdate(query2);

                    JOptionPane.showMessageDialog(null, "Card Number :" + cardnumber + "\n Pin :" + pinnumber);

                    setVisible(false);
                    new Deposit(pinnumber).setVisible(true);
                }
            } catch (Exception ae) {
                System.out.println(ae);
            }

        } else if (e.getSource() == cancel) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }
}
