package ro.fasttrackit.curs15;

import org.junit.jupiter.api.*;

public class JUnitDemoTest {
    @BeforeEach
    void beforeEach() {
        System.out.println("before test ");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("before all");
    }

    @Test
    @DisplayName("when the number is called is printed")
    void test() {
        System.out.println("este un test");
    }

    @Test
    void test2() {
        System.out.println("alt test");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("after all");
    }

    @AfterEach
    void afterEach() {
        System.out.println("after test");
    }

}
