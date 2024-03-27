package _10_reductions;

import _01_Streams.BankAccount;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> bankAccounts = List.of(
                new BankAccount("A",50),
                new BankAccount("B",80),
                new BankAccount("C",-80),
                new BankAccount("D",-80)
        );

        // [50,80,-80,-80]
        // [130,-80,-80] on parle d'acumulateur
        var result = bankAccounts
                .stream()
                .map(bankAccount -> bankAccount.getBalance())
                .reduce((a,b)->a+b)
                .get();
        System.out.println(result);

        var result2 = bankAccounts
                .stream()
                .map(bankAccount -> bankAccount.getBalance())
                .reduce(Double::sum)
                .get();
        System.out.println(result2);


    }
}
