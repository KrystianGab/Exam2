package ie.gmit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmployeeListTest {

    private Employee e1;

    @BeforeEach
    void init(){e1= new Employee("Mr", "Patrick", "123456", 1111111, "Part-time", 53);}


    @Test
    public void testAddEmployeeSuccess(){
        EmployeeList employeeList = new EmployeeList();
        employeeList.addEmployee(e1);
    }

    @Test
    public void testAddEmployeeFailure(){
        EmployeeList employeeList = new EmployeeList();
        employeeList.addEmployee(e1);
        Exception e = assertThrows(IllegalArgumentException.class, () ->
                employeeList.addEmployee(e1));
        assertEquals("Duplicate Employee details found, no object added", e.getMessage());
    }

    @Test
    public void testGetListSize(){
        EmployeeList employeeList = new EmployeeList();
        int numbers = employeeList.getListSize();
        assertEquals(0, numbers);
    }

}


