package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double subtractAndDivision(double first, double second) {
        return subtract(first, second) + division(first, second);
    }

    public static double allAction(double first, double second) {
        return sum(first, second) + subtract(first, second)
               + multiply(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 10));
        System.out.println("Результат расчета равен: " + subtractAndDivision(10, 10));
        System.out.println("Результат расчета равен: " + allAction(10, 10));

    }
}
