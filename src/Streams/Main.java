package Streams;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by soich on 29.05.2018.
 */
public class Main {

    public static void main(String[] args) {

        Stream<Integer> stream1 = Stream.iterate(1, n -> n+1);
        Stream<Integer> stream2 = stream1.peek(System.out::println);
        Stream<Integer> stream3 = stream2.filter(n ->  n > 3);
        System.out.println("---");

        Optional<Integer> optint = stream3.skip(1).findFirst();
        int number = optint.get();
        System.out.println("=> " + number);

    }


    // der Stream gibt Java aus, und true für allMatch, dann gibt er Stream aus und liefert dann false bei allMatch
    private boolean giveback(){
        return Stream.of("Java", "Stream", "Test")
            .peek(s -> System.out.println(s + " "))
            .allMatch(s -> s.startsWith("J"));

    }
}
