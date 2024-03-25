package fr.intiformation;

// T pour type ou bien Template
// E pour element par ex
public class GenericListNumber<T extends Number>{

    private T[] items = (T[]) new Object[5];
    private int count;


    public void add(T item){
        items[count++]=item;
    }

    public T get(int index){
        return items[index];
    }
}
