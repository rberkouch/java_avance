package _06_trier_stream;

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

        bankAccounts
                .stream()
                .sorted((a,b) -> Double.compare(a.getBalance(),b.getBalance()))
                .forEach(bankAccount -> System.out.println(bankAccount.getHolder()));


        bankAccounts
                .stream()
                .sorted(Comparator.comparingDouble(BankAccount::getBalance))
                .forEach(bankAccount -> System.out.println(bankAccount.getHolder()));
    }
}
