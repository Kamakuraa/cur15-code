package ro.fasttrackit.curs15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ro.fasttrackit.curs15.Calculator;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("sum")
    void singleSum() {
        assertThat(calculator.sum(1, 2)).isEqualTo(3);
        assertThat(calculator.sum(3, 2)).isEqualTo(5);
        assertThat(calculator.sum(-3, 2)).isEqualTo(-1);
    }

    @Test
    @DisplayName("minus method works")
    void simpleSubstraction() {
        assertThat(calculator.minus(3, 2)).isEqualTo(1);
        assertThat(calculator.minus(-3, -2)).isEqualTo(-1);
    }

    @Test
    @DisplayName("impartit method works")
    void imp() {
        assertThat(calculator.impartit(2, 2)).isEqualTo(1);
        assertThat(calculator.impartit(2, 0)).isEqualTo(0);
    }

    @Test
    @DisplayName("inmultit method works")
    void inm() {
        assertThat(calculator.inmultit(2, 2)).isEqualTo(4);
        assertThat(calculator.inmultit(2, 0)).isEqualTo(0);
    }

}
