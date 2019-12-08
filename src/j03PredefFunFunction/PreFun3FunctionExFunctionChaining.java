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
public class PreFun3FunctionExFunctionChaining {
    public static void main(String[] args) {
        Function<Integer,Integer> f1=i->i*2;
        Function<Integer,Integer> f2=i->i*i*i;
        //First it call f1.apply(i) then f2.apply(return value of f1)
        System.out.println(f1.andThen(f2).apply(2));
        //First it call f2.apply(i) then f1.apply(return value of f1)
        System.out.println(f1.compose(f2).apply(2));
        
        
        //We can Chain multifunction with function chaining
        //f1.andThen(f2).andThen(f3).apply(i);

    }
}
