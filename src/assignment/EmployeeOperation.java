package assignment;

import POJOS.Employee;

public class EmployeeOperation {


    public void checkNullEmployee(Employee emp) {

            if (emp == null)
                throw new NullPointerException("Employee object is Empty");

    }
}
