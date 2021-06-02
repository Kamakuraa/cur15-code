package ro.fasttrackit.reCurs15;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class JUnitDemoTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("Once before all");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("before each ");
    }

    @Test
    @DisplayName("WHEN the test is called")
    void test() {
        System.out.println("Acesta este un test ");
    }

    @Test
    void test2() {
        System.out.println("Acesta este alt  test ");
    }

    @AfterEach
    void afterEach() {
        System.out.println("after each");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Once after all");
    }
}