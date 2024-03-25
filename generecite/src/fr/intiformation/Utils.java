package fr.intiformation;

public class Utils {
//    public static int min(int first, int second){
//        return (first<second)?first:second;
//    }

    public static <T extends Comparable<T>> T min(T first, T second){
        return (first.compareTo(second) < 0)?first:second;
    }

    public static <K,V> void printKeyValue(K key, V value){
        System.out.println(key+" = "+value);
    }

    public static void printBankAcount(BankAccount bankAccount){
        System.out.println(bankAccount);
    }

/*    public static void printBankAcounts(GenericListComparable<BankAccount> bankAccount){

    }*/
/*public static void printBankAcounts(GenericListComparable<?> bankAccount){
// solution trop permissive
}*/

//    public static void printBankAcounts(GenericListComparable<? extends BankAccount> bankAccount){
//// solution trop permissive
//    }

    public static void printBankAcounts(GenericListComparable<? super BankAccount> bankAccount){
// solution trop permissive
    }
}
