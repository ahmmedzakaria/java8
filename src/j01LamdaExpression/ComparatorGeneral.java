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
class MyComparator implements Comparator<Integer>{

//    @Override
//    public int compare(Integer i1, Integer i2) {
//        if(i1<i2)
//            return -1;
//        else if(i1>i2)
//            return 1;
//        else
//            return 0;
//    }
    
   @Override
    public int compare(Integer i1, Integer i2) {
        return (i1<i2)?-1:(i1>i2)?1:0;
    }

}
public class ComparatorGeneral {
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
        
        MyComparator c =new MyComparator();
        Collections.sort(list,c);
        System.out.println("After Sort \n"+list);
    }
    
    /**
         * Int (Object obj1, Object obj2)
         * Return -ve iff obj1 has to come before obj2
         * Return +ve iff obj1 has to come after obj2
         * Return 0 iff obj1 and obj2 are equal
         * 
         */
}
