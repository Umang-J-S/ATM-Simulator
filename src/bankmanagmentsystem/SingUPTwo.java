
package bankmanagmentsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;

public class SingUPTwo extends JFrame implements ActionListener {

    long ran;
    String formno;
    JButton next, Clear;
    JTextField nameTextField,
            fnameTextField,
            emailTextField,
            addressTextField,
            cityTextField,
            stateTextField,
            pan,
            adhhar,
            pincodeTextField;

    JDateChooser dateChooser;
    @SuppressWarnings("rawtypes")
    JComboBox religion,
            category,
            income,
            educationBox,
            occupationBox;

    JRadioButton sno,
            syes,
            eyes,
            eno;

    ButtonGroup YoNGroup, genderGroup,
            meritalGroup;

    SingUPTwo(String formno) {
        this.formno = formno;
        setLayout(null);

        setTitle("NEW ACCOUNT FORM - PAGE 2");

        JLabel additionalDetail = new JLabel("Page 2: Addition Details");
        additionalDetail.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetail.setBounds(300, 80, 400, 40);
        add(additionalDetail);

        JLabel name = new JLabel("Religion :");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);

        // Frame 2 Additional thing
        String valreligion[] = { "Hindu", "Muslim", "Sikh", "Chirtion" };
        religion = new JComboBox<>(valreligion);
        religion.setSelectedIndex(-1);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.white);
        add(religion);

        JLabel fname = new JLabel("Categoery :");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 400, 30);
        add(fname);

        String valcategory[] = { "GENERAL", "OBC", "SC", "ST", "OTHER" };
        category = new JComboBox<>(valcategory);
        category.setSelectedIndex(-1);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.white);
        add(category);

        JLabel dob = new JLabel("Income");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 400, 30);
        add(dob);

        String valIncome[] = { "NULL", "<1,50,000", "<2,50,000", "<5,00,000", ">5,00,000" };
        income = new JComboBox<>(valIncome);
        income.setSelectedIndex(-1);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);

        JLabel gender = new JLabel("Educational");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 400, 30);
        add(gender);

        JLabel email = new JLabel("Qualification :");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 315, 400, 30);
        add(email);

        String valEducation[] = { "Non-Graduation", "Graduation", "Post-Graduation", "Doctrate", "Other" };
        educationBox = new JComboBox<>(valEducation);
        educationBox.setSelectedIndex(-1);
        educationBox.setBounds(300, 315, 400, 30);
        educationBox.setBackground(Color.WHITE);
        add(educationBox);

        JLabel maritalStatus = new JLabel("Occupation :");
        maritalStatus.setFont(new Font("Raleway", Font.BOLD, 20));
        maritalStatus.setBounds(100, 390, 400, 30);
        add(maritalStatus);

        String valoccupation[] = { "Salaried", "Self-Employed", "Bussiness", "Student", "Retired", "Other" };
        occupationBox = new JComboBox<>(valoccupation);
        occupationBox.setSelectedIndex(-1);
        occupationBox.setBounds(300, 390, 400, 30);
        occupationBox.setBackground(Color.WHITE);
        add(occupationBox);

        JLabel address = new JLabel("Pan No:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 400, 30);
        add(address);

        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);

        JLabel city = new JLabel("Adhhar No :");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 400, 30);
        add(city);

        adhhar = new JTextField();
        adhhar.setFont(new Font("Raleway", Font.BOLD, 14));
        adhhar.setBounds(300, 490, 400, 30);
        add(adhhar);

        JLabel state = new JLabel("Senior Citizen :");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 400, 30);
        add(state);

        syes = new JRadioButton("YES");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.lightGray);
        add(syes);

        sno = new JRadioButton("NO");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.lightGray);
        add(sno);

        // other = new JRadioButton("Other");
        // other.setBounds(630, 390, 80, 30);
        // other.setBackground(Color.white);
        // add(other);

        meritalGroup = new ButtonGroup();
        meritalGroup.add(syes);
        meritalGroup.add(sno);
        // meritalGroup.add(other);

        // stateTextField = new JTextField();
        // stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        // stateTextField.setBounds(300, 540, 400, 30);
        // add(stateTextField);
        // //Editing

        JLabel pincode = new JLabel("Exisiting  Account :");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 400, 30);
        add(pincode);

        eyes = new JRadioButton("YES");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.lightGray);
        add(eyes);

        eno = new JRadioButton("NO");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.lightGray);
        add(eno);

        YoNGroup = new ButtonGroup();
        YoNGroup.add(eyes);
        YoNGroup.add(eno);

        // pincodeTextField = new JTextField();
        // pincodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        // pincodeTextField.setBounds(300, 590, 400, 30);
        // add(pincodeTextField);

        next = new JButton("Next");
        next.setBackground(Color.darkGray);
        next.setForeground(Color.white);
        next.setFont(new Font("Raieway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        Clear = new JButton("CLEAR");
        Clear.setBounds(500, 660, 80, 30);
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
        new SingUPTwo("");
    }

    @SuppressWarnings("static-access")
    @Override
    public void actionPerformed(ActionEvent e) {

        String srelition = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) educationBox.getSelectedItem();
        String soccupation = (String) occupationBox.getSelectedItem();

        String seniorcityzen = null;
        if (syes.isSelected()) {
            seniorcityzen = "Maried";
        } else if (sno.isSelected()) {
            seniorcityzen = "Unmeried";
        }
        // String email= emailTextField.getText();
        String existingAccount = null;
        if (eyes.isSelected()) {
            existingAccount = "Yes";
        } else if (eno.isSelected()) {
            existingAccount = "No";
        }

        String span = pan.getText();
        String sadhhar = adhhar.getText();

        try {
            conn c = new conn();
            String query = "insert into singupTwo values('" + formno + "', '" + srelition + "', '" + scategory + "', '"
                    + sincome + "', '" + seducation + "', '" + soccupation + "', '" + span + "', '" + sadhhar + "', '"
                    + seniorcityzen + "', '" + existingAccount + "')";
            c.s.executeUpdate(query);

            // sign up 3 object
            setVisible(false);
            new SingUPThree(formno).setVisible(true);
        } catch (Exception ae) {
            System.out.println(ae);
        }

        if (e.getSource() == Clear) {
            religion.setSelectedIndex(-1);
            category.setSelectedIndex(-1);
            income.setSelectedIndex(-1);
            educationBox.setSelectedIndex(-1);
            occupationBox.setSelectedIndex(-1);
            pan.setText("");
            adhhar.setText("");
            YoNGroup.clearSelection();
            genderGroup.clearSelection();
            meritalGroup.clearSelection();
            dateChooser.setDate(null);
        }
    }
}
