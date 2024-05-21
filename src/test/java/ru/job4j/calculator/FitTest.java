package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMan175Then86Dot25() {
        short input = 175;
        double expected = 86.25;
        double output = Fit.manWeight(input);
        double delta = 0.01;
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }

    @Test
    void whenWoman168Then66Dot7() {
        short input = 168;
        double expected = 66.7;
        double output = Fit.womanWeight(input);
        double delta = 0.01;
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }
}