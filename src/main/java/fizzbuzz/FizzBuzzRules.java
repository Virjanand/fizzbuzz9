package fizzbuzz;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class FizzBuzzRules {
    Stream<Supplier<String>> getRules(int number) {
        return Stream.of(() -> {
            if (number % 3 == 0) {
                return "Fizz";
            }
            return "";
        }, () -> {
            if (number % 5 == 0) {
                return "Buzz";
            }
            return "";
        });
    }
}
