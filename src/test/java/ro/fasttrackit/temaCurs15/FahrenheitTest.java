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
        assertThat(fahrenheit.fahrenheitToCelsius(55)).isEqualTo(12.777777777777779);

    }

    @Test
    @DisplayName("CELSIUS method works")
    void fahrenheitToCelsius() {
        assertThat(fahrenheit.celsius(33)).isEqualTo(91.4);


    }

}