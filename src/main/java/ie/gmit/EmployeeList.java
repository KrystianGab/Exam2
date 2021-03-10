package ie.gmit;

import java.util.ArrayList;

public class EmployeeList {
    private ArrayList<Employee> list =new ArrayList<>();
    private int entries;

    public void addEmployee(Employee e){
        if (list.contains(e)==false){
            list.add(e);
        }else{
            throw new IllegalArgumentException("Duplicate Employee details found, no object added");
        }
    }

    public int getListSize(){
        list.forEach((n) -> entries++);
        return entries;
    }

}
