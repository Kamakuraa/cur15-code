package ro.fasttrackit.recursive;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SumNumberTest {
    @Test
    void testSumNumbers() {
        SumNumber sumNumber = new SumNumber();
        assertThat(sumNumber.sum(0)).isEqualTo(0);
        assertThat(sumNumber.sum(10)).isEqualTo(55);
        assertThat(sumNumber.sum(1)).isEqualTo(1);

    }
}