import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainComprator {
    public static void main(String[] args) {
        List<BankAccount2> bankAccounts = new ArrayList<>();
        bankAccounts.add(new BankAccount2("Jack",120.00,"email3"));
        bankAccounts.add(new BankAccount2("Cristophe", 300,"email2"));
        bankAccounts.add(new BankAccount2("Alice",600,"email1"));

//        Collections.sort(bankAccounts);
//        Collections.sort(bankAccounts,new EmailComparator());
        Collections.sort(bankAccounts,new BalanceComparator());
        System.out.println(bankAccounts);
    }
}
