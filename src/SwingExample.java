import javax.swing.*;

class SwingExample {
    public static void main(String[] args)  {
        JFrame frame = new JFrame("Simple GUI");
        JButton button = new JButton("Click Me");
        button.setBounds(50, 50, 50, 50);
        frame.add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}