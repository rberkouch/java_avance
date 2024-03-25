package fr.intiformation.binaryOperator;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class MainBinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<Integer> multuply = (a,b) -> a*b;
        Function<Integer,Integer> multiplyBy10 = a -> a*10;
        var result = multuply.andThen(multiplyBy10).apply(5,2);


    }
}
