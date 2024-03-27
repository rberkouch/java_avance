package _03_Mapping_Element;

import _01_Streams.BankAccount;

import java.util.List;

public class main {
    public static void main(String[] args) {
     List<_01_Streams.BankAccount> bankAccounts = List.of(
                new _01_Streams.BankAccount("A",50),
                new _01_Streams.BankAccount("B",80),
                new BankAccount("C",-80)
        );

        // outpipe d'une pipe est l'input du pipe suivant
       // bankAccounts.stream().map(bankAccount -> bankAccount.getHolder()).forEach(System.out::println);

//        List<List<BankAccount>> bankAccounts = List.of(
//                List.of(
//                        new BankAccount("A",50),
//                        new BankAccount("B",80),
//                        new BankAccount("C",-80)
//                ),
//                List.of(
//                        new BankAccount("D",50),
//                        new BankAccount("E",80),
//                        new BankAccount("F",-80)
//                )
//
//        );

        bankAccounts
                .stream()
               // .flatMap(list ->list.stream())
                .map(bankAccount -> bankAccount.getHolder())
                .forEach(System.out::println);


    }



}
