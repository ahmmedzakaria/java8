/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j06PredefFunBi;

import java.util.function.BiConsumer;

/**
 *
 * @author ODDUU
 */
class Employee{
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name+": "+salary;
    }
}
public class PreFun1BiConsumer {
    public static void main(String[] args) {
        BiConsumer<Employee,Double> bc=(e,salInc)->e.salary+=salInc;
        Employee e=new Employee("Mofijul",45000);
        bc.accept(e, 1005d); //Increment salary
        System.out.println(e);
    }
}
