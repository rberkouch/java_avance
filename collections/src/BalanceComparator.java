import java.util.Comparator;

public class BalanceComparator implements Comparator<BankAccount2> {
    @Override
    public int compare(BankAccount2 bankAccount21, BankAccount2 bankAccount22) {
        if (bankAccount21.getBalance()>bankAccount22.getBalance())
            return 1;
        else if (bankAccount21.getBalance()<bankAccount22.getBalance())
            return -1;
        else return 0;
    }
}
