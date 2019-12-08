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
public class PreFun6PredicateEx_or {
    public static void main(String[] args) {
       int[] arr={2,45,12,8,13,80,23,5,10,7};
       
       Predicate<Integer> p1=i->i%2==0;
       Predicate<Integer> p2=i->i>=10;
       
        for (int i : arr) {
            if(p1.or(p2).test(i))
                System.out.println(i);
        }
    }
}
