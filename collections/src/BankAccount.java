public class BankAccount implements Comparable<BankAccount>{
    private String holder;

    public BankAccount(String holder) {
        this.holder = holder;
    }

    @Override
    public int compareTo(BankAccount other) {
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
