package EmployeeInfo;

import Employe.Employee;

import java.util.Scanner;

public class EmloyeeArrays {
    public static void main(String[] args) {
        Employee employee = new Employee();

        String [] arraysFirstName = new String[2];
        arraysFirstName[0] = employee.setFistName();
        arraysFirstName[1] = employee.setFistName();

        String [] arraysLastName = new String[2];
        arraysLastName[0] = employee.setLastName();
        arraysLastName[1] = employee.setLastName();

        int [] arraySalary = new int[2];
        arraySalary[0] = employee.setSalary();
        arraySalary[1] = employee.setSalary();

        Scanner arraysScan = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String name = arraysScan.nextLine();
        arraysScan.close();










    }
}
