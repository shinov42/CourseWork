package CourseWork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Window extends JFrame {
    Window() {
        super("Задача о переливании воды");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        JButton button1 = new JButton("Проверить");
        button1.setSize(300, 30);
        button1.setLocation(0, 335);
        panel.add(button1);
        JButton button2 = new JButton("Запустить");
        button2.setSize(300, 30);
        button2.setLocation(300, 335);
        panel.add(button2);

        ActionListener actionListener = new TestActionListener();
        button1.addActionListener(actionListener);

        JTextField textField1 = new JTextField("Объём 1 ведра", 3);
        textField1.setCaretColor(Color.BLACK);
        textField1.setSize(110, 25);
        textField1.setLocation(10, 300);
//        getContentPane().add(textField1);


        JTextField textField2 = new JTextField("Объём 2 ведра", 3);
        textField2.setCaretColor(Color.BLACK);
        textField2.setSize(110, 25);
        textField2.setLocation(160, 300);


        JTextField textField3 = new JTextField("Объём 3 ведра", 3);
        textField3.setCaretColor(Color.BLACK);
        textField3.setSize(110, 25);
        textField3.setLocation(310, 300);


        JTextField textField4 = new JTextField("Желаемый объём", 3);
        textField4.setCaretColor(Color.BLACK);
        textField4.setSize(110, 25);
        textField4.setLocation(460, 300);


        button1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Filling temp = new Filling(Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()), Integer.parseInt(textField3.getText()));
                temp.setDesVolume(Integer.parseInt(textField4.getText()));
                temp.recFill();
                JOptionPane.showMessageDialog(button1, check(temp.success), "Проверка", JOptionPane.WARNING_MESSAGE);
            }
        });

        button2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Filling temp = new Filling(Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()), Integer.parseInt(textField3.getText()));
                temp.setDesVolume(Integer.parseInt(textField4.getText()));
                temp.recFill();
                JOptionPane.showMessageDialog(button2, check(temp.success), "Проверка", JOptionPane.WARNING_MESSAGE);
            }
        });


        getContentPane().
                add(textField1);

        getContentPane().
                add(textField2);

        getContentPane().
                add(textField3);

        getContentPane().
                add(textField4);

        getContentPane().
                add(panel);

        setSize(600, 400);
    }

    private String check(boolean success) {
        if (success)
            return ("Операция возможна");
        else return ("Операция невозможна");
    }
}
