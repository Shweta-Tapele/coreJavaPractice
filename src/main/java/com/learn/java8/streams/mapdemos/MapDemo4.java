package com.learn.java8.streams.mapdemos;


import java.util.Arrays;
import java.util.List;

class Employee
{
    int id;
    String employee_name;
    int salary;


    Employee(int id, String employee_name, int salary)
    {
        this.id= id;
        this.employee_name= employee_name;
        this.salary= salary;
    }



}
public class MapDemo4 {
    public static void main(String[] args) {
        List<Employee> employeeList= Arrays.asList(
                new Employee(1,"John",30000)
        );
    }
}
