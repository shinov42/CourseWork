package CourseWork;

import javax.swing.*;
import java.awt.*;

import java.util.ArrayDeque;


class Window extends JFrame {
    Window() {
        //расставляем кнопки и окна
        super("Задача о переливании воды");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        JButton button1 = new JButton("Проверить");
        button1.setSize(300, 30);
        button1.setLocation(0, 435);
        panel.add(button1);

        JButton button2 = new JButton("Запустить");
        button2.setSize(300, 30);
        button2.setLocation(300, 435);
        panel.add(button2);

        JTextField textField1 = new JTextField("Объём 1 ведра", 3);
        textField1.setCaretColor(Color.BLACK);
        textField1.setSize(110, 25);
        textField1.setLocation(10, 400);

        JTextField textField2 = new JTextField("Объём 2 ведра", 3);
        textField2.setCaretColor(Color.BLACK);
        textField2.setSize(110, 25);
        textField2.setLocation(160, 400);

        JTextField textField3 = new JTextField("Объём 3 ведра", 3);
        textField3.setCaretColor(Color.BLACK);
        textField3.setSize(110, 25);
        textField3.setLocation(310, 400);

        JTextField textField4 = new JTextField("Желаемый объём", 3);
        textField4.setCaretColor(Color.BLACK);
        textField4.setSize(110, 25);
        textField4.setLocation(460, 400);

        Icon image = new ImageIcon("C:\\emptyBuckets.jpeg");
        JLabel empty = new JLabel(image);
//        JLabel empty = new JLabel("empty", image, SwingConstants.CENTER);
        empty.setLocation(40,35);
        empty.setSize(500, 300);
        getContentPane().add(empty);



        button1.addActionListener(e -> {
            Filling temp = new Filling(Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()), Integer.parseInt(textField3.getText()));
            temp.setDesVolume(Integer.parseInt(textField4.getText()));
            ArrayDeque<Integer> res = new ArrayDeque<>();
            temp.recFill(res);
            JOptionPane.showMessageDialog(button1, check(temp.success) + "\n" + temp.result, "Проверка", JOptionPane.WARNING_MESSAGE);
        });

        // TODO: 17.12.2017 Этой кнопкой запускать картинки
//        button2.addActionListener(new ActionListener() {
//
//            public void actionPerformed(ActionEvent e) {
//                Filling temp = new Filling(Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()), Integer.parseInt(textField3.getText()));
//                temp.setDesVolume(Integer.parseInt(textField4.getText()));
//                ArrayDeque<Integer> res= new ArrayDeque<>();
//                temp.recFill(res);
//                JOptionPane.showMessageDialog(button2, check(temp.success) + temp.result, "Проверка", JOptionPane.WARNING_MESSAGE);
//            }
//        });


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

        pack();
        setSize(600, 500);
//        setSize(1000, 700);

    }

    private String check(boolean success) {
        if (success)
            return ("Операция возможна");
        else return ("Операция невозможна");
    }
}
