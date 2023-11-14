package com.learn.java8.functionalinterfaces.defaultmethods;


import java.util.ArrayList;
import java.util.function.BiConsumer;

class Employee{


    String name;
    double salary;

    Employee(String name, double salary)
    {
        this.name= name;
        this.salary= salary;
    }

}
public class Test {
    public static void main(String[] args) {
        ArrayList<Employee>  l = new ArrayList<>();
        populate(l);
        BiConsumer<Employee,Double> c = (e,d)->e.salary+= d;

        for(Employee e :l)
        {
            c.accept(e,5000.0);
        }

        for(Employee e : l)
        {
            System.out.println("Employee Name"+ e.name);
            System.out.println("Employee Salary" + e.salary);

        }

    }

    public static void  populate(ArrayList<Employee> l)
    {
        l.add(new Employee("Shweta",100000.0));
        l.add(new Employee("Carlos",107000.0));
        l.add(new Employee("Charles",200000.0));
        l.add(new Employee("Jai",100000.0));
        l.add(new Employee("Kangara",100000.0));


    }



}
