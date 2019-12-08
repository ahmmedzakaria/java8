/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j01LamdaExpression;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author User
 */
class Employee{
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return name+" : "+id;
    }
    
    
}
public class LambdaExpression6Compareable {
    public static void main(String[] args) {
        ArrayList<Employee> list =new ArrayList();
        list.add(new Employee(12421,"Rubel"));
        list.add(new Employee(12451,"Shamim"));
        list.add(new Employee(12411,"Rofiq"));
        list.add(new Employee(12401,"Habib"));
        list.add(new Employee(12491,"Jamal"));
        
        Collections.sort(list,(e1,e2)->e1.name.compareTo(e2.name));
        System.out.println(list);
    }
}
