import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTranslateTest {
    @Test
    void testCase1(){
        int number = 3;
        String expect = "Fizz";
        String result = FizzBuzzTranslate.fizzBuzzTranslate(number);
        assertEquals(expect, result);
    }

}