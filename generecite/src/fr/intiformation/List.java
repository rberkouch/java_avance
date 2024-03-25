package fr.intiformation;

public class List {
    //private int[] items = new int[5];
    private Object[] items = new Object[5];
    private int count;

//    public void add(int item){
//        items[count++]=item;
//    }
    public void add(Object item){
        items[count++]=item;
    }

//    public int get(int index){
//        return items[index];
//    }
    public Object get(int index){
        return items[index];
    }


}
