package tn.amine.fizzbuzzkata;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FizzbuzzKataApplicationTests {

    @Test
    void testWithNumberIs1() {
        assertEquals("1", Fizzbuzz.play(1, 1));
    }

    @Test
    void testWithNumberIs2() {
        assertEquals("2", Fizzbuzz.play(2, 2));
    }

    @Test
    void testWithNumberIs3() {
        assertEquals("Fizz", Fizzbuzz.play(3, 3));
    }

    @Test
    void testWithNumberIs6() {
        assertEquals("Fizz", Fizzbuzz.play(6, 6));
    }

    @Test
    void testWithNumberIs9() {
        assertEquals("Fizz", Fizzbuzz.play(9, 9));
    }

    @Test
    void testWithNumberIs5() {
        assertEquals("Buzz", Fizzbuzz.play(5, 5));
    }

    @Test
    void testWithNumberIs10() {
        assertEquals("Buzz", Fizzbuzz.play(10, 10));
    }

    @Test
    void testWithNumberIs15() {
        assertEquals("FizzBuzz", Fizzbuzz.play(15, 15));
    }

    @Test
    void testWithNumberIs30() {
        assertEquals("FizzBuzz", Fizzbuzz.play(30, 30));
    }

    @Test
    void testWith2Numbers() {
        assertEquals("12", Fizzbuzz.play(1, 2));
    }

    @Test
    void testWithNumbersFrom1To15() {
        assertEquals("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz", Fizzbuzz.play(1, 15));
    }
}
