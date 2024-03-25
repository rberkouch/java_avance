package fr.intiformation;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(Utils.min(8,6));

        System.out.println(Utils.min(new BankAccount(18),new BankAccount(36)));

        Utils.printKeyValue("number",8);
    }
}
