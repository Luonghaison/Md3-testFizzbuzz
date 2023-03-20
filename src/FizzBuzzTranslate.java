import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTranslate {
public static String fizzBuzzTranslate(int number) {
    if (number % 3 == 0) {
        return "Fizz";
    }
    if (number % 5 == 0) {
        return "Buzz";
    }
    if (number % 3 == 0 && number % 5 == 0) {
        return "fizzbuzz";
    }
    return "ko phu hop";
}

}
