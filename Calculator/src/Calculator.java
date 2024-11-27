import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    double number, answer;
    int calculation;

    calFrame frame;
    JLabel label = new JLabel();
    JTextField textField = new JTextField();

    // Buttons with bounds passed in constructor
    calButton buttonZero = new calButton("0", new Color(68, 68, 68), 10, 410, 130, 40);
    calButton buttonOne = new calButton("1", new Color(68, 68, 68), 10, 350, 60, 40);
    calButton buttonTwo = new calButton("2", new Color(68, 68, 68), 80, 350, 60, 40);
    calButton buttonThree = new calButton("3", new Color(68, 68, 68), 150, 350, 60, 40);
    calButton buttonFour = new calButton("4", new Color(68, 68, 68), 10, 290, 60, 40);
    calButton buttonFive = new calButton("5", new Color(68, 68, 68), 80, 290, 60, 40);
    calButton buttonSix = new calButton("6", new Color(68, 68, 68), 150, 290, 60, 40);
    calButton buttonSeven = new calButton("7", new Color(68, 68, 68), 10, 230, 60, 40);
    calButton buttonEight = new calButton("8", new Color(68, 68, 68), 80, 230, 60, 40);
    calButton buttonNine = new calButton("9", new Color(68, 68, 68), 150, 230, 60, 40);
    calButton buttonDot = new calButton(".", new Color(68, 68, 68), 150, 410, 60, 40);
    calButton buttonClear = new calButton("C", new Color(0, 128, 128), 80, 110, 60, 40);
    calButton buttonDelete = new calButton("DEL", new Color(0, 128, 128), 150, 110, 60, 40);
    calButton buttonEqual = new calButton("=", new Color(68, 68, 68), 220, 350, 60, 100);
    calButton buttonMul = new calButton("x", new Color(68, 68, 68), 220, 230, 60, 40);
    calButton buttonDiv = new calButton("/", new Color(68, 68, 68), 220, 110, 60, 40);
    calButton buttonPlus = new calButton("+", new Color(68, 68, 68), 220, 290, 60, 40);
    calButton buttonMinus = new calButton("-", new Color(68, 68, 68), 220, 170, 60, 40);
    calButton buttonSquare = new calButton("x\u00B2", new Color(68, 68, 68), 80, 170, 60, 40);
    calButton buttonReciprocal = new calButton("1/x", new Color(68, 68, 68), 150, 170, 60, 40);
    calButton buttonSqrt = new calButton("\u221A", new Color(68, 68, 68), 10, 170, 60, 40);
    calButton buttonSwitch = new calButton("OFF", Color.RED, 10, 110, 60, 40);

    public Calculator() {
        prepareGUI();
        addComponents();
        addActionEvent();
    }

    private void addActionEvent() {
        buttonSwitch.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonReciprocal.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonDot.addActionListener(this);

    }

    private void addComponents() {
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.darkGray);
        frame.add(label);

        textField.setBounds(10, 40, 270, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);

        textField.setBackground(new
                Color(255, 255, 255));
        frame.add(textField);

        // Add buttons to the frame
        frame.add(buttonSwitch);
        frame.add(buttonClear);
        frame.add(buttonDelete);
        frame.add(buttonDiv);
        frame.add(buttonSqrt);
        frame.add(buttonSquare);
        frame.add(buttonReciprocal);
        frame.add(buttonMinus);
        frame.add(buttonSeven);
        frame.add(buttonEight);
        frame.add(buttonNine);
        frame.add(buttonMul);
        frame.add(buttonFour);
        frame.add(buttonFive);
        frame.add(buttonSix);
        frame.add(buttonPlus);
        frame.add(buttonOne);
        frame.add(buttonTwo);
        frame.add(buttonThree);
        frame.add(buttonEqual);
        frame.add(buttonZero);
        frame.add(buttonDot);
    }

    private void prepareGUI() {
        frame = new calFrame("Muzammal's Calculator");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == buttonSwitch) {
            if (buttonSwitch.getText().equals("ON")) {
                enable();
                buttonSwitch.setText("OFF");
                buttonSwitch.setBackground(Color.red);
            } else {
                disable();
                buttonSwitch.setText("ON");
                buttonSwitch.setBackground(Color.green);
            }
        } else if (source == buttonClear) {
            label.setText("");
            textField.setText("");
        } else if (source == buttonDelete) {
            int length = textField.getText().length();

            if (length > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(length - 1);
                textField.setText(back.toString());

            }
        } else if (source == buttonZero) {
            textField.setText(textField.getText() + "0");
        } else if (source == buttonOne) {
            textField.setText(textField.getText() + "1");
        } else if
        (source == buttonTwo) {
            textField.setText(textField.getText() + "2");
        } else if (source == buttonThree) {
            textField.setText(textField.getText() + "3");
        } else if (source == buttonFour) {
            textField.setText(textField.getText() + "4");
        } else if (source == buttonFive) {
            textField.setText(textField.getText() + "5");
        } else if (source == buttonSix) {
            textField.setText(textField.getText() + "6");
        } else if (source == buttonSeven) {
            textField.setText(textField.getText() + "7");
        } else if (source == buttonEight) {
            textField.setText(textField.getText() + "8");
        } else if (source == buttonNine) {
            textField.setText(textField.getText() + "9");
        } else if (source == buttonDot) {
            if (textField.getText().contains(".")) {
                return;
            } else {
                textField.setText(textField.getText() + ".");
            }
        } else if (source == buttonPlus) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");

            label.setText(str + "+");
            calculation = 1;
        } else if (source == buttonMinus) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "-");
            calculation = 2;
        } else if (source == buttonMul) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "X");
            calculation = 3;
        } else if (source == buttonDiv) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "/");
            calculation = 4;
        } else if (source == buttonSqrt) {
            number = Double.parseDouble(textField.getText());
            Double sqrt = Math.sqrt(number);
            textField.setText(Double.toString(sqrt));
        } else if (source == buttonSquare) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            double square = Math.pow(number, 2);
            String string = Double.toString(square);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
            label.setText("(sqr)");
        } else if (source == buttonReciprocal) {
            number = Double.parseDouble(textField.getText());
            double reciprocal = 1 / number;
            String string = Double.toString(reciprocal);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);

            }
        }
    }

    public void enable() {
        textField.setEnabled(true);
        label.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonDiv.setEnabled(true);

        buttonSqrt.setEnabled(true);
        buttonSquare.setEnabled(true);
        buttonReciprocal.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonMul.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonPlus.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonDot.setEnabled(true);

    }
    public void disable() {
        textField.setText("");
        label.setText(" ");
        buttonClear.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonDiv.setEnabled(false);
        buttonSqrt.setEnabled(false);
        buttonSquare.setEnabled(false);
        buttonReciprocal.setEnabled(false);
        buttonMinus.setEnabled(false);
        buttonSeven.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonNine.setEnabled(false);
        buttonMul.setEnabled(false);
        buttonFour.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonPlus.setEnabled(false);
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonZero.setEnabled(false);
        buttonDot.setEnabled(false);
    }
}
