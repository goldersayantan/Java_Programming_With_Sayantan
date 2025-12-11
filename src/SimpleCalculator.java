import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Simple Calculator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Input panel (labels + text fields)
            JPanel inputPanel = new JPanel(new GridLayout(3, 2, 5, 5));
            JLabel l1 = new JLabel("Number 1:");
            JTextField num1Field = new JTextField();
            JLabel l2 = new JLabel("Number 2:");
            JTextField num2Field = new JTextField();
            JLabel l3 = new JLabel("Result:");
            JTextField resultField = new JTextField();
            resultField.setEditable(false);

            inputPanel.add(l1);
            inputPanel.add(num1Field);
            inputPanel.add(l2);
            inputPanel.add(num2Field);
            inputPanel.add(l3);
            inputPanel.add(resultField);

            // Buttons panel
            JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
            JButton addBtn = new JButton("+");
            JButton subBtn = new JButton("-");
            JButton mulBtn = new JButton("*");
            JButton divBtn = new JButton("/");
            btnPanel.add(addBtn);
            btnPanel.add(subBtn);
            btnPanel.add(mulBtn);
            btnPanel.add(divBtn);

            // Top-level layout
            frame.getContentPane().setLayout(new BorderLayout(8, 8));
            frame.getContentPane().add(inputPanel, BorderLayout.CENTER);
            frame.getContentPane().add(btnPanel, BorderLayout.SOUTH);

            // Shared action handler
            ActionListener action = e -> {
                try {
                    String t1 = num1Field.getText().trim();
                    String t2 = num2Field.getText().trim();

                    if (t1.isEmpty() || t2.isEmpty()) {
                        JOptionPane.showMessageDialog(frame, "Please enter both numbers.", "Input needed",
                                JOptionPane.WARNING_MESSAGE);
                        return;
                    }

                    double n1 = Double.parseDouble(t1);
                    double n2 = Double.parseDouble(t2);
                    double result;

                    Object src = e.getSource();
                    if (src == addBtn) {
                        result = n1 + n2;
                    } else if (src == subBtn) {
                        result = n1 - n2;
                    } else if (src == mulBtn) {
                        result = n1 * n2;
                    } else { // division
                        if (n2 == 0) {
                            JOptionPane.showMessageDialog(frame, "Cannot divide by zero.", "Math error",
                                    JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        result = n1 / n2;
                    }

                    // Remove trailing .0 for whole numbers
                    if (result == (long) result) {
                        resultField.setText(Long.toString((long) result));
                    } else {
                        resultField.setText(Double.toString(result));
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid number format.\nUse digits like 12 or 3.5",
                            "Invalid input", JOptionPane.ERROR_MESSAGE);
                }
            };

            addBtn.addActionListener(action);
            subBtn.addActionListener(action);
            mulBtn.addActionListener(action);
            divBtn.addActionListener(action);

            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
