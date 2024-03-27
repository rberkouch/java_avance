package _01_Streams;

import _12_groupement_element.BankAccountType;

public class BankAccount {
    private String holder;
    private double balance;

    private BankAccountType bankAccountType;

    public BankAccount(String holder, double balance, BankAccountType bankAccountType) {
        this.holder = holder;
        this.balance = balance;
        this.bankAccountType = bankAccountType;
    }

    public BankAccount(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public BankAccountType getBankAccountType() {
        return bankAccountType;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "holder='" + holder + '\'' +
                ", balance=" + balance +
                ", bankAccountType=" + bankAccountType +
                '}';
    }
}
