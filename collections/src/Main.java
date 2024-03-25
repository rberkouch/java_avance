public class Main {
    public static void main(String[] args) {
        GenericList<Integer> list = new GenericList<>();
       list.add(1);
       list.add(2);
       list.add(3);
        for (var item : list) {
            System.out.println(item);
        }
        // [1,2,3]
        var iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}