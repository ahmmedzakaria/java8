/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j02PredefFunPredicate;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 *
 * @author ODDUU
 */
class Student{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name=name;
    }

    @Override
    public String toString() {
        return id+": "+name;
    }
    
}
public class PreFun4PredicateEx {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList();
        list.add(new Student(103,"Robin"));
        list.add(new Student(13,"Shisir"));
        list.add(new Student(134,"Nabil"));
        list.add(new Student(112,"Momin"));
        list.add(new Student(12,"Rofiqul"));
        
        Predicate<Student> p=s->s.id>100 ;
        for (Student s : list) {
            if(p.test(s))
                System.out.println(s.toString());
        }
    }
}
