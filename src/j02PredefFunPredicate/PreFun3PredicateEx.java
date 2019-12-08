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
public class PreFun3PredicateEx {
    public static void main(String[] args) {
        String[] arr={"opu","labon", "arif", "sazzad", "dipu","Zakaria"};
        Predicate<String> p = s->s.length()>4;
        for (String s : arr) {
            if(p.test(s))
                System.out.println(s);
        }
        
    }
}
