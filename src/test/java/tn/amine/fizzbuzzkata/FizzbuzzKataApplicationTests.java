package tn.amine.fizzbuzzkata;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FizzbuzzKataApplicationTests {

    @Test
    void testWithNumberIs1() {
        assertEquals("1", Fizzbuzz.play(1));
    }

    @Test
    void testWithNumberIs2() {
        assertEquals("2", Fizzbuzz.play(2));
    }

    @Test
    void testWithNumberIs3() {
        assertEquals("Fizz", Fizzbuzz.play(3));
    }

    @Test
    void testWithNumberIs6() {
        assertEquals("Fizz", Fizzbuzz.play(6));
    }

    @Test
    void testWithNumberIs9() {
        assertEquals("Fizz", Fizzbuzz.play(9));
    }

    @Test
    void testWithNumberIs5() {
        assertEquals("Buzz", Fizzbuzz.play(5));
    }

}
