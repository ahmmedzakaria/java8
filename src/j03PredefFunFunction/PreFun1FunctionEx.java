/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j03PredefFunFunction;

import java.util.function.Function;

/**
 *
 * @author ODDUU
 */
public class PreFun1FunctionEx {
    public static void main(String[] args) {
        Function<String, Integer> flength=s->s.length();        
        Function<String, String> fuppercase=s->s.toUpperCase();
        System.out.println(flength.apply("Zakaria Ahmmed"));
        System.out.println(fuppercase.apply("Zakaria Ahmmed"));
    }
}
