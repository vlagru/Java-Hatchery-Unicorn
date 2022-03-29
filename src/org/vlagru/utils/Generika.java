package org.vlagru.utils;

public class Generika {

    public static void main(String[] args) {

        Create<Integer> create = new Create<>();
        create.pack(10);
        int number = create.getContent();
        System.out.println(number);

        Create<String> create1 = new Create<>();
        create1.pack("Ahoj");
        String s = create1.getContent();
        System.out.println(s);

    }
    // pouzivame i kvuli pretypovani
    // genericky typ u metody
    public  static <T> void printObject(T o) {
        System.out.println(o);
        //return o;
    }


}
//jako genericky datovy typ nelze pouzit primitivni datove typy
class Create<T> {
    private T obj;

    public void pack(T obj) {
        this.obj=obj;
    }

    public T getContent() {
        return obj;
    }
}