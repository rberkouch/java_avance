package _12_groupement_element;

import _01_Streams.BankAccount;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> bankAccounts = List.of(
                new BankAccount("A",50,BankAccountType.SAVINGS),
                new BankAccount("B",80,BankAccountType.CURRENT),
                new BankAccount("C",-80,BankAccountType.SAVINGS),
                new BankAccount("D",-80,BankAccountType.CURRENT)
        );


        // par défaut une list
        var result = bankAccounts
                .stream()
                .collect(Collectors.groupingBy(BankAccount::getBankAccountType));
        System.out.println(result);


        var result2 = bankAccounts
                .stream()
                .collect(Collectors.groupingBy(BankAccount::getBankAccountType,Collectors.toSet()));
        System.out.println(result2);


        var result3 = bankAccounts
                .stream()
                .collect(Collectors.groupingBy(BankAccount::getBankAccountType,Collectors.counting()));
        System.out.println(result3);

        var result4 = bankAccounts
                .stream()
                .collect(Collectors
                        .groupingBy(BankAccount::getBankAccountType,
                                Collectors.mapping(b->b.getHolder(),Collectors.joining(", "))));
        System.out.println(result4);




    }
}
