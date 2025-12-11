import java.awt.*;

public class AWTExample {
    public AWTExample() {
        Frame f = new Frame("Simple GUI");
        Button b = new Button("Click Me");
        b.setBounds(50, 50, 100, 100);
        f.add(b);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args)  {
        new AWTExample();
    }
}