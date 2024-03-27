package _07_differencier_dans_stream;

import _01_Streams.BankAccount;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> bankAccounts = List.of(
                new BankAccount("A",50),
                new BankAccount("A",80),
                new BankAccount("C",-80),
                new BankAccount("D",-80),
                new BankAccount("D",-80)
        );

        bankAccounts
                .stream()
                .forEach(bankAccount -> System.out.println(bankAccount.getHolder()));  // redondandance


        bankAccounts
                .stream()
                .map(BankAccount::getHolder)
                .distinct()
                .forEach(System.out::println);


    }


}
