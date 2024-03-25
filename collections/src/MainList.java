import java.util.ArrayList;
import java.util.List;

public class MainList {
    public static void main(String[] args) {
        List<String> myCollection = new ArrayList<>();
        myCollection.add("A");
        myCollection.add("B");
        myCollection.add("C");
        System.out.println(myCollection);
        myCollection.add(0,"D");
        System.out.println(myCollection);
        System.out.println(myCollection.get(0));
        myCollection.set(1,"F");
        System.out.println(myCollection);
        myCollection.remove(1);
        myCollection.remove("C");
        System.out.println(myCollection);
        myCollection.add("D");
        System.out.println(myCollection.indexOf("D"));
        System.out.println(myCollection.lastIndexOf("D"));
        System.out.println(myCollection);
        System.out.println(myCollection.subList(0,2));
    }
}
