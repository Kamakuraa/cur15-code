package ro.fasttrackit.reCurs15;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class NameFormatterTest {

    private NameFormatter formatter;

    @BeforeEach
    void setup() {
        //SETUP
        formatter = new NameFormatter();
    }

    @Test
    @DisplayName("WHEN firstNa,me is Ana lastNam,e isPopescu then the return is A. Popescu")
    void simpleHappyFlow() {
        //RUN
        String result = formatter.shortName("Ana", "Popescu");
        //ASSERT
        assertThat(result).isEqualTo("A. Popescu");


    }

    @Test
    @DisplayName("WHEN two identical names is the same")
    void identicalName() {
        //RUN
        String result = formatter.shortName("Ana", "Ana");
        //ASSERT
        assertThat(result).isEqualTo("A. Ana");
    }

    @Test
    @DisplayName("WHEN fistName and lastName is null")
    void lastFirstNameNull() {
        //RUN
        String result = formatter.shortName(null, null);
        //ASSERT
        assertThat(result).isEmpty();
    }


}