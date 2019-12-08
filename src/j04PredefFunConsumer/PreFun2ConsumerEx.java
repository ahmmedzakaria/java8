/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j04PredefFunConsumer;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author ODDUU
 */
class Student{
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    
}
public class PreFun2ConsumerEx {
    public static void main(String[] args) {
        Student[] sArr={
                        new Student("Johir", 54),
                        new Student("Billal", 69),
                        new Student("Emon", 83),
                        new Student("Hasib", 24),
                        new Student("Kamal", 44),
                        new Student("Shamsul", 34),
                        new Student("Parves", 77)
                        };
        Function<Student,String> f=s->{
            String grade="Grade: ";
            if(s.marks>=80)
                grade+="A+";
            else if(s.marks>=80)
                grade+="A";
            else if(s.marks>=60)
                grade+="A-";
            else if(s.marks>=50)
                grade+="B";
            else if(s.marks>=40)
                grade+="C";
            else if(s.marks>=33)
                grade+="D";
            else
                grade+="F";
            return grade;
        };
        Predicate<Student> p=s->s.marks>=60;
        Consumer<Student> c=s->{
        System.out.println("Name: "+s.name);
                System.out.println("Marks: "+s.marks);
                System.out.println("Grade: "+f.apply(s));
                System.out.println("\n");};
        for (Student s : sArr) {
            if(p.test(s)){
                c.accept(s);
            }
        }
    }
}
