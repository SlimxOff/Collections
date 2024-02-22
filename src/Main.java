import Lists.MyArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arr;
        MyArrayList<String> list = new MyArrayList<>(10);
        list.add("2");
        list.add("2");
        list.add("2");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        System.out.println(list.size());

        MyArrayList<Integer> list1 = new MyArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println(list1.get(1));
    }
}