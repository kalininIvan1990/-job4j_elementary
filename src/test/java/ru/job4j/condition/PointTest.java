package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when11to55Then5Dot656() {
        double expected = 5.656;
        Point a = new Point(1, 1);
        Point b = new Point(5, 5);
        double output = a.distance(b);
        double delta = 0.001;
        assertThat(expected).isEqualTo(output, withPrecision(delta));
    }

    @Test
    void when00to97Then11Dot401() {
        double expected = 11.401;
        Point a = new Point(0, 0);
        Point b = new Point(9, 7);
        double output = a.distance(b);
        double delta = 0.001;
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }

    @Test
    void when22to33Then1Dot414() {
        double expected = 1.414;
        Point a = new Point(2, 2);
        Point b = new Point(3, 3);
        double output = a.distance(b);
        double delta = 0.001;
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }

}