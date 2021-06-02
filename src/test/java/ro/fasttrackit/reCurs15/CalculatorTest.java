package ro.fasttrackit.reCurs15;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("sum 1, 1 = 2")
    void simpleSum() {
        Assertions.assertThat(calculator.sum(1, 1)).isEqualTo(2);
        Assertions.assertThat(calculator.sum(3, 2)).isEqualTo(5);
    }

    @Test
    @DisplayName("dif 3, 1 = 2")
    void simpleSubstraction() {
        Assertions.assertThat(calculator.minus(3, 1)).isEqualTo(2);
    }

    @Test
    @DisplayName("impartit 3, 1 = 3")
    void impartit() {
        Assertions.assertThat(calculator.impartit(3, 1)).isEqualTo(3);
    }

    @Test
    @DisplayName("inmultit 3, 1 = 3")
    void inmultit() {
        Assertions.assertThat(calculator.inmultit(3, 1)).isEqualTo(3);
    }
}