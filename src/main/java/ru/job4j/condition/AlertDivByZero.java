package ru.job4j.condition;

public class AlertDivByZero {
    public static void checkNumber(int number) {
        boolean result = number == 0;
        if (result) {
            System.out.println("Could not div by 0.");
        }
        if (number < 0) {
            System.out.println("This is negative number");
        }
    }

    public static void main(String[] args) {
        checkNumber(0);
        checkNumber(-2);
    }
}
