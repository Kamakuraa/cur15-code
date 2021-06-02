package ro.fasttrackit.curs15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ro.fasttrackit.curs15.NameFormatter;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class NameFormatterTest {
    private NameFormatter nameFormatter;

    @BeforeEach
    void setup() {
        // SETUP
        nameFormatter = new NameFormatter();
    }

    @Test
    @DisplayName("WHEN the name is Ana and lastNamre Then the return is A. Popescu")
    void simpleHappyFlow() {
        // RUN
        String result = nameFormatter.shortName("Ana", "Popescu");
        //ASSERT
        assertThat(result).isEqualTo("A. Popescu");
    }

    @Test
    @DisplayName("WHEN numele este la fel")
    void identicalNames() {
        // RUN
        String result = nameFormatter.shortName("Ana", "Ana");
        //ASSERT
        assertThat(result).isEqualTo("A. Ana");
    }

    @Test
    @DisplayName("When firstName is Null only the last name is printend")
    void firstNameIsNull() {
        String result = nameFormatter.shortName(null, "Popescu");

        assertThat(result).isEqualTo("Popescu");
    }

    @Test
    @DisplayName("When Lastname is Null only the last name is printend")
    void lastNameIsNull() {
        String result = nameFormatter.shortName("Ana", null);

        assertThat(result).isEqualTo("A.");
    }

    @Test
    @DisplayName("when firs and last is null")
    void LastNameAndFirst() {
        String result = nameFormatter.shortName(null, null);

        assertThat(result).isEmpty();
    }

}
