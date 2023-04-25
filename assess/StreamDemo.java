package assess;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        // fixed integers
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6); 

        // stream from array
        Stream<Integer> stream1 = Stream.of(new Integer[]{1,2,3,4,5,6}); 

        //stream from List
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        Stream<Integer> stream2 = list.stream();

        //.generate()
        Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(50));
        // randomNumbers.limit(5).forEach(p -> System.out.println(p));

        // String
        Stream<String> stream3 = Stream.of("abc$defg".split("\\$"));

        // Collect Stream elements to a List
        List<Integer> evenList = stream2.filter( i -> i%2 == 0).collect(Collectors.toList());

        // Collect Stream elements to a List
        List<Integer> listNum = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            listNum.add(i);
        }
        Stream<Integer> streamInt = list.stream();
        Integer[] evenArray = streamInt.filter( i -> i%2 == 0).toArray(Integer[]::new);
        System.out.println(evenArray);

        evenList.forEach(p -> System.out.println(p));
    }
}
