package com.mycompany.calculadoramvc;

public class Modelo {
    private double number1;
    private double number2;

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double sum() {
        return number1 + number2;
    }

    public double subtract() {
        return number1 - number2;
    }

    public double multiply() {
        return number1 * number2;
    }

    public double divide() {
        if (number2 != 0) {
            return number1 / number2;
        } else {
            throw new ArithmeticException("Error: división entre cero");
        }
    }
}
