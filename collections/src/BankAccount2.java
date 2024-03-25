public class BankAccount2 implements Comparable<BankAccount2>{
    private String holder;
    private double balance;
    private String email;

    public BankAccount2(String holder) {
        this.holder = holder;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public String getEmail() {
        return email;
    }

    public BankAccount2(String holder, double balance, String email) {
        this.holder = holder;
        this.balance = balance;
        this.email = email;
    }

    @Override
    public int compareTo(BankAccount2 other) {
        // this < other -> -1
        // this = other -> 0
        // this > other -> 1
        return holder.compareTo(other.holder);
    }

    @Override
    public String toString() {
        return holder;
    }
}
