import java.io.IOException;

public class MyBankApplication {


    public static  void start() throws BankAccountException {
        BankAccount bankAccount = new BankAccount();

        try {
            bankAccount.deposit(-80);
       // } catch (IOException | InvalidAmountException e) {
        } catch (BankAccountException e) {
            //System.out.println("invalid amount");
          //  System.out.println("Logging");
           // throw e;
            e.printStackTrace();
            System.out.println(e.getCause().getMessage());
        }
    }
}
