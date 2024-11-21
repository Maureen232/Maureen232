import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DatingAppGUI {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        // Create the frame for the app window
        JFrame frame = new JFrame("Simple Dating App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);  // Set window size

        // Create labels and text fields for user input
        JLabel nameLabel = new JLabel("Name: ");
        JTextField nameField = new JTextField(20);

        JLabel ageLabel = new JLabel("Age: ");
        JTextField ageField = new JTextField(5);

        JLabel locationLabel = new JLabel("Location: ");
        JTextField locationField = new JTextField(20);

        // Create a button to submit the profile
        JButton submitButton = new JButton("Submit Profile");

        // Create a label to display the submitted profile
        JLabel profileLabel = new JLabel("Profile Summary will appear here.");

        // Action listener for the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve the data from text fields
                String name = nameField.getText();
                String age = ageField.getText();
                String location = locationField.getText();

                // Display the profile summary
                String profileSummary = "<html><strong>Profile Summary:</strong><br>" +
                        "Name: " + name + "<br>" +
                        "Age: " + age + "<br>" +
                        "Location: " + location + "</html>";
                profileLabel.setText(profileSummary);
            }
        });

        // Create a panel and add components to it
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));  // Layout with 5 rows and 2 columns

        panel.add(nameLabel);
        panel.add(nameField);

        panel.add(ageLabel);
        panel.add(ageField);

        panel.add(locationLabel);
        panel.add(locationField);

        panel.add(submitButton);
        panel.add(profileLabel);

        // Add the panel to the frame
        frame.add(panel);

        // Make the window visible
        frame.setVisible(true);
    }
}

