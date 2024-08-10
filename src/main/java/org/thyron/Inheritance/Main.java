package org.thyron.Inheritance;

import org.thyron.Polymorphism.Parent;
import org.thyron.Polymorphism.Subclass1;
import org.thyron.Polymorphism.Subclass2;

class Employee
{
    int salary=40000;
}
class Engineer extends Employee
{
    int benefits=2000;
}

public class Main {
    public static void main(String[] args) {
       Engineer e1=new Engineer();
       System.out.println(e1.salary);
        System.out.println(e1.benefits);

        Employee e2=new Employee();
        System.out.println(e2.salary);

        Employee e3=new Engineer();
        System.out.println(e1.salary);
        System.out.println(e1.benefits);

    }
}