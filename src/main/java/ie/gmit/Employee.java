package ie.gmit;

public class Employee {

    private String title;
    private String name;
    private String ID;
    private int  phone;
    private String employment;
    private int age;

    public Employee(String title, String name, String ID, int phone, String employment, int age){
        setTitle(title);
        setName(name);
        setID(ID);
        setPhone(phone);
        setEmployment(employment);
        setAge(age);
    }


    public void setTitle(String title) {
        if ((title == "Mr") || (title == "Miss") || (title == "Mrs")) {
            this.title = title;
        }
        else{
            throw new IllegalArgumentException("Invalid title");
        }
    }


    public void setName(String name) {
        if ((name.length()>=5)&&(name.length()<=22)) {
            this.name = name;
        }
        else {
            throw new IllegalArgumentException("Invalid name");
        }
    }

    public void setID(String ID) {
        if (ID.length()==6) {
            this.ID = ID;
        }
        else {
            throw new IllegalArgumentException("Invalid PPS number");
        }
    }

    public void setPhone(int phone) {
        if ((phone>=1000000)&&(phone<=9999999)) {
            this.phone = phone;
        }
        else {
            throw new IllegalArgumentException("Invalid phone number");
        }
    }

    public void setEmployment(String employment) {
        if ((employment == "Full-time") || (employment=="Part-time")) {
            this.employment = employment;
        }
        else {
            throw new IllegalArgumentException("Invalid employment type");
        }
    }

    public void setAge(int age) {
        if (age>=18) {
            this.age = age;
        }
        else {
            throw new IllegalArgumentException("Invalid age");
        }
    }
}
