import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(4);
        set.add(1);
        set.add(4);
        System.out.println(set);

        List<Integer> list = Arrays.asList(1,2,4,4);
        Set<Integer> set2 = new HashSet<>(list);
        System.out.println(set2);

        Set<Integer> set3 = new HashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> set4 = new HashSet<>(Arrays.asList(3,4,5,6));

        //set3.addAll(set4); //union
        // intersection
        //set3.retainAll(set4);
        set3.removeAll(set4); // on garde que ce qui est différent
        System.out.println(set3);
    }
}
