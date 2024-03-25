package fr.intiformation.supplier;

import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class MainSupplier {
    public static void main(String[] args) {
        //DoubleSupplier

       // Supplier<Integer> getActualYear = LocalDateTime.now()::getYear;

        Supplier<Integer> getActualYear = () -> {
            return LocalDateTime.now().getYear();
        };

        IntSupplier getActualYearInt = () -> {
            return LocalDateTime.now().getYear();
        };

        // lazy evaluation
        System.out.println(getActualYear.get());

        System.out.println(getActualYearInt.getAsInt());
    }
}
