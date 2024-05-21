package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RectangleAreaTest {

    @Test
    void whenP10K5Then3Dot47() {
        double expected = 3.47;
        int p = 10;
        int k = 5;
        double output = RectangleArea.square(p, k);
        double delta = 0.01;
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }

    @Test
    void whenP20K20Then4Dot53() {
        double expected = 4.53;
        int p = 20;
        int k = 20;
        double output = RectangleArea.square(p, k);
        double delta = 0.01;
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }

    @Test
    void whenP30K30Then7Dot023() {
        double expected = 7.023;
        int p = 30;
        int k = 30;
        double output = RectangleArea.square(p, k);
        double delta = 0.001;
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }
}