/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j01LamdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author User
 */
public class LambdaExpression5Comparator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer> ();
        list.add(5);
        list.add(25);
        list.add(50);
        list.add(23);
        list.add(12);
        list.add(90);
        list.add(3);
        
        System.out.println("Before Sort \n"+list);
        
        Comparator<Integer> c=(i1,i2)->(i1<i2)?-1:(i1>i2)?1:0;
        Collections.sort(list, c);
        System.out.println("After Sort \n"+list);
        list.stream().forEach(System.out::println);
        
        /**
         * Int (Object obj1, Object obj2)
         * Return -ve iff obj1 has to come before obj2
         * Return +ve iff obj1 has to come after obj2
         * Return 0 iff obj1 and obj2 are equal
         * 
         */
    }
}
