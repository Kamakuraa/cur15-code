package ro.fasttrackit.temaCurs15.recursivitate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class RecursiveTest {
    Recursive recursive = new Recursive();

    @BeforeEach
    void setup() {
        recursive = new Recursive();
    }

    @Test
    void isPal() {
        Assertions.assertThat(recursive.isPal("ana")).isEqualTo(true);
        Assertions.assertThat(recursive.isPal("")).isEqualTo(true);
        Assertions.assertThat(recursive.isPal(null)).isEqualTo(false);
//        Assertions.assertThat(recursive.isPal(null)).isEqualTo(true);
//        Assertions.assertThat(recursive.isPal("")).isEqualTo(false);
//        Assertions.assertThat(recursive.isPal("madam")).isEqualTo(false);
    }

    @Test
    void sum() {
        Assertions.assertThat(recursive.sum(5)).isEqualTo(14);
        Assertions.assertThat(recursive.sum(0)).isEqualTo(0);
        Assertions.assertThat(recursive.sum(1)).isEqualTo(0);
//        Assertions.assertThat(recursive.sum(10)).isEqualTo(10000);
    }

    @Test
    void even() {
        Assertions.assertThat(recursive.evenSum(2)).isEqualTo(6);
//        Assertions.assertThat(recursive.evenSum(120)).isEqualTo(1);
    }

    @Test
    void digits() {
        Assertions.assertThat(recursive.sumDigits(123)).isEqualTo(6);
    }

}