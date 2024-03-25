package fr.intiformation.unaryOperator;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class mainUnaryOperator {
    public static void main(String[] args) {
       // UnaryOperator<Integer> cube = a -> a*a*a;
        IntUnaryOperator cube = a -> a*a*a;
        IntUnaryOperator increment = a -> a+1;

        var result = cube.andThen(increment).applyAsInt(5);
        System.out.println(result);

    }
}
