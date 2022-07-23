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

}
