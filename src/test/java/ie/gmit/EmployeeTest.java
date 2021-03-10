package ie.gmit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {

    private Employee e1;

    @BeforeEach
    void init(){e1= new Employee("Mr", "Patrick", "123456", 1111111, "Part-time", 53);}

    @Test
    public void testEmployeeCreateSuccess(){
        Employee employee = e1;
        assertEquals(employee, e1);
    }

    @Test
    public void testConstructorTitleFail(){
        Exception e = assertThrows(IllegalArgumentException.class, () ->
                new Employee("Sir", "Patrick", "123456", 1111111, "Part-time", 53));
        assertEquals("Invalid title", e.getMessage());
    }

    @Test
    public void testConstructorNameFail(){
        Exception e = assertThrows(IllegalArgumentException.class, () ->
                new Employee("Mr", "J", "123456", 1111111, "Part-time", 53));
        assertEquals("Invalid name", e.getMessage());
    }

    @Test
    public void testConstructorIDFail(){
        Exception e = assertThrows(IllegalArgumentException.class, () ->
                new Employee("Mr", "Patrick", "1234", 1111111, "Part-time", 53));
        assertEquals("Invalid PPS number", e.getMessage());
    }

    @Test
    public void testConstructorPhoneFail(){
        Exception e = assertThrows(IllegalArgumentException.class, () ->
                new Employee("Mr", "Patrick", "123456", 2345, "Part-time", 53));
        assertEquals("Invalid phone number", e.getMessage());
    }

    @Test
    public void testConstructorEmploymentFail(){
        Exception e = assertThrows(IllegalArgumentException.class, () ->
                new Employee("Mr", "Patrick", "123456", 1111111, "Intern", 53));
        assertEquals("Invalid employment type", e.getMessage());
    }

    @Test
    public void testConstructorAgeFail(){
        Exception e = assertThrows(IllegalArgumentException.class, () ->
                new Employee("Mr", "Patrick", "123456", 1111111, "Part-time", 13));
        assertEquals("Invalid age", e.getMessage());
    }

}
