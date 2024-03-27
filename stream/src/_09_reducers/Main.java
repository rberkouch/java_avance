package _09_reducers;

import _01_Streams.BankAccount;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> bankAccounts = List.of(
                new BankAccount("A",50),
                new BankAccount("B",80),
                new BankAccount("C",-80),
                new BankAccount("D",-80)
        );

        var result = bankAccounts
                .stream()
                .count();
        System.out.println(result);

        var result2 = bankAccounts
                .stream()
                .anyMatch(bankAccount -> bankAccount.getBalance()>0);
        System.out.println(result2);

        var result3 = bankAccounts
                .stream()
                .allMatch(bankAccount -> bankAccount.getBalance()>0);
        System.out.println(result3);

        var result4 = bankAccounts
                .stream()
                .noneMatch(bankAccount -> bankAccount.getBalance()>0);
        System.out.println(result4);



        var result5 = bankAccounts
                .stream()
                .findFirst()
                .get()
                .getHolder();
        System.out.println(result5);


        var result6 = bankAccounts
                .stream()
                .max(Comparator.comparingDouble(BankAccount::getBalance))
                        .get()
                .getHolder();
        System.out.println(result6);

        var result7 = bankAccounts
                .stream()
                .min(Comparator.comparingDouble(BankAccount::getBalance))
                .get()
                .getHolder();
        System.out.println(result7);
    }
}
