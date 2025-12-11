import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingDemo {

    public static void main(String[] args) {
        // Create main frame
        JFrame frame = new JFrame("Simple Swing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a panel to hold components
        JPanel panel = new JPanel();

        // Label
        JLabel label = new JLabel("Enter your message:");

        // TextField
        JTextField textField = new JTextField(15);

        // TextArea
        JTextArea textArea = new JTextArea(5, 20);

        // Button that shows a dialog when clicked
        JButton button = new JButton("Show Message");

        // Add event to button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = new JDialog(frame, "Your Message");
                dialog.setSize(250, 150);

                JLabel dialogLabel = new JLabel("You wrote: " + textField.getText());
                dialog.add(dialogLabel);

                dialog.setLocationRelativeTo(frame);
                dialog.setVisible(true);
            }
        });

        // Add components to panel
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.add(new JScrollPane(textArea));

        // Add panel to frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
