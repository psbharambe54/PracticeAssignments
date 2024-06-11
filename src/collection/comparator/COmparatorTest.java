package collection.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class COmparatorTest {


    public static void main(String[] args) {
        List<Employee> emplist = new ArrayList<>();
        emplist.add(new Employee(100, "Sita"));
        emplist.add(new Employee(101, "Ram"));
        emplist.add(new Employee(102, "Krishna"));
        emplist.add(new Employee(101, "Krishna"));
        emplist.add(new Employee(103, "Radha"));
//        Comparator<Employee> noComparator = (e1,e2)-> Integer.compare(e1.getEmpno(),e2.getEmpno());

        Comparator<Employee> nameComparator = (Comparator.comparing(Employee::getEname).thenComparing(Employee::getEmpno));
        emplist.sort(nameComparator);

        emplist.forEach(System.out::println);


    }

}
