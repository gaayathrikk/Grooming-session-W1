import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class filter{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,2,2,2,3,3,4,5,6,7,8,9,10);
        // filter() does not actually perform any filtering, but instead creates a new stream that, when traversed, contains the elements of the initial stream that match the given predicate
        list.stream().filter(n -> n%2 == 0).map(n -> n*3).forEach(System.out::println);
        list.stream().flatMap(n -> Stream.of(n*6)).forEach(System.out::println);
        long count = list.stream().distinct().count();
        System.out.println(count);
        // list.stream().map(n -> n%2 == 0).forEach(System.out::println);
    }
}