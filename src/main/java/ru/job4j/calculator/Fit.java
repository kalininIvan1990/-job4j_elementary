package ru.job4j.calculator;

public class Fit {

    private static final double MAN_WEIGHT_COEFFICIENT = 1.15;
    private static final double WOMAN_WEIGHT_COEFFICIENT = 1.15;
    private static final int MAN_HEIGHT_OFFSET = 100;
    private static final int WOMAN_HEIGHT_OFFSET = 110;

    /**
     * Calculates the ideal weight for a man based on height.
     * @param height the height of the man in centimeters
     * @return the ideal weight in kilograms
     */
    public static double manWeight(short height) {
        return (height - MAN_HEIGHT_OFFSET) * MAN_WEIGHT_COEFFICIENT;
    }

    /**
     * Calculates the ideal weight for a woman based on height.
     * @param height the height of the woman in centimeters
     * @return the ideal weight in kilograms
     */
    public static double womanWeight(short height) {
        return (height - WOMAN_HEIGHT_OFFSET) * WOMAN_WEIGHT_COEFFICIENT;
    }

    public static void main(String[] args) {
        short height = 175;
        double man = manWeight(height);
        System.out.println("Man " + height + " cm is " + man + " kg");
        double woman = womanWeight(height);
        System.out.println("Woman " + height + " cm is " + woman + " kg");
    }
}

