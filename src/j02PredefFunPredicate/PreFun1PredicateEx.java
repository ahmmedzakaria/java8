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
public class PreFun1PredicateEx {
    public static void main(String[] args) {
        //We can use predicate for conditional check
        Predicate<Integer> p = i->i%2==0;
        
        System.out.println(p.test(5));
        System.out.println(p.test(10));
    }
}
