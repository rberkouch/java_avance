package _01_Streams;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<BankAccount> bankAccounts = List.of(
                new BankAccount("A",50),
                new BankAccount("B",80),
                new BankAccount("C",-80)
        );

        //Imperative -> How
        var count1 = 0;
        for (var bankAccount : bankAccounts){
            if (bankAccount.getBalance()<0)
                count1++;
        }

        // Declarative ou fonctionnel -> What (comme le sql) stream sert à ça, c'est un séqunseur d'objet qui permet d'extraire de la donnée
        var count2 = bankAccounts.stream().filter(bankAccount -> bankAccount.getBalance() < 0).count();

        System.out.println(count2);
    }
}
