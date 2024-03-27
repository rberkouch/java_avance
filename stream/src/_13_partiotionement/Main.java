package _13_partiotionement;

import _01_Streams.BankAccount;
import _12_groupement_element.BankAccountType;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> bankAccounts = List.of(
                new BankAccount("A",50, BankAccountType.SAVINGS),
                new BankAccount("B",80,BankAccountType.CURRENT),
                new BankAccount("C",-80,BankAccountType.SAVINGS),
                new BankAccount("D",-80,BankAccountType.CURRENT)
        );

        var result = bankAccounts
                .stream()
                .collect(Collectors.partitioningBy(b->b.getBalance()>0));
        System.out.println(result);

        var result2 = bankAccounts
                .stream()
                .collect(Collectors.partitioningBy(b->b.getBalance()>0,
                        Collectors.mapping(b->b.getHolder(),Collectors.joining(", "))));
        System.out.println(result2);
    }
}
