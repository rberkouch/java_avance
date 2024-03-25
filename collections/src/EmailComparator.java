import java.util.Comparator;

public class EmailComparator implements Comparator<BankAccount2> {
    @Override
    public int compare(BankAccount2 bankAccount21, BankAccount2 bankAccount22) {
        return bankAccount21.getEmail().compareTo(bankAccount22.getEmail());
    }
}
