package CourseWork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;

//import static CourseWork.WinProgram.showVolume;
import java.util.concurrent.TimeUnit;


class Window extends JFrame {
    Window(){
        //расставляем кнопки и окна
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

        JTextField textField1 = new JTextField("Объём 1 ведра", 3);
        textField1.setCaretColor(Color.BLACK);
        textField1.setSize(110, 25);
        textField1.setLocation(10, 300);

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

        ImageIcon empty1 = new ImageIcon("buckets/empty.png");
        ImageIcon empty2 = new ImageIcon("buckets/empty.png");
        ImageIcon empty3 = new ImageIcon("buckets/empty.png");

        JLabel emptyOne = new JLabel(new ImageIcon("buckets//empty.png"));
        emptyOne.setIcon(empty1);
        emptyOne.setLocation(20, 0);
        emptyOne.setSize(150, 300);
        emptyOne.setText("0");
        getContentPane().add(emptyOne);

        JLabel emptyTwo = new JLabel(new ImageIcon("buckets//empty.png"));
        emptyTwo.setIcon(empty2);
        emptyTwo.setLocation(220, 0);
        emptyTwo.setSize(150, 300);
        emptyTwo.setText("0");
        getContentPane().add(emptyTwo);

        JLabel emptyThree = new JLabel(new ImageIcon("buckets//empty.png"));
        emptyThree.setIcon(empty3);
        emptyThree.setLocation(420, 0);
        emptyThree.setSize(150, 300);
        emptyThree.setText("0");
        getContentPane().add(emptyThree);

        button1.addActionListener(e -> {
            Filling temp = new Filling(Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()), Integer.parseInt(textField3.getText()));
            temp.setDesVolume(Integer.parseInt(textField4.getText()));
            ArrayDeque<Integer> res = new ArrayDeque<>();
            temp.recFill(res);
            JOptionPane.showMessageDialog(button1, check(temp.success) + "\n" + temp.result, "Проверка", JOptionPane.WARNING_MESSAGE);
        });

        button2.addActionListener((ActionEvent e) -> {
            Filling temp = new Filling(Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()), Integer.parseInt(textField3.getText()));
            temp.setDesVolume(Integer.parseInt(textField4.getText()));
            ArrayDeque<Integer> res = new ArrayDeque<>();
            temp.recFill(res);
            if (!temp.success)
                JOptionPane.showMessageDialog(button2, check(false), "Проверка", JOptionPane.WARNING_MESSAGE);

            showVolume(temp.one.getVolume(), emptyOne);
            showVolume(temp.two.getVolume(), emptyTwo);
            showVolume(temp.three.getVolume(), emptyThree);

            changeBuckets(temp.result, temp, emptyOne, emptyTwo, emptyThree);
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

    private void showVolume(int numb, JLabel one) {
        ((ImageIcon) one.getIcon()).getImage().flush();
        int temp = (int) Math.ceil((double) numb / 10) * 10;
        switch (temp) {
            case (100):
                one.setIcon(new ImageIcon("buckets/Full.png"));
                break;
            case (90):
                one.setIcon(new ImageIcon("buckets/nineTenth.png"));
                break;
            case (80):
                one.setIcon(new ImageIcon("buckets/eightTenth.png"));
                break;
            case (70):
                one.setIcon(new ImageIcon("buckets/sevenTenth.png"));
                break;
            case (60):
                one.setIcon(new ImageIcon("buckets/sixTenth.png"));
                break;
            case (50):
                one.setIcon(new ImageIcon("buckets/half.png"));
                break;
            case (40):
                one.setIcon(new ImageIcon("buckets/fourTenth.png"));
                break;
            case (30):
                one.setIcon(new ImageIcon("buckets/threeTenth.png"));
                break;
            case (20):
                one.setIcon(new ImageIcon("buckets/twoTenth.png"));
                break;
            case (10):
                one.setIcon(new ImageIcon("buckets/oneTenth.png"));
                break;
            case (0):
                one.setIcon(new ImageIcon("buckets/empty.png"));
                break;
        }
        one.setText(String.valueOf(numb));
    }

    private void changeBuckets(ArrayDeque<Integer> result, Filling buckets, JLabel one, JLabel two, JLabel three){
        int temp;
        while (result.size() != 0) {
            temp = result.poll();
            if (temp == buckets.two.getVolume()) {
                buckets.one.maxVolume -= temp;
                showVolume(buckets.two.getVolume(), two);
                showVolume(0, three);
                showVolume(buckets.one.maxVolume, one);
//                Thread.sleep(4000);
                timeout();

            } else if (temp == buckets.three.getVolume()) {
                buckets.one.maxVolume -= temp;
                showVolume(buckets.three.getVolume(), two);
                showVolume(buckets.one.maxVolume, one);
                showVolume(0, two);
//                Thread.sleep(4000);
                timeout();

            } else if (temp == buckets.difference.getVolume()) {
                if (buckets.two.getVolume() > buckets.three.getVolume()) {
                    buckets.one.maxVolume -= buckets.two.getVolume();
                    showVolume(buckets.two.getVolume(), two);
                    showVolume(0, three);
//                    Thread.sleep(4000);
                    timeout();//pause
                    showVolume(buckets.two.getVolume() - buckets.three.getVolume(), two);
                    showVolume(buckets.three.getVolume(), three);
//                    Thread.sleep(4000);
                    timeout();//pause
                    buckets.one.maxVolume += buckets.three.getVolume();
                    showVolume(buckets.one.maxVolume, one);
                    showVolume(0, two);
                    showVolume(0, three);
                } else if (buckets.three.getVolume() > buckets.two.getVolume()) {
                    buckets.one.maxVolume -= buckets.three.getVolume();
                    showVolume(buckets.three.getVolume(), two);
                    showVolume(0, two);
//                    Thread.sleep(4000);
                    timeout();//pause
                    showVolume(buckets.three.getVolume() - buckets.two.getVolume(), two);
                    showVolume(buckets.two.getVolume(), three);
//                    Thread.sleep(4000);
                    timeout();      //pause
                    buckets.one.maxVolume += buckets.two.getVolume();
                    showVolume(buckets.one.maxVolume, one);
                    showVolume(0, two);
                    showVolume(0, three);
                }
            }

        }
    }

    private void timeout() {
    }

    private String check(boolean success) {
        if (success)
            return ("Операция возможна");
        else {
            return ("Операция невозможна");
        }
    }
}
