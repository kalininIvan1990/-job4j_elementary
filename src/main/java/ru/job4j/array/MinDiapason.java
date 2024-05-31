package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = start; index <= finish; index++) {
            if (array[index] < min) {
                int temp = min;
                min = array[index];
                array[index] = temp;
            }
        }
        return min;
    }
}
