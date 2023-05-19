package com.mycompany.calculadoramvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador {
    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;

        this.vista.addCalculationListener(new CalculationListener());
    }

    class CalculationListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double number1 = vista.getNumber1();
            double number2 = vista.getNumber2();

            try {
                if (e.getSource() == vista.addButton) {
                    modelo.setNumber1(number1);
                    modelo.setNumber2(number2);
                    double result = modelo.sum();
                    vista.setResult(result);
                } else if (e.getSource() == vista.subtractButton) {
                    modelo.setNumber1(number1);
                    modelo.setNumber2(number2);
                    double result = modelo.subtract();
                    vista.setResult(result);
                } else if (e.getSource() == vista.multiplyButton) {
                    modelo.setNumber1(number1);
                    modelo.setNumber2(number2);
                    double result = modelo.multiply();
                    vista.setResult(result);
                } else if (e.getSource() == vista.divideButton) {
                    modelo.setNumber1(number1);
                    modelo.setNumber2(number2);
                    double result = modelo.divide();
                    vista.setResult(result);
                }
            } catch (ArithmeticException ex) {
                vista.setResult(Double.NaN);
                JOptionPane.showMessageDialog(vista, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);
    }
}
