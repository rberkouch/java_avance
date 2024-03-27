package _08_observation_elements;

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
//        bankAccounts
//                .stream()
//                .filter(bankAccount -> bankAccount.getBalance()>0)
//                .map(BankAccount::getHolder)
//                .forEach(System.out::println);

        bankAccounts
                .stream()
                .filter(bankAccount -> bankAccount.getBalance()>0)
                .peek(bankAccount -> {
                    System.out.println("Filter: " + bankAccount.getHolder());
                })
                .map(BankAccount::getHolder)
                .peek(holder -> System.out.println("Map: " + holder))
                .forEach(System.out::println);

                // difference entre peek et forEach (forEach ne retourne rien)







    }
}
