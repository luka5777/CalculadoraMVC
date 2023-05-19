package com.mycompany.calculadoramvc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Vista extends JFrame {
    private final JTextField number1TextField;
    private final JTextField number2TextField;
    private final JTextField resultTextField;
    JButton addButton;
    JButton subtractButton;
    JButton multiplyButton;
    JButton divideButton;

    public Vista() {
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLayout(new GridLayout(4, 2));

        
        number1TextField = new JTextField();
        number2TextField = new JTextField();
        resultTextField = new JTextField();
        resultTextField.setEditable(false);
        

        addButton = new JButton("Sumar");
        subtractButton = new JButton("Restar");
        multiplyButton = new JButton("Multiplicar");
        divideButton = new JButton("Dividir");

        add(new JLabel("Número 1:"));
        add(number1TextField);
        add(new JLabel("Número 2:"));
        add(number2TextField);
        add(new JLabel("Resultado:"));
        add(resultTextField);
        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public double getNumber1() {
        return Double.parseDouble(number1TextField.getText());
    }

    public double getNumber2() {
        return Double.parseDouble(number2TextField.getText());
    }

    public void setResult(double result) {
        resultTextField.setText(String.valueOf(result));
    }

    public void addCalculationListener(ActionListener listener) {
        addButton.addActionListener(listener);
        subtractButton.addActionListener(listener);
        multiplyButton.addActionListener(listener);
        divideButton.addActionListener(listener);
    }
}
