import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainCollection {
    public static void main(String[] args) {
        Collection<Integer> myCollection = new ArrayList<>();
//        myCollection.add(1);
//        myCollection.add(2);
//        myCollection.add(3);
//        myCollection.remove(2);
//        myCollection.clear();
//        myCollection.size();
//        myCollection.isEmpty();
//      var result =  myCollection.contains(3);
//        Object[] myArray = myCollection.toArray();
//        Integer[] myArrayInt = myCollection.toArray(new Integer[3]);
        System.out.println(myCollection);
        Collections.addAll(myCollection,1,2,3);

        Collection<Integer> other = new ArrayList<>();
        other.addAll(myCollection);
        System.out.println(myCollection==other);
        System.out.println(myCollection.equals(other));
    }
}
