import POJOS.Employee;
import assignment.EmployeeOperation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class TestEmployee {
    Employee employee;
    Employee employee2;
    Employee employee3;
    EmployeeOperation employeeOperation;
   @Before
   public void setUp(){
        employee = new Employee();
        employee2 = new Employee();
       employeeOperation = new EmployeeOperation();
   }
    @Test
    public void checkEmployeeSame(){
        Assert.assertNotSame(employee, employee2);

    }

    @Test
    public void checkNull(){
        System.out.println(employee);
        Assert.assertNull(employee3);

    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();


    @Test
    public void checkExeption(){
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Employee object is Empty");
        employeeOperation.checkNullEmployee(employee3);



    }

}
