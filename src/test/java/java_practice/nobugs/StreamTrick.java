package java_practice.nobugs;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class StreamTrick {
    public static void main(String[] args) {
        List<String> result = Stream.of("a", "b", "c", "d")
                .peek(s -> System.out.println("Peek: " + s))
                .filter(s -> {
                    boolean keep = !"b".equals(s);
                    System.out.println("Filter: " + s + " -> " + keep);
                    return keep;
                })
                .map(s -> {
                    String mapped = s.toUpperCase();
                    System.out.println("Map: " + s + " -> " + mapped);
                    return mapped;
                })
                .limit(2)
                .collect(Collectors.toList());

        System.out.println("Result: " + result);
    }
}
