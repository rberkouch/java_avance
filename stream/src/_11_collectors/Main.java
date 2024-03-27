package _11_collectors;

import _01_Streams.BankAccount;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

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
                .filter(bankAccount -> bankAccount.getBalance()>0)
                .collect(Collectors.toList());

        var result2 = bankAccounts
                .stream()
                .filter(bankAccount -> bankAccount.getBalance()>0)
                .collect(Collectors.toSet());

        var result3 = bankAccounts
                .stream()
                .filter(bankAccount -> bankAccount.getBalance()>0)
                .collect(Collectors.toMap(b -> b.getHolder(),b->b.getBalance()));

        var result4 = bankAccounts
                .stream()
                .filter(bankAccount -> bankAccount.getBalance()>0)
                .collect(Collectors.toMap(BankAccount::getHolder, BankAccount::getBalance));

        var result5 = bankAccounts
                .stream()
                .filter(bankAccount -> bankAccount.getBalance()>0)
                .collect(Collectors.toMap(BankAccount::getHolder, b->b));

        var result6 = bankAccounts
                .stream()
                .filter(bankAccount -> bankAccount.getBalance()>0)
                .collect(Collectors.toMap(BankAccount::getHolder, Function.identity()));

        var result7 = bankAccounts
                .stream()
                .filter(bankAccount -> bankAccount.getBalance()>0)
                .collect(Collectors.summingDouble(BankAccount::getBalance));

        var result8 = bankAccounts
                .stream()
                .filter(bankAccount -> bankAccount.getBalance()>0)
                .collect(Collectors.summarizingDouble(BankAccount::getBalance));
        System.out.println(result8);

        var result9 = bankAccounts
                .stream()
                .filter(bankAccount -> bankAccount.getBalance()>0)
                .map(bankAccount -> bankAccount.getHolder())
            //   .collect(Collectors.joining()); chaine compact
                .collect(Collectors.joining(", "));
        System.out.println(result9);
    }
}
