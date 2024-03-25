package fr.intiformation.function;

import java.util.function.Function;

public class MainFunction {
    public static void main(String[] args) {
        Function<String,Character> getFIrstChar = str -> str.charAt(0);

        System.out.println(getFIrstChar.apply("Hello"));

        // $ -> *
        Function <String,String> dollarToStar = str -> str.replace("$","*");
        // * -> !
        Function <String,String> starToExclamation = str -> str.replace("*","!");

        var result = dollarToStar
                .andThen(starToExclamation)
                .apply("$Hello*World");


        System.out.println(result); // 1) *Hello*World 2) !Hello!World


        var result2 = dollarToStar
                .compose(starToExclamation)
                .apply("$Hello*World");

        System.out.println(result2); // 1) $Hello!World 2) *Hello!World
    }
}
