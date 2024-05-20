package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float inputRubToEuro = 140;
        float expectedEuro = 2;
        float outputEuro = Converter.rubleToEuro(inputRubToEuro);
        boolean passedConvertEuro = expectedEuro == outputEuro;

        float inputRubToDollar = 240;
        float expectedDollar = 4;
        float outputDollar = Converter.rubleToDollar(inputRubToDollar);
        boolean passedConvertDollar = expectedDollar == outputDollar;

        System.out.println("140 rubles are 2 Euro. Test result : " + passedConvertEuro);
        System.out.println("240 rubles are 4 Dollars. Test result : " + passedConvertDollar);

    }
}
