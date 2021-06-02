package ro.fasttrackit.reCurs15.recursive;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordLenghtTest {
    @Test
    void testLen() {
        WordLenght wordLenght = new WordLenght();
        Assertions.assertThat(wordLenght.len("abc")).isEqualTo(3);
        Assertions.assertThat(wordLenght.len("")).isEqualTo(0);
        Assertions.assertThat(wordLenght.len(null)).isEqualTo(0);
        Assertions.assertThat(wordLenght.len("1234567890")).isEqualTo(10);
    }

    @Test
    void testRev() {
        WordLenght wordLenght = new WordLenght();
        Assertions.assertThat(wordLenght.rev("abc")).isEqualTo("cba");
        Assertions.assertThat(wordLenght.rev("abc")).isEqualTo("ca");
    }

}