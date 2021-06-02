package ro.fasttrackit.temaCurs15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ro.fasttrackit.temaCurs15.fahrenheit.Fahrenheit;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FahrenheitTest {
    Fahrenheit fahrenheit;

    @BeforeEach
    void setup() {
        fahrenheit = new Fahrenheit();
    }

    @Test
    @DisplayName("FAHRENHEIT method works")
    void celsius() {
        assertThat(fahrenheit.fahrenheitToCelsius(50)).isEqualTo(10);

        assertThat(fahrenheit.fahrenheitToCelsius(50)).isEqualTo(50);
    }

    @Test
    @DisplayName("CELSIUS method works")
    void fahrenheitToCelsius() {
        assertThat(fahrenheit.celsius(10)).isEqualTo(10);

        assertThat(fahrenheit.celsius(1)).isEqualTo(50);

    }

}