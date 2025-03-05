package bankmanagmentsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;

public class SingUpOne extends JFrame implements ActionListener {

    long ran;
    JButton next, Clear;
    JTextField nameTextField,
            fnameTextField,
            emailTextField,
            addressTextField,
            cityTextField,
            stateTextField,
            pincodeTextField;

    JDateChooser dateChooser;

    JRadioButton male,
            female,
            meried,
            unmeried,
            other;

    ButtonGroup genderGroup,
            meritalGroup;

    SingUpOne() {

        setLayout(null);

        Random random = new Random();
        ran = Math.abs((random.nextLong() % 900L) + 1000L);

        JLabel formNo = new JLabel("APPLICATION NO. " + ran);
        formNo.setFont(new Font("Raleway", Font.BOLD, 38));
        formNo.setBounds(200, 20, 600, 40);
        add(formNo);

        JLabel personDetail = new JLabel("Page 1: Personal Details");
        personDetail.setFont(new Font("Raleway", Font.BOLD, 22));
        personDetail.setBounds(300, 80, 400, 40);
        add(personDetail);

        JLabel name = new JLabel("Name :");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);

        JLabel fname = new JLabel("Father's Name :");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 400, 30);
        add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(300, 190, 400, 30);
        add(fnameTextField);

        JLabel dob = new JLabel("Date Of Birth");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 400, 30);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(new Color(105, 105, 105));
        add(dateChooser);

        JLabel gender = new JLabel("Gender");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 400, 30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.white);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(450, 290, 70, 30);
        female.setBackground(Color.white);
        add(female);

        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JLabel email = new JLabel("Email");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 400, 30);
        add(email);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);

        JLabel maritalStatus = new JLabel("Marital Status :");
        maritalStatus.setFont(new Font("Raleway", Font.BOLD, 20));
        maritalStatus.setBounds(100, 390, 400, 30);
        add(maritalStatus);

        meried = new JRadioButton("Maried");
        meried.setBounds(300, 390, 100, 30);
        meried.setBackground(Color.white);
        add(meried);

        unmeried = new JRadioButton("Unmeried");
        unmeried.setBounds(450, 390, 100, 30);
        unmeried.setBackground(Color.white);
        add(unmeried);

        other = new JRadioButton("Other");
        other.setBounds(630, 390, 80, 30);
        other.setBackground(Color.white);
        add(other);

        meritalGroup = new ButtonGroup();
        meritalGroup.add(meried);
        meritalGroup.add(unmeried);
        meritalGroup.add(other);

        JLabel address = new JLabel("Address");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 400, 30);
        add(address);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);

        JLabel city = new JLabel("City :");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 400, 30);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);

        JLabel state = new JLabel("State :");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 400, 30);
        add(state);

        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField);

        JLabel pincode = new JLabel("Pincode :");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 400, 30);
        add(pincode);

        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pincodeTextField.setBounds(300, 590, 400, 30);
        add(pincodeTextField);

        next = new JButton("Next");
        next.setBackground(Color.darkGray);
        next.setForeground(Color.white);
        next.setFont(new Font("Raieway", Font.BOLD, 14));
        next.setBounds(580, 660, 120, 30);
        next.addActionListener(this);
        add(next);

        Clear = new JButton("CLEAR");
        Clear.setBounds(450, 660, 120, 30);
        add(Clear);
        Clear.addActionListener(this);
        Clear.setBackground(Color.darkGray);
        Clear.setForeground(Color.white);

        getContentPane().setBackground(Color.lightGray);

        setSize(850, 800);
        setResizable(false);
        setLocation(350, 10);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SingUpOne();
    }

    @SuppressWarnings("static-access")
    @Override
    public void actionPerformed(ActionEvent e) {
        int count = 0;
        String formno = "" + ran;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();

        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        }

        String email = emailTextField.getText();
        String marital = null;
        if (meried.isSelected()) {
            marital = "Maried";
        } else if (unmeried.isSelected()) {
            marital = "Unmeried";
        } else if (other.isSelected()) {
            marital = "Other";
        }

        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pincodeTextField.getText();

        if (e.getSource() == Clear) {
            count++;
            nameTextField.setText("");
            fnameTextField.setText("");
            emailTextField.setText("");
            addressTextField.setText("");
            cityTextField.setText("");
            stateTextField.setText("");
            pincodeTextField.setText("");
            genderGroup.clearSelection();
            meritalGroup.clearSelection();
            dateChooser.setDate(null);
            JOptionPane.showMessageDialog(null, "Clear Done");

        }

        try {
            if (count == 0) {

                if (name.equals("")) {
                    // JOptionPane.showMessageDialog(null, "Enter Name");
                    JOptionPane.showMessageDialog(null, "Name is required");
                }
                // THIS IS ONLY FOR FUN
                else if (dob.equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter Birth Date");
                } else if (gender == null) {
                    JOptionPane.showMessageDialog(null, "EnterGender");
                } else if (address.equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter Addreses");
                }
                // HERE IT OVER
                else {
                    conn c = new conn();
                    String query = "insert into singup values('" + formno + "', '" + name + "', '" + fname + "', '"
                            + dob
                            + "', '" + gender + "', '" + email + "', '" + marital + "', '" + address + "', '" + city
                            + "', '" + state + "', '" + pin + "')";
                    c.s.executeUpdate(query);

                    setVisible(false);
                    new SingUPTwo(formno).setVisible(true);
                }
            }

        } catch (Exception ae) {
            System.out.println(ae);
        }

        // else if (e.getSource() == next) {}
    }
}
