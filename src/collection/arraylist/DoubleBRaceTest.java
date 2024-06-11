package collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class DoubleBRaceTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(){{

            add("Apple");
            add("Mango");
            add("Pipeapple");

        }};

        list.forEach(System.out::println);
        System.out.println('a'+'b');
    }
}
