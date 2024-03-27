package _04_filtre;

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

      bankAccounts
                .stream()
                .filter(bankAccount -> bankAccount.getBalance()<0)
                .map(bankAccount -> bankAccount.getHolder())
                .forEach(System.out::println);
    }
}
