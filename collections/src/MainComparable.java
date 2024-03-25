import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainComparable {
    public static void main(String[] args) {
        List<BankAccount> bankAccounts = new ArrayList<>();
        bankAccounts.add(new BankAccount("Jack"));
        bankAccounts.add(new BankAccount("Cristophe"));
        bankAccounts.add(new  BankAccount("Alice"));

        Collections.sort(bankAccounts);
        System.out.println(bankAccounts);
    }
    }
