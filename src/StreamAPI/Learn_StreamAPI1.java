package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Learn_StreamAPI1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.forEach(System.out::println);
        list.stream().filter(x -> x % 2 == 0).map(x -> x * x).forEach(System.out::println);
        int [] arr = new int[]{12,13,14};
        Arrays.stream(arr).forEach(System.out::println);

        String [] str = {"apple","banana"};
        Stream<String> stream = Arrays.stream(str);

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);
    }
}
