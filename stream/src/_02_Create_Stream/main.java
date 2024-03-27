package _02_Create_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        // 1
        List<Integer> myNumbers = new ArrayList<>();
        myNumbers.stream();


        // 2
        int[] myNumbers2 = {1,2,3,4,5};
        Arrays.stream(myNumbers2);

        // 3
        Stream<Integer> stream = Stream.of(1,2,3,4,5);

        //4
        Stream<Double> streamDouble = Stream.generate(()->Math.random());
        stream.forEach(a -> System.out.println(a));
        stream.forEach(System.out::println);
        stream.limit(5).forEach(System.out::println);
        
        //5
        Stream.iterate(1,x->x+1).limit(20).forEach(x -> System.out.println(x));
    }
}
