package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Learn_StreamAPI4 {
    public static void main(String[] args) {
        //terminal operation which we do at the end of the Stream
        //like max(), min() , count(), collect(Collectors.toList()) ..etc

        //for very big list
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.parallelStream().forEach(System.out::println);
    }
}
