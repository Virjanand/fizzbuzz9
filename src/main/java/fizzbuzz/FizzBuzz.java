package fizzbuzz;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz {

    private final FizzBuzzRules rules;

    public FizzBuzz() {
        rules = new FizzBuzzRules();
    }

    public List<String> getNumbers(int from, int until) {
        return IntStream.rangeClosed(from, until).mapToObj(number -> toFizzBuzz(number, rules.getRules(number))).collect(Collectors.toList());
    }

    private String toFizzBuzz(int number, Stream<Supplier<String>> rules) {
        String result = rules.reduce("", (fizzBuzzString, rule) -> fizzBuzzString += rule.get(), (a, b) -> a + b );
        if (result.isEmpty()) {
            return Integer.toString(number);
        }
        return result;
    }
}
