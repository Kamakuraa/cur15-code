package ro.fasttrackit.reCurs15.recursive;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumNumbersTest {
    @Test
    void testNumbers() {
        SumNumbers sumNumbers = new SumNumbers();
        Assertions.assertThat(sumNumbers.sum(1)).isEqualTo(1);
        Assertions.assertThat(sumNumbers.sum(10)).isEqualTo(55);
        Assertions.assertThat(sumNumbers.sum(0)).isEqualTo(0);
        Assertions.assertThat(sumNumbers.sum(1132)).isEqualTo(641278);
    }
}