import javax.swing.*;

public class JDialogExample {
    public static void main(String[] args)   {
        JDialog dialog = new JDialog();
        dialog.setTitle("Simple Dialog");
        dialog.setSize(300, 300);
        dialog.add(new JLabel("Hello World!"));
        dialog.setVisible(true);
    }
}