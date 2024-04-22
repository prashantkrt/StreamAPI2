package StreamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Learn_StreamAPI3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 2, 54, 6, 78, 10, 31, 90, 67, 23);

        int sum = list.stream().filter(i -> i % 2 == 0).mapToInt(i -> i).sum();
        System.out.println(sum);

        long count = list.stream().filter(i -> i % 2 == 0).mapToInt(i -> i).count();
        System.out.println(count);

        int min = list.stream().min(Integer::compare).get(); //gives the first element after sorting
        System.out.println(min);

        int max = list.stream().max((i,j)->i>j?1:-1).get(); //gives the last element after sorting
        System.out.println(max);

        int max2 = list.stream().max(Integer::compare).get();
        System.out.println(max2);

        List<Integer> filteredList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(filteredList);

        List<Integer> filteredListOdd = list.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
        System.out.println(filteredListOdd);

        List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctList);
        //sorted
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
        //sorted Descending order
        List<Integer> descendingOrder = list.stream().sorted((a, b) -> b - a).collect(Collectors.toList());
        System.out.println(descendingOrder);

        List<Integer> limitedList = list.stream().limit(3).collect(Collectors.toList());
        System.out.println(limitedList);
        //skipping start element
        List<Integer> skipFirstList = list.stream().sorted().limit(3).skip(2).collect(Collectors.toList());
        System.out.println(skipFirstList);

        List<Integer> collect = Stream.iterate(0, i -> i + 1).limit(101).skip(1).collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> collect1 = Stream.iterate(0, i -> i + 1).limit(101).skip(1).filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(collect1);

        List<Integer> collect2 = Stream.iterate(0, i -> i + 1).filter(i -> i % 2 == 0).map(i -> i + 2).limit(5).sorted((a, b) -> b - a).peek(System.out::println).distinct().collect(Collectors.toList());
        System.out.println(collect2);
        //min and max
        Stream.iterate(0,i->i+1).filter(i->i%2==0).map(x->x/20).limit(5).max((i,j)->i-j).ifPresent(System.out::println);
    }
}
