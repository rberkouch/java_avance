package fr.intiformation;

public class Main {
    public static void main(String[] args) {

/*        List myList = new List();
        myList.add(5);.
        myList.add("45");
        myList.add(new BankAccount());
        myList.add(new BankAccountList());*/
        // list trop permissive

//        int x = (int)myList.get(0); // conversion verbeux indicateur de mauvaise pratique et
        // incompatibilité lors de la compilation


/*      var myList =  new GenericList<String>();
            myList.add("hello");
        String ch = myList.get(0);

        var myList2 =  new GenericList<BankAccount>();
        myList2.add(new BankAccount());
        BankAccount ba = myList2.get(0);*/

        // generecite prend les reference pas les types primitifs

       // GenericList<doule> myList = new GenericList<>();

        GenericList<Double> myList = new GenericList<>();

//        new GenericListNumber<String>();
       // new GenericListNumber<Float>();


       // new GenericListComparable<BankAccount>();
        //new GenericListComparable<Integer>();
        //new GenericListComparable<BankAccount>();

        BankAccount bankAccount1 = new BankAccount(15);
        BankAccount bankAccount2 = new BankAccount(30);

        if (bankAccount1.compareTo(bankAccount2)<0)
            System.out.println("bankAccount1 < bankAccount2");

        if (bankAccount1.compareTo(bankAccount2)==0)
            System.out.println("bankAccount1 == bankAccount2");

        if (bankAccount1.compareTo(bankAccount2)>0)
            System.out.println("bankAccount1 > bankAccount2");

    }
}