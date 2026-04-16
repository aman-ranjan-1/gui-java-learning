import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
// for running this code you need compile and run Swinggui.java file
public class Swinggui {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2, 10, 10));

        // Labels
        JLabel name = new JLabel("Name:");
        JLabel mail = new JLabel("Email:");
        JLabel pass = new JLabel("Password:");
        JLabel gender = new JLabel("Gender:");
        JLabel interest = new JLabel("Interest:");

        // Text fields
        JTextField nametext = new JTextField();
        JTextField emailtext = new JTextField();
        JPasswordField passwordtext = new JPasswordField();

        // Radio buttons
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        ButtonGroup gendergr = new ButtonGroup();
        gendergr.add(male);
        gendergr.add(female);

        JPanel genderPanel = new JPanel();
        genderPanel.add(male);
        genderPanel.add(female);

        // Checkboxes
        JCheckBox programming = new JCheckBox("Programming");
        JCheckBox reading = new JCheckBox("Reading");
        JCheckBox travelling = new JCheckBox("Travelling");

        JPanel interestPanel = new JPanel();
        interestPanel.add(programming);
        interestPanel.add(reading);
        interestPanel.add(travelling);

        // Submit button
        JButton submit = new JButton("Submit");

        //new Action Listener 
         
        submit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){  
                String name = nametext.getText();
                String mail = emailtext.getText();
                char[] pass = passwordtext.getPassword();
                String gender = male.isSelected()? "Male":"Female";
                String interest = "";
                if(programming.isSelected())
                    interest+="Programming ";
                if(travelling.isSelected())
                    interest+="Travelling ";
                if(reading.isSelected())
                    interest+="Reading ";
                String message = "Name : "+name+"\n Email : "+mail+"\nGender : "+gender+"\nInterests : "+interest;
                JOptionPane.showMessageDialog(frame,message,"Registration Successful",JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Add components in pairs
        panel.add(name);
        panel.add(nametext);

        panel.add(mail);
        panel.add(emailtext);

        panel.add(pass);
        panel.add(passwordtext);

        panel.add(gender);
        panel.add(genderPanel);

        panel.add(interest);
        panel.add(interestPanel);

        panel.add(new JLabel()); // empty space
        panel.add(submit);

        frame.add(panel);

        frame.setVisible(true); // ALWAYS at last
    }
}