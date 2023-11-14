package com.learn.java8;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
        String name;
        double salary;

    public Employee(String name,double salary) {
        this.name = name;
        this.salary = salary;
    }
}
public class
ExamPredicate {

        public static void main(String[] args)
        {
            ArrayList<Employee> l= new ArrayList<>();
            l.add(new Employee("Shweta",8000));
            l.add(new Employee("Leo",9000));
            l.add(new Employee("Lee",3000));

            Predicate<Employee> p= a-> a.salary >5000;
            for(Employee e1: l)
            {
                if(p.test(e1)){
                    System.out.println(e1.name+" "+e1.salary);
                }
            }
        }

}


