import java.awt.*;
import java.io.*;
import javax.swing.*;
public class JobApplicationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Job Application Form");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2));
        JTextField nameField = new JTextField();
        JTextField ageField = new JTextField();
        JTextField emailField = new JTextField();
        JTextField qualificationField = new JTextField();
        JButton submitButton = new JButton("Submit");
        frame.add(new JLabel("Name:")); frame.add(nameField);
        frame.add(new JLabel("Age:")); frame.add(ageField);
        frame.add(new JLabel("Email:")); frame.add(emailField);
        frame.add(new JLabel("Qualifications:")); frame.add(qualificationField);
        frame.add(submitButton);
        submitButton.addActionListener(e -> {
            String name = nameField.getText().trim();
            String age = ageField.getText().trim();
            String email = emailField.getText().trim();
            String qualifications = qualificationField.getText().trim();

            if (name.isEmpty() || age.isEmpty() || email.isEmpty() || qualifications.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "All fields must be filled!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("application_form.txt", true))) {
                    writer.write(String.format("Name: %s\nAge: %s\nEmail: %s\nQualifications: %s\n\n", name, age, email, qualifications));
                    JOptionPane.showMessageDialog(frame, "Form submitted successfully!");
                    nameField.setText(""); ageField.setText(""); emailField.setText(""); qualificationField.setText("");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Error writing to file!", "File Error", JOptionPane.ERROR_MESSAGE);
                    
                }
            }
        });

        frame.setVisible(true);
    }
}