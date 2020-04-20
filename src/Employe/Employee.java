package Employe;

public class Employee {
    String fistName;
    String lastName;
    int salary;

    public Employee() {
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String fistName, String lastName, int salary) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.salary = salary;

    }

}
