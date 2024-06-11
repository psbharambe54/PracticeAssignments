package collection.comparator;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(0,30);
        list.forEach(System.out::println);
        System.out.println();

        List<Integer> list1 = new ArrayList<>();

        list1.add(50);
        list1.add(60);
        System.out.println(list1.addAll(0,list));
        System.out.println(list1);


    }
}
