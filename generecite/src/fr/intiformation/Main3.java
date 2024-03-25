package fr.intiformation;

import jdk.jshell.execution.Util;

public class Main3 {
    public static void main(String[] args) {
        BankAccount  bankAccount1 = new SavingsAccount(50);
        Utils.printBankAcount(bankAccount1);
        Utils.printBankAcounts(new GenericListComparable<BankAccount>());
        //Utils.printBankAcounts(new GenericListComparable<String>());
       // Utils.printBankAcounts(new GenericListComparable<SavingsAccount>());
    }


}
