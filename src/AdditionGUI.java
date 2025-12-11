import java.awt.*;
import java.awt.event.*;

public class AdditionGUI extends Frame implements ActionListener {

    TextField t1 = new TextField(10);
    TextField t2 = new TextField(10);
    Button add = new Button("Add");
    Button sub = new Button("sub");
    Button mul = new Button("mul");
    Button div = new Button("div");
    TextField t3 = new TextField(10);

    AdditionGUI() {
        setLayout(new FlowLayout());
        add(t1);
        add(t2);
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(t3);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        setSize(400, 500);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)   {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        t3.setText("" + (a + b));
    }

    public static void main(String[] args)  {
        new AdditionGUI();
    }

}