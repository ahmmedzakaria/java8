/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j06PredefFunBi;

import java.util.function.BiPredicate;

/**
 *
 * @author ODDUU
 */
public class PreFun1BiPredicate {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> bp=(i1,i2)->(i1+i2)%2==0;
        
        System.out.println(bp.test(3, 26));
        System.out.println(bp.test(3, 57));
        System.out.println(bp.test(2, 4));
    }
}
