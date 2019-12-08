/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j06PredefFunBi;

import java.util.function.BiFunction;

/**
 *
 * @author ODDUU
 */
class Student{
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return name+": "+id;
    }
    
    
}
public class PreFun1BiFunction {
    public static void main(String[] args) {
        BiFunction<String,Integer,Student> bf=(name,id)->new Student(name,id);
        System.out.println(bf.apply("Sorif", 123).toString());;
    }
    
}
