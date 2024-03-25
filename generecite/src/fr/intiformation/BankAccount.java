package fr.intiformation;

public class BankAccount implements Comparable<BankAccount>, Cloneable{

    
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public int compareTo(BankAccount bankAccount) {
        
        // this < bankAccount -> -1
        // this == bankAccount -> 0
        // this > bankAccount -> 1
//        if (balance < bankAccount.balance)
//            return -1;
//        else if (balance > bankAccount.balance)
//            return 1;
//         else
//            return 0;
        return (int) (balance - bankAccount.balance);

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}
