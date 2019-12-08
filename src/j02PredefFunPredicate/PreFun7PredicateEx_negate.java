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
public class PreFun7PredicateEx_negate {
     public static void main(String[] args) {
       int[] arr={2,45,12,8,13,80,23,5,10,7};
       
       Predicate<Integer> p1=i->i%2==0;
         System.out.println("Even Numbers");
        for (int i : arr) {
            if(p1.test(i))
                System.out.println(i);
        }
        System.out.println("Odd Numbers");
        for (int i : arr) {
            if(p1.negate().test(i))
                System.out.println(i);
        }
    }
}
