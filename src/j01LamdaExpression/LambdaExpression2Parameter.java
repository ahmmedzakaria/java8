/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j01LamdaExpression;

/**
 *
 * @author User
 */

@FunctionalInterface
interface Calculateable{
    void sum(int a, int b);
}
public class LambdaExpression2Parameter {
    public static void main(String[] args) {
        Calculateable c = (a,b)->System.out.println("The Sum Is: "+(a+b));
        //Calculateable c1=(a,b)->a+b;
        c.sum(6, 9);
    }
}
