import java.io.IOException;

public class BankAccount {
    private double balance;

    public void deposit(double amount) throws BankAccountException {
//
        if (amount <=0) { // defensive programing
            // throw new IllegalArgumentException(); // unchecked
            // throw new IOException();
         //   throw new InvalidAmountException();
//            BankAccountException bankAccountException = new BankAccountException();
//            InvalidAmountException invalidAmountException = new InvalidAmountException();
//            bankAccountException.initCause(invalidAmountException);
     //       throw bankAccountException;
            throw new BankAccountException(new InvalidAmountException());
        }
        balance+=amount;
    }
}
