package collection.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {
        List<Employee> emplist = new ArrayList<>();
        emplist.add(new Employee(100, "Sita"));
        emplist.add(new Employee(101, "Ram"));
        emplist.add(new Employee(102, "Krishna"));
        emplist.add(new Employee(103, "Radha"));

        Collections.sort(emplist);
        emplist.forEach(System.out::println);
    }
}
