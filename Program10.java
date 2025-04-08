
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="Program10" width=300 height=200></applet>
 */
public class Program10 extends Applet implements ActionListener {

    TextField t1, t2, result;
    Button add, sub, mul, div, clear;
    Label l1, l2, l3;

    public void init() {
        // Set layout
        setLayout(new GridLayout(5, 2, 5, 5));

        // Labels
        l1 = new Label("Enter First Number:");
        l2 = new Label("Enter Second Number:");
        l3 = new Label("Result:");

        // TextFields
        t1 = new TextField();
        t2 = new TextField();
        result = new TextField();
        result.setEditable(false);

        // Buttons
        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");
        clear = new Button("Clear");

        // Add components
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(result);
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(clear);

        // Register listeners
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        clear.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        double num1 = 0, num2 = 0, res = 0;
        String s = e.getActionCommand();

        try {
            if (!s.equals("Clear")) {
                num1 = Double.parseDouble(t1.getText());
                num2 = Double.parseDouble(t2.getText());
            }

            switch (s) {
                case "+":
                    res = num1 + num2;
                    result.setText(String.valueOf(res));
                    break;
                case "-":
                    res = num1 - num2;
                    result.setText(String.valueOf(res));
                    break;
                case "*":
                    res = num1 * num2;
                    result.setText(String.valueOf(res));
                    break;
                case "/":
                    if (num2 == 0) {
                        result.setText("Divide by 0 Error"); 
                    }else {
                        result.setText(String.valueOf(num1 / num2));
                    }
                    break;
                case "Clear":
                    t1.setText("");
                    t2.setText("");
                    result.setText("");
                    break;
            }
        } catch (NumberFormatException ex) {
            result.setText("Invalid Input");
        }
    }
}
