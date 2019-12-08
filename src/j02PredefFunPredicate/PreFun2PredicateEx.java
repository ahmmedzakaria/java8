/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j02PredefFunPredicate;

import java.util.function.Predicate;

/**
 *
 * @author ODDUU
 */
class Employee{
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
}
public class PreFun2PredicateEx {
    public static void main(String[] args) {
        Employee e1=new Employee(123,"Jamal",34000);
        Employee e2=new Employee(121,"Rimel",40000);
        
        Predicate<Employee> p=e->e.salary>35000;
        System.out.println(p.test(e1));
        System.out.println(p.test(e2));
    }
}
