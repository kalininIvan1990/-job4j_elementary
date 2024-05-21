package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when11to55Then5Dot656() {
        double expected = 5.656;
        int x1 = 1;
        int y1 = 1;
        int x2 = 5;
        int y2 = 5;
        double output = Point.distance(x1, y1, x2, y2);
        double delta = 0.001;
        assertThat(expected).isEqualTo(output, withPrecision(delta));
    }

    @Test
    void when00to97Then11Dot401() {
        double expected = 11.401;
        int x1 = 0;
        int y1 = 0;
        int x2 = 9;
        int y2 = 7;
        double output = Point.distance(x1, y1, x2, y2);
        double delta = 0.001;
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }

    @Test
    void name() {
        double expected = 1.414;
        int x1 = 2;
        int y1 = 2;
        int x2 = 3;
        int y2 = 3;
        double output = Point.distance(x1, y1, x2, y2);
        double delta = 0.001;
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }
}