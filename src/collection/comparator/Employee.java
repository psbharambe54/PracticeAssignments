package collection.comparator;

public class Employee implements Comparable<Employee>{

    int empno;
    String ename;

    public Employee(int empno, String ename) {
        this.empno = empno;
        this.ename = ename;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.empno, o.empno);
    }
}
