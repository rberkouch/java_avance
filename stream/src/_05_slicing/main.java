package _05_slicing;

import _01_Streams.BankAccount;

import java.util.List;

public class main {
    public static void main(String[] args) {
        List<BankAccount> bankAccounts = List.of(
                new BankAccount("A",50),
                new BankAccount("B",80),
                new BankAccount("C",-80),
                new BankAccount("D",-80)
        );

        // 1 limit
        bankAccounts
                .stream()
                .limit(2)
                .forEach(System.out::println);

        // 2 skip
        bankAccounts
                .stream()
                .skip(2)
                .forEach(System.out::println);

        // 3 take tant que
        bankAccounts
                .stream()
                .takeWhile(bankAccount -> bankAccount.getBalance()>0)// se stop dès qu'il trouve un élément alors que le filter non
                .forEach(System.out::println);

        // 4 skip tant que
        bankAccounts
                .stream()
                .dropWhile(bankAccount -> bankAccount.getBalance()>0)// se stop dès qu'il trouve un élément alors que le filter non
                .forEach(System.out::println);
    }
}
