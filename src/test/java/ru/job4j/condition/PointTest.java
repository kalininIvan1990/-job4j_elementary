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

    @Test
    void whenDistance3d20To21To21Then2Dot449() {
        Point a = new Point(2, 2, 2);
        Point b = new Point(0, 1, 1);
        double expected = 2.449;
        double output = a.distance3d(b);
        double delta = 0.001;
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }

    @Test
    void whenDistance3d00To00To00Then0() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 0);
        double expected = 0;
        double output = a.distance3d(b);
        double delta = 0.001;
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }

    @Test
    void whenDistance3d04To04To04Then6Dot928() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(4, 4, 4);
        double expected = 6.928;
        double output = a.distance3d(b);
        double delta = 0.001;
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }
}