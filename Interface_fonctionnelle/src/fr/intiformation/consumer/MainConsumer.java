package fr.intiformation.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class MainConsumer {
    public static void main(String[] args) {
        //BiConsumer // deux types génériques
        // IntConsumer // par défaut on manipule des ints
       // Consumer

        List<String> myList = Arrays.asList("Monday","Tuesday","Wednesday");

        // approche impérative -> on dit comment on doit la faire
        for (var day : myList)
            System.out.println(day);


        // approche déclarative -> c'est à java de savoir faire
        myList.forEach((String day) -> {
            System.out.println(day);
        });

        // écriture simplifié
        myList.forEach(day -> System.out.println(day));

        Consumer<String> print = item -> System.out.println(item);
        Consumer<String> printLowerCase = item -> System.out.println(item.toLowerCase());
        Consumer<String> printUperCase = item -> System.out.println(item.toUpperCase());

        myList.forEach(print.andThen(printLowerCase).andThen(printUperCase));

    }
}
