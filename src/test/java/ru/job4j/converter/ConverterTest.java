package ru.job4j.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @org.junit.jupiter.api.Test
    void whenConvert210RblThen3Euro() {
        float input = 210;
        float expected = 3;
        float ouput = Converter.rubleToEuro(input);
        float value = 0.0001f;
        assertThat(ouput).isEqualTo(expected, withPrecision(value));
    }

    @org.junit.jupiter.api.Test
    void whenConvert240RblThen4Dollar() {
        float input = 240;
        float expected = 4;
        float output = Converter.rubleToDollar(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

}