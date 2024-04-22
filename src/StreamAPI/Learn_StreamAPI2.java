package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Learn_StreamAPI2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "def", "ghi", "jkl", "mno", "pqrs");
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Stream<Integer> stream2 = Stream.iterate(0, i -> i + 1).limit(10);
        stream2.forEach(System.out::println);

        Stream<String> stream3 = Stream.generate(() -> "Hello World").limit(5);
        stream3.forEach(System.out::println);

        System.out.println();
        Stream<Integer> stream4 = Stream.generate(()-> (int) (Math.random() * 100)).limit(10);
        stream4.forEach(System.out::print);
    }
}
