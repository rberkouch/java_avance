package fr.intiformation.predicate;

import java.util.function.Predicate;

public class MainPredicate {
    public static void main(String[] args) {
        // Predicate return un
        Predicate<Integer> testInt = (x) -> x < 23;

        System.out.println(testInt.test(20));

        Predicate<String> hasLengthEven = str -> str.length()%2==0;
        System.out.println(hasLengthEven.test("Hello"));


        Predicate<String> hasLeftParenthese = str -> str.startsWith("(");
        Predicate<String> hasRightParenthese = str -> str.endsWith(")");

        // &&
        Predicate<String> hasParentheses = hasLeftParenthese.and(hasRightParenthese);
        //||
        Predicate<String> hasAtLeastParenthese = hasLeftParenthese.or(hasRightParenthese);

        // !

        Predicate<String> negate = hasAtLeastParenthese.negate();
        System.out.println((hasParentheses.test("Hello")));
        System.out.println((hasAtLeastParenthese.test("Hello")));
        System.out.println((negate.test("Hello")));
    }
}
